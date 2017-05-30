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
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
           
        }

       

    }
}
