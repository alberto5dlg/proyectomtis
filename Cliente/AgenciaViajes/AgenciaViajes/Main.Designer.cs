namespace AgenciaViajes
{
    partial class Main
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben eliminar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.busquedaVuelos = new System.Windows.Forms.Button();
            this.vuelosFecha = new System.Windows.Forms.Button();
            this.ofertasButom = new System.Windows.Forms.Button();
            this.login = new System.Windows.Forms.Button();
            this.registro = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.traslados = new System.Windows.Forms.Button();
            this.hoteles = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(142, 36);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(505, 39);
            this.label1.TabIndex = 0;
            this.label1.Text = "Proyecto de Integración MTIS ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 20F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(256, 94);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(230, 31);
            this.label2.TabIndex = 1;
            this.label2.Text = "Agencia de Viajes";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // busquedaVuelos
            // 
            this.busquedaVuelos.Location = new System.Drawing.Point(324, 168);
            this.busquedaVuelos.Name = "busquedaVuelos";
            this.busquedaVuelos.Size = new System.Drawing.Size(103, 51);
            this.busquedaVuelos.TabIndex = 2;
            this.busquedaVuelos.Text = "Busqueda de Vuelos";
            this.busquedaVuelos.UseVisualStyleBackColor = true;
            this.busquedaVuelos.Click += new System.EventHandler(this.busquedaVuelos_Click);
            // 
            // vuelosFecha
            // 
            this.vuelosFecha.Location = new System.Drawing.Point(149, 168);
            this.vuelosFecha.Name = "vuelosFecha";
            this.vuelosFecha.Size = new System.Drawing.Size(103, 51);
            this.vuelosFecha.TabIndex = 3;
            this.vuelosFecha.Text = "Vuelos por Fechas";
            this.vuelosFecha.UseVisualStyleBackColor = true;
            this.vuelosFecha.Click += new System.EventHandler(this.vuelosFecha_Click);
            // 
            // ofertasButom
            // 
            this.ofertasButom.Location = new System.Drawing.Point(494, 168);
            this.ofertasButom.Name = "ofertasButom";
            this.ofertasButom.Size = new System.Drawing.Size(103, 51);
            this.ofertasButom.TabIndex = 4;
            this.ofertasButom.Text = "Ofertas";
            this.ofertasButom.UseVisualStyleBackColor = true;
            this.ofertasButom.Click += new System.EventHandler(this.Ofertas_Click);
            // 
            // login
            // 
            this.login.Location = new System.Drawing.Point(149, 409);
            this.login.Name = "login";
            this.login.Size = new System.Drawing.Size(75, 23);
            this.login.TabIndex = 5;
            this.login.Text = "Login";
            this.login.UseVisualStyleBackColor = true;
            this.login.Click += new System.EventHandler(this.login_Click);
            // 
            // registro
            // 
            this.registro.Location = new System.Drawing.Point(242, 409);
            this.registro.Name = "registro";
            this.registro.Size = new System.Drawing.Size(75, 23);
            this.registro.TabIndex = 6;
            this.registro.Text = "Registro";
            this.registro.UseVisualStyleBackColor = true;
            this.registro.Click += new System.EventHandler(this.registro_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(146, 393);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(204, 13);
            this.label3.TabIndex = 7;
            this.label3.Text = "Haz login para busar tu viaje o Registrate ";
            // 
            // traslados
            // 
            this.traslados.Location = new System.Drawing.Point(149, 262);
            this.traslados.Name = "traslados";
            this.traslados.Size = new System.Drawing.Size(103, 51);
            this.traslados.TabIndex = 8;
            this.traslados.Text = "Traslados";
            this.traslados.UseVisualStyleBackColor = true;
            this.traslados.Click += new System.EventHandler(this.button1_Click);
            // 
            // hoteles
            // 
            this.hoteles.Location = new System.Drawing.Point(324, 262);
            this.hoteles.Name = "hoteles";
            this.hoteles.Size = new System.Drawing.Size(103, 51);
            this.hoteles.TabIndex = 9;
            this.hoteles.Text = "Hoteles";
            this.hoteles.UseVisualStyleBackColor = true;
            this.hoteles.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(806, 459);
            this.Controls.Add(this.hoteles);
            this.Controls.Add(this.traslados);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.registro);
            this.Controls.Add(this.login);
            this.Controls.Add(this.ofertasButom);
            this.Controls.Add(this.vuelosFecha);
            this.Controls.Add(this.busquedaVuelos);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Main";
            this.Text = "Agencia de Viajes";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button busquedaVuelos;
        private System.Windows.Forms.Button vuelosFecha;
        private System.Windows.Forms.Button ofertasButom;
        private System.Windows.Forms.Button login;
        private System.Windows.Forms.Button registro;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button traslados;
        private System.Windows.Forms.Button hoteles;
    }
}

