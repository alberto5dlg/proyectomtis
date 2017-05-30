namespace AgenciaViajes
{
    partial class BusquedaVuelos
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.origen = new System.Windows.Forms.TextBox();
            this.destino = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.fechainicio = new System.Windows.Forms.DateTimePicker();
            this.resultados = new System.Windows.Forms.DataGridView();
            this.Aerolinea = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Vuelo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Fecha = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.HoraSalida = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Precio = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.plazas = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.buscarButon = new System.Windows.Forms.Button();
            this.label6 = new System.Windows.Forms.Label();
            this.asientos2 = new System.Windows.Forms.Label();
            this.asientos = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.resultados)).BeginInit();
            this.SuspendLayout();
            // 
            // origen
            // 
            this.origen.Location = new System.Drawing.Point(122, 103);
            this.origen.Name = "origen";
            this.origen.Size = new System.Drawing.Size(100, 20);
            this.origen.TabIndex = 0;
            // 
            // destino
            // 
            this.destino.Location = new System.Drawing.Point(122, 142);
            this.destino.Name = "destino";
            this.destino.Size = new System.Drawing.Size(100, 20);
            this.destino.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(142, 22);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(360, 39);
            this.label1.TabIndex = 2;
            this.label1.Text = "Búsqueda de Vuelos ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(51, 106);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(44, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Origen: ";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(51, 145);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(49, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Destino: ";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(287, 103);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(68, 13);
            this.label4.TabIndex = 5;
            this.label4.Text = "Fecha Inicio:";
            this.label4.Click += new System.EventHandler(this.label4_Click);
            // 
            // fechainicio
            // 
            this.fechainicio.CustomFormat = "yyyy-MM-dd";
            this.fechainicio.Format = System.Windows.Forms.DateTimePickerFormat.Custom;
            this.fechainicio.Location = new System.Drawing.Point(391, 99);
            this.fechainicio.Name = "fechainicio";
            this.fechainicio.Size = new System.Drawing.Size(123, 20);
            this.fechainicio.TabIndex = 7;
            // 
            // resultados
            // 
            this.resultados.AllowUserToAddRows = false;
            this.resultados.AllowUserToDeleteRows = false;
            this.resultados.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.resultados.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Aerolinea,
            this.Vuelo,
            this.Fecha,
            this.HoraSalida,
            this.Precio,
            this.plazas});
            this.resultados.Location = new System.Drawing.Point(54, 304);
            this.resultados.Name = "resultados";
            this.resultados.ReadOnly = true;
            this.resultados.Size = new System.Drawing.Size(448, 150);
            this.resultados.TabIndex = 9;
            this.resultados.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.resultados_CellContentClick);
            // 
            // Aerolinea
            // 
            this.Aerolinea.HeaderText = "Aerolinea";
            this.Aerolinea.Name = "Aerolinea";
            this.Aerolinea.ReadOnly = true;
            this.Aerolinea.Visible = false;
            // 
            // Vuelo
            // 
            this.Vuelo.HeaderText = "Vuelo";
            this.Vuelo.Name = "Vuelo";
            this.Vuelo.ReadOnly = true;
            this.Vuelo.Visible = false;
            // 
            // Fecha
            // 
            this.Fecha.HeaderText = "Fecha";
            this.Fecha.Name = "Fecha";
            this.Fecha.ReadOnly = true;
            // 
            // HoraSalida
            // 
            this.HoraSalida.HeaderText = "Hora de Salida";
            this.HoraSalida.Name = "HoraSalida";
            this.HoraSalida.ReadOnly = true;
            // 
            // Precio
            // 
            this.Precio.HeaderText = "Precio";
            this.Precio.Name = "Precio";
            this.Precio.ReadOnly = true;
            // 
            // plazas
            // 
            this.plazas.HeaderText = "Plazas Disponibles";
            this.plazas.Name = "plazas";
            this.plazas.ReadOnly = true;
            // 
            // buscarButon
            // 
            this.buscarButon.Location = new System.Drawing.Point(243, 196);
            this.buscarButon.Name = "buscarButon";
            this.buscarButon.Size = new System.Drawing.Size(144, 31);
            this.buscarButon.TabIndex = 10;
            this.buscarButon.Text = "Buscar";
            this.buscarButon.UseVisualStyleBackColor = true;
            this.buscarButon.Click += new System.EventHandler(this.buscarButon_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(49, 261);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(119, 25);
            this.label6.TabIndex = 11;
            this.label6.Text = "Resultados";
            // 
            // asientos2
            // 
            this.asientos2.AutoSize = true;
            this.asientos2.Location = new System.Drawing.Point(287, 149);
            this.asientos2.Name = "asientos2";
            this.asientos2.Size = new System.Drawing.Size(65, 13);
            this.asientos2.TabIndex = 12;
            this.asientos2.Text = "Nº Asientos:";
            // 
            // asientos
            // 
            this.asientos.Location = new System.Drawing.Point(391, 142);
            this.asientos.Name = "asientos";
            this.asientos.Size = new System.Drawing.Size(100, 20);
            this.asientos.TabIndex = 13;
            // 
            // BusquedaVuelos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(668, 487);
            this.Controls.Add(this.asientos);
            this.Controls.Add(this.asientos2);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.buscarButon);
            this.Controls.Add(this.resultados);
            this.Controls.Add(this.fechainicio);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.destino);
            this.Controls.Add(this.origen);
            this.Name = "BusquedaVuelos";
            this.Text = "BusquedaVuelos";
            ((System.ComponentModel.ISupportInitialize)(this.resultados)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox origen;
        private System.Windows.Forms.TextBox destino;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.DateTimePicker fechainicio;
        private System.Windows.Forms.DataGridView resultados;
        private System.Windows.Forms.Button buscarButon;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.DataGridViewTextBoxColumn Aerolinea;
        private System.Windows.Forms.DataGridViewTextBoxColumn Vuelo;
        private System.Windows.Forms.DataGridViewTextBoxColumn Fecha;
        private System.Windows.Forms.DataGridViewTextBoxColumn HoraSalida;
        private System.Windows.Forms.DataGridViewTextBoxColumn Precio;
        private System.Windows.Forms.DataGridViewTextBoxColumn plazas;
        private System.Windows.Forms.Label asientos2;
        private System.Windows.Forms.TextBox asientos;
    }
}