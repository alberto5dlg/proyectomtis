using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace AgenciaViajes
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(comprobar(usuarioText.Text.ToString(),passText.Text.ToString())) {
                user.User = usuarioText.Text.ToString();
                user.Pass = passText.Text.ToString();
                this.Hide();
            } else {
                MessageBox.Show("Error en el Login");
            }

            
        }

        public bool comprobar(string user, string pass)
        {
            bool comp = false;
            MySqlConnectionStringBuilder builder = new MySqlConnectionStringBuilder();
            builder.Server = "localhost";
            builder.Port = 3311;
            builder.UserID = "root";
            builder.Password = "root";
            builder.Database = "proyectomtis";


            MySqlConnection conn = new MySqlConnection(builder.ToString());
            MySqlCommand cmd = conn.CreateCommand();
            cmd.CommandText = "SELECT * FROM usuario WHERE username='" + user + "' and password='" + pass + "';";
            conn.Open();
            MySqlDataReader reader = cmd.ExecuteReader();
            //reader.Read();
            if (reader.Read() != false)
                comp = true;
            reader.Close();
            conn.Close();
            return comp;           
        }
    }
}
