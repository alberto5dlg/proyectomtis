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
<<<<<<< HEAD
using System.Text;
=======
>>>>>>> 2566c5ffbef0cc29e6b56b2c3f94aa882ebdf7c6
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
                string[] tokens = respuesta.Split(new[] { "\"result\"" }, StringSplitOptions.None);
               
                var objects = JArray.Parse(respuesta);
                foreach(JArray root in objects)
                {
                    foreach(JObject root2 in root)
                    {
                        resultados.Rows.Add(root2["fecha"],root2["hora"],root2["coste"],root2["plazas"]);
                        Console.WriteLine(root2["fecha"]);
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
