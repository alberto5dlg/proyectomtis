using Newtonsoft.Json.Linq;
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
    class factura
    {
        public static void crearFactura(string usuario,float precio,string pagada,string detalles)
        {
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http:/localhost:3000/api/facturas/crearFactura");
            request.ContentType = "application/json";
            request.Method = "POST";
            string datos = "";
            datos += "{";
            datos += "\"usuario\" : \"" + usuario + "\",";
            datos += "\"precio\" : " + precio + ",";
            datos += "\"pagada\" : \"" + pagada + "\",";
            datos += "\"detalles\" : \"" + detalles + "\",";
            datos += "}";
            request.ContentLength = (long)datos.Length;
            StreamWriter body = new StreamWriter(request.GetRequestStream());
            Console.WriteLine(datos);
            body.Write(datos);
            body.Flush();
            body.Close();
            
        }
    }
}
