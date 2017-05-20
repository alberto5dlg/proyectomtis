package org.example.www.aerolinea_1;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.mysql.jdbc.ResultSetMetaData;

public class Aerolinea {

	private static java.sql.Date fechaAntes;
	private static java.sql.Date fechaDespues;
	private static boolean salidaJson = true;
	private static Connection conexion;
	private static int balance = 3;
	
	private static Statement prepararConexion() throws Exception{
		DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		DriverManager.setLoginTimeout(1);
        conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectomtis","root", "root");
        return conexion.createStatement();
	}
		
	public static String  consultarDisponibilidad(int idAerolinea, String origen, String destino,java.util.Date fecha)  throws Exception {
		String salida = "";
        ResultSet resultado;
        setFecha(fecha);
        String sql = "select id, coste from aerolinea" + idAerolinea +" where origen = '"+ origen + "' and destino = '" + destino + "' and fecha BETWEEN '" + fechaAntes + "' and '" + fechaDespues+ "';";
        System.out.println(sql);
        Statement s = prepararConexion();
        resultado = s.executeQuery (sql); 
        if(salidaJson){
        	salida = convertResultSetToJson(resultado);
        }else {
            salida = convertToXML(resultado);
        }
        resultado.last(); 
        //JSONObject json = new JSONObject("hola");
        //String xml = XML.toString(json);
        if(resultado.getRow() <= 0){ 
            System.out.println("No se ha encontrado info");
		}         	
        conexion.close();     
        return salida;
    }
	
	/*
	public static boolean reservarVuelo(int idAerolinea, int idVuelo,String idCliente,int plazas)  throws Exception {
		String sqlInsert = "INSERT INTO reserva" + idAerolinea + " (idVuelo, idCliente, plazas) VALUES ('" + idVuelo + "', '" + idCliente + "', " + plazas +");";
		System.out.println(sqlInsert);
		Statement s = prepararConexion();
		int aux = s.executeUpdate(sqlInsert);
		System.out.println(aux);
		conexion.close(); 
		return true;
	}
	*/
	public static boolean  reservarVuelo(int idAerolinea, int idVuelo,String idCliente,int plazas) throws Exception {
        int plazasDespues = numPlazas(idAerolinea,idVuelo,plazas);
        boolean estado = true;
        if(plazasDespues <= -1){
        	System.out.println("No se puede actualizar el numero de plazas a negativo para el vuelo: " + idVuelo);
        	return false;//throw new Exception("Producto de Almacen NO Actualizado A Stock Negativo!!!");
        }
        try {
        	String sql = "update aerolinea" + idAerolinea +" set plazas = " + plazasDespues + " where id = "+ idVuelo + ";";
        	System.out.println(sql);
        	Statement s = prepararConexion();
            if(s.executeUpdate(sql) <= 0){
            	System.out.println("No actualizada la aerolinea con el vuelo " + idVuelo);
            	estado = false;//throw new Exception("Producto de Almacen NO Actualizado!!!");
            } else {
            	String sqlInsert = "INSERT INTO reserva" + idAerolinea + " (idVuelo, idCliente, plazas) VALUES ('" + idVuelo + "', '" + idCliente + "', " + plazas +");";
        		System.out.println(sqlInsert);
            	if(s.executeUpdate(sqlInsert) <= 0){
            		System.out.println("NO Actualizada aerolinea");
            		estado = false;
            	} else {
        			System.out.println("Actualizada aerolinea");
        		}
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se puede conectar con la base de datos");
        } 
        return estado;
    }

	
	public static boolean hayPlazas(int idAerolinea, int idVuelo,int plazas) throws Exception{
		return numPlazas(idAerolinea,idVuelo,plazas) >= 0;
	}
	
	private static int  numPlazas(int idAerolinea, int idVuelo,int plazas) throws Exception {
        ResultSet resultado;
        int plazasActual = -1;
    	String sql = "select plazas from aerolinea" + idAerolinea + " where id = "+ idVuelo + ";";
    	System.out.println(sql);
        Statement s = prepararConexion();
        resultado = s.executeQuery (sql);             
        resultado.last(); 
        if(resultado.getRow() >= 1){ //devuelve la fila actual de la select
        	plazasActual = resultado.getInt(1);
            System.out.println("Plazas: " + plazasActual);
        } else {
			System.out.println("No encontradas plazas para el vuelo " + idVuelo); 
		}         	
        conexion.close();     
        return plazasActual - plazas;
    }
	
	
	private static String convertResultSetToJson(ResultSet resultSet) throws SQLException, JSONException
	{
	    JSONArray json = new JSONArray();
	    ResultSetMetaData metadata = (ResultSetMetaData) resultSet.getMetaData();
	    int numColumns = metadata.getColumnCount();

	    while(resultSet.next())             //iterate rows
	    {
	        JSONObject obj = new JSONObject();      //extends HashMap
	        for (int i = 1; i <= numColumns; ++i)           //iterate columns
	        {
	            String column_name = metadata.getColumnName(i);
	            obj.put(column_name, resultSet.getObject(column_name));
	        }
	        json.put(obj);
	    }
	    return json.toString();
	}

	private static String convertToXML(ResultSet resultSet) throws Exception {
        StringBuffer xmlArray = new StringBuffer("<results>");
        while (resultSet.next()) {
            int total_rows = resultSet.getMetaData().getColumnCount();
            xmlArray.append("<result ");
            for (int i = 0; i < total_rows; i++) {
                xmlArray.append(" " + resultSet.getMetaData().getColumnLabel(i + 1)
                .toLowerCase() + "='" + resultSet.getObject(i + 1) + "'"); }
            xmlArray.append(" />");
        }
        xmlArray.append("</results>");
        return xmlArray.toString();
    }


	public static void setFecha(java.util.Date date) {
		java.util.Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	cal.set(Calendar.HOUR_OF_DAY, 0);
    	cal.set(Calendar.MINUTE, 0);
    	cal.set(Calendar.SECOND, 0);
    	cal.set(Calendar.MILLISECOND, 0);   
    	fechaAntes = new java.sql.Date(cal.getTime().getTime());
    	cal.add(Calendar.DAY_OF_YEAR, balance);  // numero de d�as a a�adir, o restar en caso de d�as<0
		fechaDespues = new java.sql.Date(cal.getTime().getTime());
	}
	
	
}
