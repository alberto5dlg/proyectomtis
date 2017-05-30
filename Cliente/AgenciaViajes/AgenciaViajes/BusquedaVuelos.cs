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
using System.Text;
using System.IO;
using System.Web;
using Json;


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
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/disponivilidadVuelos");
            request.ContentType = "application/json";
            request.Method = "POST";
            string datos = "";
            datos += "{";
            datos += "\"fecha\" : \"2017-08-15\",";
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
           
           

           

        }
    }
}
