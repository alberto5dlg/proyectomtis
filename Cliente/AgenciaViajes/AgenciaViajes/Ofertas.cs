using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace AgenciaViajes
{
    public partial class Ofertas : Form
    {
        public Ofertas()
        {
            InitializeComponent();
            cargarDatos();
        }

        public void cargarDatos()
        {
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:3000/api/ofertas");
            request.ContentType = "application/json";
            request.Method = "GET";
           
            WebResponse response = (HttpWebResponse)request.GetResponse();
            Console.WriteLine("Content length is {0}", response.ContentLength);
            Console.WriteLine("Content type is {0}", response.ContentType);
            Stream receiveStream = response.GetResponseStream();
            StreamReader readStream = new StreamReader(receiveStream);
            Console.WriteLine("Response stream received.");
            var respuesta = readStream.ReadToEnd();
            Console.WriteLine("Respuesta:" + respuesta);
            var objects = JArray.Parse(respuesta);
            foreach (JObject root in objects)
            {
                if(root["contratado"].ToString().Equals(""))
                    resultados.Rows.Add(root["id"],root["precio"], root["tipoOferta"], root["detalle"], root["fechaInicio"], root["fechaFin"]);
            }
            
            response.Close();
            readStream.Close();
           
        }

        private void resultados_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (resultados.CurrentRow == null)
                return;
            DataGridViewRow row = resultados.CurrentRow;
            string id = row.Cells[0].Value.ToString();
            Console.WriteLine(id);
            string usuario = user.User;
            
            datosTarjeta d = new datosTarjeta();
            d.ShowDialog();
            
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:3000/api/ofertas/"+id);
            request.ContentType = "application/json";
            request.Method = "POST";
            string datos = "";
            datos += "{";
            datos += "\"contratado\" : \"" + usuario + "\"";
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
            var respuesta = readStream.ReadToEnd();
            Console.WriteLine("Respuesta:" + respuesta);

            MessageBox.Show("Reservada Oferta");
            this.Hide();
           
        }
    }
}
