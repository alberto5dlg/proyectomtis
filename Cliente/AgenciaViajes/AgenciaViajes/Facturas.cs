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
    public partial class Facturas : Form
    {
        public Facturas()
        {
            InitializeComponent();
            cargarDatos();
        }

        public void cargarDatos()
        {
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:3000/api/facturas/"+ user.User);
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
                resultados.Rows.Add(root["id"], root["Precio"], root["Pagada"], root["Detalles"]);
            }

            response.Close();
            readStream.Close();
        }
    }
}
