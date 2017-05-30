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
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
            estado();
            
        }

        public void estado()
        {
            if (user.User.Equals(""))
            {

                traslados.Enabled = false;
                hoteles.Enabled = false;
                vuelosFecha.Enabled = false;
                busquedaVuelos.Enabled = false;
                ofertasButom.Enabled = false;
                facturasButon.Enabled = false;
            }
            else
            {
                facturasButon.Enabled = true;
                traslados.Enabled = true;
                hoteles.Enabled = true;
                vuelosFecha.Enabled = true;
                busquedaVuelos.Enabled = true;
                ofertasButom.Enabled = true;
                login.Enabled = false;
                registro.Enabled = false; 
            }
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void busquedaVuelos_Click(object sender, EventArgs e)
        {
            BusquedaVuelos bus = new BusquedaVuelos();
            bus.Show();
        }

        private void vuelosFecha_Click(object sender, EventArgs e)
        {
            VuelosPorFecha vuelos = new VuelosPorFecha();
            vuelos.Show();
        }

        private void Ofertas_Click(object sender, EventArgs e)
        {
            Ofertas ofertas = new Ofertas();
            ofertas.Show();
        }

        private void login_Click(object sender, EventArgs e)
        {
            Login log = new Login();
            log.ShowDialog();
            estado();
        }

        private void registro_Click(object sender, EventArgs e)
        {
            Registro reg = new Registro();
            reg.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Traslados tras = new Traslados();
            tras.Show();
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            Hoteles hot = new Hoteles();
            hot.Show();
        }

        private void Disponibilidad_Tick(object sender, EventArgs e)
        {
            Disponibilidad.Stop();
            try
            {
                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://localhost:9090/enviarNotificaciones");
                request.ContentType = "application/json";
                request.Method = "POST";
                string datos = "";
                datos += "{";
                datos += "\"notificacion\" : \" \"";
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
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            Disponibilidad.Start();
        }

        private void facturasButon_Click(object sender, EventArgs e)
        {
            Facturas fact = new Facturas();
            fact.ShowDialog();
        }

    }
}
