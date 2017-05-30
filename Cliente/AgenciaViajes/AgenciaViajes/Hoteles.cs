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
    public partial class Hoteles : Form
    {
        public Hoteles()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Lhotel1.Text = "";
            LHotel2.Text = "";
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

        private void label12_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/reservarHabitaciones");
                request.ContentType = "application/json";
                request.Method = "POST";

                string[] fechas1 = dateTimePicker1.Value.ToString().Split(' ');
                string fecha1 = fechas1[0];
                Console.WriteLine(fecha1);
                fechas1 = fecha1.Split('/');
                string fechaFinal1 = fechas1[2] + "/" + fechas1[1] + "/" + fechas1[0];

                string[] fechas2 = dateTimePicker2.Value.ToString().Split(' ');
                string fecha2 = fechas2[0];
                Console.WriteLine(fecha2);
                fechas2 = fecha2.Split('/');
                string fechaFinal2 = fechas2[2] + "/" + fechas2[1] + "/" + fechas2[0];

                string datos = "";
                datos += "{";
                datos += "\"input\" : \"" + comboBox1.SelectedItem.ToString() + "\",";
                datos += "\"inicio\": \"" + fechaFinal1 + "\",";
                datos += "\"fin\": \"" + fechaFinal2 + "\",";
                datos += "\"hotel\": \"1\"";
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
                if (respuesta == "true")
                {
                    Random r = new Random(0);
                    float precio=Convert.ToSingle(r.Next(50,200));
                    RHotel1.Text = "La reserva se ha realizado correctamente";
                    factura.crearFactura(user.User, precio, "Pagada", "Hotel en :" + textBox1.Text + "Personas: " + textBox2.Text);
                }
                else
                {

                    RHotel1.Text = "Fallo realizar la reserva, pruebe otras fechas";
                }
                response.Close();
                readStream.Close();
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            try
            {
                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/reservarHabitaciones");
                request.ContentType = "application/json";
                request.Method = "POST";

                string[] fechas1 = dateTimePicker3.Value.ToString().Split(' ');
                string fecha1 = fechas1[0];
                Console.WriteLine(fecha1);
                fechas1 = fecha1.Split('/');
                string fechaFinal1 = fechas1[2] + "/" + fechas1[1] + "/" + fechas1[0];

                string[] fechas2 = dateTimePicker4.Value.ToString().Split(' ');
                string fecha2 = fechas2[0];
                Console.WriteLine(fecha2);
                fechas2 = fecha2.Split('/');
                string fechaFinal2 = fechas2[2] + "/" + fechas2[1] + "/" + fechas2[0];

                string datos = "";
                datos += "{";
                datos += "\"input\" : \"" + comboBox2.SelectedItem.ToString() + "\",";
                datos += "\"inicio\": \"" + fechaFinal1 + "\",";
                datos += "\"fin\": \"" + fechaFinal2 + "\",";
                datos += "\"hotel\": \"2\"";
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
                if (respuesta == "true")
                {
                    RHotel2.Text = "La reserva se ha realizado correctamente";
                }
                else
                {

                    RHotel2.Text = "Fallo realizar la reserva, pruebe otras fechas";
                }
                response.Close();
                readStream.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
