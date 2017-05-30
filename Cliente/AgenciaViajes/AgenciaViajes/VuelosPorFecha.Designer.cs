namespace AgenciaViajes
{
    partial class VuelosPorFecha
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
            this.label2 = new System.Windows.Forms.Label();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.resultados = new System.Windows.Forms.DataGridView();
            this.Aerolinea = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Vuelo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Fecha = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Origen = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Destino = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.precio = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Plazas = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.label5 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.asientos = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.resultados)).BeginInit();
            this.SuspendLayout();
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(56, 125);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(90, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Fecha de Salida: ";
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.CustomFormat = "yyyy-MM-dd";
            this.dateTimePicker1.Format = System.Windows.Forms.DateTimePickerFormat.Custom;
            this.dateTimePicker1.Location = new System.Drawing.Point(168, 121);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(112, 20);
            this.dateTimePicker1.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 22F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(53, 9);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(306, 36);
            this.label3.TabIndex = 4;
            this.label3.Text = "No sabes donde ir ...  ";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 20F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(53, 59);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(572, 31);
            this.label4.TabIndex = 5;
            this.label4.Text = "Introduce tu fecha y nosotros nos encargamos";
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
            this.Origen,
            this.Destino,
            this.precio,
            this.Plazas});
            this.resultados.Location = new System.Drawing.Point(59, 226);
            this.resultados.Name = "resultados";
            this.resultados.ReadOnly = true;
            this.resultados.Size = new System.Drawing.Size(545, 157);
            this.resultados.TabIndex = 6;
            this.resultados.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.resultados_CellContentClick);
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
            // Origen
            // 
            this.Origen.HeaderText = "Origen";
            this.Origen.Name = "Origen";
            this.Origen.ReadOnly = true;
            // 
            // Destino
            // 
            this.Destino.HeaderText = "Destino";
            this.Destino.Name = "Destino";
            this.Destino.ReadOnly = true;
            // 
            // precio
            // 
            this.precio.HeaderText = "Precio";
            this.precio.Name = "precio";
            this.precio.ReadOnly = true;
            // 
            // Plazas
            // 
            this.Plazas.HeaderText = "Plazas Disponibles";
            this.Plazas.Name = "Plazas";
            this.Plazas.ReadOnly = true;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(54, 187);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(194, 25);
            this.label5.TabIndex = 7;
            this.label5.Text = "Destinos Disponibles";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(327, 121);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 8;
            this.button1.Text = "Consultar";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(56, 158);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(62, 13);
            this.label1.TabIndex = 9;
            this.label1.Text = "Nº Asientos";
            // 
            // asientos
            // 
            this.asientos.Location = new System.Drawing.Point(168, 155);
            this.asientos.Name = "asientos";
            this.asientos.Size = new System.Drawing.Size(100, 20);
            this.asientos.TabIndex = 10;
            // 
            // VuelosPorFecha
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(707, 409);
            this.Controls.Add(this.asientos);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.resultados);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.dateTimePicker1);
            this.Controls.Add(this.label2);
            this.Name = "VuelosPorFecha";
            this.Text = "VuelosPorFecha";
            ((System.ComponentModel.ISupportInitialize)(this.resultados)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.DataGridView resultados;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Aerolinea;
        private System.Windows.Forms.DataGridViewTextBoxColumn Vuelo;
        private System.Windows.Forms.DataGridViewTextBoxColumn Fecha;
        private System.Windows.Forms.DataGridViewTextBoxColumn Origen;
        private System.Windows.Forms.DataGridViewTextBoxColumn Destino;
        private System.Windows.Forms.DataGridViewTextBoxColumn precio;
        private System.Windows.Forms.DataGridViewTextBoxColumn Plazas;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox asientos;
    }
}