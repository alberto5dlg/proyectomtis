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

namespace AgenciaViajes
{
    public partial class Hoteles : Form
    {
        public Hoteles()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/consultarHabitaciones");
            request.ContentType = "application/json";
            request.Method = "POST";

            string datos = "";
            datos += "{";
            datos += "\"input\" : \"" + textBox1.Text + "\",";
            datos += "\"huespedes\" : \"" + Convert.ToInt32(textBox2.Text) + "\"";
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
            string []hoteles = respuesta.Split('#');
            string[] Habhotel1 = hoteles[0].Split(' ');
            string[] Habhotel2 = hoteles[1].Split(' ');
            
            if(Habhotel1[0] != "No")
            {
                for (int i = 0; i < (Habhotel1.Length - 1); i++)
                    comboBox1.Items.Add(Habhotel1[i]);
            }
            else
            {
                Lhotel1.Text = "No hay habitaciones disponibles";
            }
            if (Habhotel2[0] != "No")
            {
                for (int i = 0; i < (Habhotel2.Length - 1); i++)
                    comboBox2.Items.Add(Habhotel2[i]);
            }
            else
            {
                LHotel2.Text = "No hay habitaciones disponibles";
            }


           
            Console.WriteLine("hola " + respuesta);
            response.Close();
            readStream.Close();
        }
    }
}
