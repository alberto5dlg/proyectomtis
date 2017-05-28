package org.example.www.transformaciones;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;


public class Transformar {
	public static String jsonToXml(String entrada){
		try{
			JSONArray json = new JSONArray(entrada);
	        String xml = XML.toString(json);
	        return xml;
		}catch (Exception e){
			System.out.println("Problema en jsonToXml: " + e.toString());
			return "";
		}
	}
	
	public static String xmlToJson(String entrada){
		try{
			JSONObject jo = XML.toJSONObject(entrada);
			JSONObject books = jo.getJSONObject("results");
		    return books.toString();
		}catch (Exception e){
			System.out.println("Problema en xmlToJson: " + e.toString());
			return "";
		}
	}	
}
