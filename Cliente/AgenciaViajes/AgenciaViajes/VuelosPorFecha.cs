using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Net;
using System.IO;
using Newtonsoft.Json.Linq;
namespace AgenciaViajes
{
    public partial class VuelosPorFecha : Form
    {
        public VuelosPorFecha()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (resultados.RowCount != 0)
            {
                resultados.Rows.Clear();
            }
            try
            {
                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/consultarDestinoFecha");
                request.ContentType = "application/json";
                request.Method = "POST";
                string[] fechas = dateTimePicker1.Value.ToString().Split(' ');
                string fecha = fechas[0];
                Console.WriteLine(fecha);
                fechas = fecha.Split('/');
                string fechaFinal = fechas[2] + "/" + fechas[1] + "/" + fechas[0];
                string datos = "";
                datos += "{";
                datos += "\"localidad\" : \"" + fechaFinal + "\"";
                datos += "}";
                request.ContentLength = (long)datos.Length;
                StreamWriter body = new StreamWriter(request.GetRequestStream());
                Console.WriteLine(datos);
                body.Write(datos);
                body.Flush();
                body.Close();
                WebResponse response = (HttpWebResponse)request.GetResponse();
                Console.WriteLine("Content length is {0}", response.ContentLength);
                Console.WriteLine("Content type is {0}", response.ContentType);
                Stream receiveStream = response.GetResponseStream();
                StreamReader readStream = new StreamReader(receiveStream);
                Console.WriteLine("Response stream received.");
                string respuesta = readStream.ReadToEnd();
                Console.WriteLine("hola " + respuesta);
                response.Close();
                readStream.Close();

                var objects = JArray.Parse(respuesta);
                foreach (JObject root2 in objects[0])
                {
                    resultados.Rows.Add("1",root2["id"],root2["fecha"],root2["origen"], root2["destino"], root2["coste"], root2["plazas"]);
                    Console.WriteLine(root2["fecha"]);
                }
                foreach (JObject root2 in objects[1]["result"])
                {
                    resultados.Rows.Add("2",root2["id"], root2["fecha"], root2["origen"], root2["destino"], root2["coste"], root2["plazas"]);
                    Console.WriteLine(root2["fecha"]);
                }
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
           
        }

        private void resultados_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (resultados.CurrentRow == null)
                return;
            DataGridViewRow row = resultados.CurrentRow;
            int idAerolinea = Convert.ToInt32(row.Cells[0].Value.ToString());
            int idVuelo = Convert.ToInt32(row.Cells[1].Value.ToString());
            int plazas = Convert.ToInt32(asientos.Text);
            float precio=Convert.ToSingle(row.Cells[5].Value.ToString());
            string origen = row.Cells[3].Value.ToString();
            string destino = row.Cells[4].Value.ToString();
            string usuario = user.User;
            datosTarjeta d = new datosTarjeta();
            d.ShowDialog();


            try
            {
                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/reservarvuelo");
                request.ContentType = "application/json";
                request.Method = "POST";
                
                string datos = "";
                datos += "{";
                datos += "\"idAerolinea\" :"+idAerolinea +",";
                datos += "\"idVuelo\" :" + idVuelo + ",";
                datos += "\"idCliente\" :\"" + usuario + "\",";
                datos += "\"plazas\" : " + plazas;
                datos += "}";
                request.ContentLength = (long)datos.Length;
                StreamWriter body = new StreamWriter(request.GetRequestStream());
                Console.WriteLine(datos);
                body.Write(datos);
                body.Flush();
                body.Close();
                WebResponse response = (HttpWebResponse)request.GetResponse();
                Console.WriteLine("Content length is {0}", response.ContentLength);
                Console.WriteLine("Content type is {0}", response.ContentType);
                Stream receiveStream = response.GetResponseStream();
                StreamReader readStream = new StreamReader(receiveStream);
                Console.WriteLine("Response stream received.");
                string respuesta = readStream.ReadToEnd();
                Console.WriteLine("hola " + respuesta);
                response.Close();
                readStream.Close();
                factura.crearFactura(usuario, precio, "Pagada", "Aerolinea"+idAerolinea.ToString()+"Vuelo:"+origen+"-"+destino);
                if(respuesta=="true")
                {
                    DialogResult dialogResult = MessageBox.Show("¿Quieres reservar un hotel?", "ReservaHotel", MessageBoxButtons.YesNo);
                    if (dialogResult == DialogResult.Yes)
                    {
                        Hoteles hot = new Hoteles();
                        hot.ShowDialog();
                    }
                    else if (dialogResult == DialogResult.No)
                    {
                        //
                    }
                    DialogResult dialogResult2 = MessageBox.Show("¿Quieres contratar un traslado?", "ReservaTraslado", MessageBoxButtons.YesNo);
                    if (dialogResult2 == DialogResult.Yes)
                    {
                        Traslados tr = new Traslados();
                        tr.ShowDialog();
                    }
                    else if (dialogResult2 == DialogResult.No)
                    {
                        //do something else
                    }
                }

            }
            catch(Exception ex)
            {
               Console.WriteLine(ex.Message);
            }

            

        }

       

    }
}
