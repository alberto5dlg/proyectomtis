using MySql.Data.MySqlClient;
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
    public partial class Registro : Form
    {
        public Registro()
        {
            InitializeComponent();
        }

        private void Registrate_Click(object sender, EventArgs e)
        {
            MySqlConnectionStringBuilder builder = new MySqlConnectionStringBuilder();
            builder.Server = "localhost";
            builder.Port = 3311;
            builder.UserID = "root";
            builder.Password = "root";
            builder.Database = "proyectomtis";

            try
            {
                MySqlConnection conn = new MySqlConnection(builder.ToString());
                MySqlCommand cmd = conn.CreateCommand();
                cmd.CommandText = "INSERT INTO usuario VALUES ('" + userBox.Text + "','" + passBox.Text + "','" + nombreBox.Text + "','" + apellidoBox.Text + "','" + emailBox.Text + "','" + telfBox.Text + "');";
                conn.Open();
                cmd.ExecuteNonQuery();
                conn.Close();
                MessageBox.Show("Registrado Correctamente");
                this.Hide();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
                  
        }
    }
}
