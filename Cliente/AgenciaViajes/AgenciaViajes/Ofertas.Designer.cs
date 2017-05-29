namespace AgenciaViajes
{
    partial class Ofertas
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
            this.label1 = new System.Windows.Forms.Label();
            this.resultados = new System.Windows.Forms.DataGridView();
            this.Precio = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.TipoOferta = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DetallesOferta = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.fechaInicio = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.FechaVuelta = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.resultados)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(121, 31);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(448, 39);
            this.label1.TabIndex = 0;
            this.label1.Text = "Nuestras Ofertas en Viajes";
            // 
            // resultados
            // 
            this.resultados.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.resultados.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Precio,
            this.TipoOferta,
            this.DetallesOferta,
            this.fechaInicio,
            this.FechaVuelta});
            this.resultados.Location = new System.Drawing.Point(51, 103);
            this.resultados.Name = "resultados";
            this.resultados.ReadOnly = true;
            this.resultados.Size = new System.Drawing.Size(597, 328);
            this.resultados.TabIndex = 1;
            // 
            // Precio
            // 
            this.Precio.HeaderText = "Precio";
            this.Precio.Name = "Precio";
            this.Precio.ReadOnly = true;
            // 
            // TipoOferta
            // 
            this.TipoOferta.HeaderText = "Tipo de Oferta";
            this.TipoOferta.Name = "TipoOferta";
            this.TipoOferta.ReadOnly = true;
            // 
            // DetallesOferta
            // 
            this.DetallesOferta.HeaderText = "Descripcion de la Oferta";
            this.DetallesOferta.Name = "DetallesOferta";
            this.DetallesOferta.ReadOnly = true;
            // 
            // fechaInicio
            // 
            this.fechaInicio.HeaderText = "Fecha de Salida";
            this.fechaInicio.Name = "fechaInicio";
            this.fechaInicio.ReadOnly = true;
            // 
            // FechaVuelta
            // 
            this.FechaVuelta.HeaderText = "Fecha de Vuelta";
            this.FechaVuelta.Name = "FechaVuelta";
            this.FechaVuelta.ReadOnly = true;
            // 
            // Ofertas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(697, 476);
            this.Controls.Add(this.resultados);
            this.Controls.Add(this.label1);
            this.Name = "Ofertas";
            this.Text = "Ofertas";
            ((System.ComponentModel.ISupportInitialize)(this.resultados)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView resultados;
        private System.Windows.Forms.DataGridViewTextBoxColumn Precio;
        private System.Windows.Forms.DataGridViewTextBoxColumn TipoOferta;
        private System.Windows.Forms.DataGridViewTextBoxColumn DetallesOferta;
        private System.Windows.Forms.DataGridViewTextBoxColumn fechaInicio;
        private System.Windows.Forms.DataGridViewTextBoxColumn FechaVuelta;
    }
}