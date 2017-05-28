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
        private bool logueado = false; 
        public Main()
        {
            InitializeComponent();
            estado();
            
        }

        public void estado()
        {
            if (!logueado)
            {
                vuelosFecha.Enabled = false;
                busquedaVuelos.Enabled = false;
                ofertasButom.Enabled = false;
            }
            else
            {
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
            log.Show();
        }

        private void registro_Click(object sender, EventArgs e)
        {
            Registro reg = new Registro();
            reg.Show();
        }
    }
}
