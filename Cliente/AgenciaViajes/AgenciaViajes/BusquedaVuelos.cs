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
using System.Web;
using Newtonsoft.Json.Linq;


namespace AgenciaViajes
{
    public partial class BusquedaVuelos : Form
    {
        public BusquedaVuelos()
        {
            InitializeComponent();
        }

        private void label4_Click(object sender, EventArgs e)
        {           

        }

        private void buscarButon_Click(object sender, EventArgs e)
        {
            if(resultados.RowCount != 0)
            {
                resultados.Rows.Clear();
            }


            try
            {

                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/disponivilidadVuelos");
                request.ContentType = "application/json";
                request.Method = "POST";
                string[] fechas = fechainicio.Value.ToString().Split(' ');
                string fecha = fechas[0];
                Console.WriteLine(fecha);
                fechas = fecha.Split('/');
                string fechaFinal = fechas[2] + "/" + fechas[1] + "/" + fechas[0];
                string datos = "";
                datos += "{";
                datos += "\"fecha\" : \"" + fechaFinal + "\",";
                datos += "\"orgien\" : \"" + origen.Text + "\",";
                datos += "\"destino\" : \"" + destino.Text + "\"";
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
                Console.WriteLine("Respuesta:" + respuesta);
                response.Close();
                readStream.Close();                
                var objects = JArray.Parse(respuesta);                
                foreach (JObject root2 in objects[0])
                {
                    resultados.Rows.Add(root2["fecha"], root2["hora"], root2["coste"], root2["plazas"]);
                    Console.WriteLine(root2["fecha"]);
                }
                foreach(JObject root2 in objects[1]["result"] )
                {
                    resultados.Rows.Add(root2["fecha"], root2["hora"], root2["coste"], root2["plazas"]);
                    Console.WriteLine(root2["fecha"]);
                }

                           
                Console.WriteLine("Hola "+objects[1]["result"][0]["fecha"]);

                
               
             
                    

                
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
            float precio=Convert.ToSingle(row.Cells[4].Value.ToString());
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
                datos += "\"idAerolinea\" :" + idAerolinea + ",";
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
                //insert a facturas
                factura.crearFactura(usuario, precio, "Pagada", "Aerolinea" + idAerolinea.ToString() + "Vuelo:" + origen.Text+"-"+destino.Text);
                if (respuesta == "true")
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
                    this.Hide();
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
