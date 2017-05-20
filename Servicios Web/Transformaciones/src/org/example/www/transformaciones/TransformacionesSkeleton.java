package org.example.www.transformaciones;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TransformacionesSkeleton{

	public org.example.www.transformaciones.FechasResponse fechas(org.example.www.transformaciones.Fechas fechas){
		FechasResponse response = new FechasResponse();
		return response; 
    }
    
	public org.example.www.transformaciones.FacturaToPDFResponse facturaToPDF(org.example.www.transformaciones.FacturaToPDF facturaToPDF){
		FacturaToPDFResponse response = new FacturaToPDFResponse();
		return response; 
    }
     
    public org.example.www.transformaciones.JSONtoXMLResponse jSONtoXML(org.example.www.transformaciones.JSONtoXML jSONtoXML){
    	JSONtoXMLResponse response = new JSONtoXMLResponse(); 
    	JSONObject json = new JSONObject(str);
    	String xml = XML.toString(json);          
    	return response; 
    }
     
}
    