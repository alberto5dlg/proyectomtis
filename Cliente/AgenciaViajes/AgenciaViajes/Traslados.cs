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
    public partial class Traslados : Form
    {
        public Traslados()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/consultarTraslados");
            request.ContentType = "application/json";
            request.Method = "POST";

            string datos = "";
            datos += "{";
            datos += "\"localidad\" : \""+textBox1.Text+"\"";
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
            string[] companyias = respuesta.Split(',');
            for (int i = 0; i < (companyias.Length-1); i++)
            {
                comboBox1.Items.Add(companyias[i]);
                Console.WriteLine("compañia" + i + ":" + companyias[i]);
            }
            Console.WriteLine("hola" + readStream.ReadToEnd());
            response.Close();
            readStream.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/reservarTraslado");
            request.ContentType = "application/json";
            request.Method = "POST";

            string [] fechas = dateTimePicker1.Value.ToString().Split(' ');
            string fecha = fechas[0];
            Console.WriteLine(fecha);
            fechas = fecha.Split('/');
            string fechaFinal = fechas[2] + "/" + fechas[1] + "/" + fechas[0];
            string datos = "";
            datos += "{";
            datos += "\"fecha\" : \"" + fechaFinal + "\",";
            datos += "\"nombre\": \"" + comboBox1.SelectedItem.ToString() + "\"";
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
            Console.WriteLine("hola" + respuesta);
            if(respuesta=="true")
            {
                contratado.Text = "El traslado ha sido contratado";
            }
            else
            {

                contratado.Text = "Fallo al contratar el traslado";
            }
            response.Close();
            readStream.Close();

        }
    }
}
