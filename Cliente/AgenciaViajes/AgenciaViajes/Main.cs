using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
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
            }
            else
            {
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
    }
}
