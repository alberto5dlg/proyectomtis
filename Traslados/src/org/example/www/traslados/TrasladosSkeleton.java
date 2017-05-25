
/**
 * TrasladosSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.traslados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
     *  TrasladosSkeleton java skeleton for the axisService
     */
    public class TrasladosSkeleton{
        /**
         * Auto generated method signature
         * 
                                     * @param buscarTraslados 
             * @return buscarTrasladosResponse 
         */
    	public org.example.www.traslados.BuscarTrasladosResponse buscarTraslados(org.example.www.traslados.BuscarTraslados buscarTraslados)
        {
    		ArrayList<String> companyias=new ArrayList<String>();
    		org.example.www.traslados.BuscarTrasladosResponse respuesta=new org.example.www.traslados.BuscarTrasladosResponse();
    		try
	   		{
		   		Class.forName("com.mysql.jdbc.Driver").newInstance();
		   		Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectomtis","root", "root"); 
		   		Statement s = conexion.createStatement(); 
		   	    ResultSet rs = s.executeQuery ("select * from comptraslados where localidad like '"+ buscarTraslados.getLocalidad()+"';");
		   	    while(rs.next())
		   	    {
		   	    	companyias.add(rs.getString(1));
		   	    }		   	    
		   	    String listaCompanyias="";
		   	    for(int i=0;i<companyias.size();i++)
		   	    {
		   	    	listaCompanyias+=companyias.get(i)+",";
		   	    }
		   	    respuesta.setOut(listaCompanyias);		   	    
		   	    conexion.close();		   	    
		   	}
	   		catch(Exception e)
	   		{
	   			e.printStackTrace();
	   		}
    		return respuesta;
        }
        /**
         * Auto generated method signature
         * 
                                     * @param contratarTraslado 
             * @return contratarTrasladoResponse 
         */
    	public org.example.www.traslados.ContratarTrasladoResponse contratarTraslado(org.example.www.traslados.ContratarTraslado contratarTraslado)
        {
    		org.example.www.traslados.ContratarTrasladoResponse respuesta=new org.example.www.traslados.ContratarTrasladoResponse();
    		double precio=0;
    		try
	   		{    			
		   		Class.forName("com.mysql.jdbc.Driver").newInstance();
		   		Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectomtis","root", "root"); 
		   		Statement s = conexion.createStatement(); 
		   		
		   		ResultSet PrecioComp = s.executeQuery ("select precio from comptraslados where nombre like '"+contratarTraslado.getNombre()+"';");
		   		while(PrecioComp.next())
		   	    {
		   	    	precio=PrecioComp.getDouble(1);
		   	    }
		   		Date fecha=contratarTraslado.getFecha();
		   		String fechaFinal="";
		   		
		   		fechaFinal=String.valueOf((fecha.getYear()+1900));
		   		
		   		switch(fecha.getMonth())
		   		{
		   			case 0:fechaFinal+="-01-";break;
		   			case 1:fechaFinal+="-02-";break;
		   			case 2:fechaFinal+="-03-";break;
		   			case 3:fechaFinal+="-04-";break;
		   			case 4:fechaFinal+="-05-";break;
		   			case 5:fechaFinal+="-06-";break;
		   			case 6:fechaFinal+="-07-";break;
		   			case 7:fechaFinal+="-08-";break;
		   			case 8:fechaFinal+="-09-";break;
		   			case 9:fechaFinal+="-10-";break;
		   			case 10:fechaFinal+="-11-";break;
		   			case 11:fechaFinal+="-12-";break;
		   		}
		   		fechaFinal+=fecha.getDate();	
		   	    int rs=s.executeUpdate("INSERT INTO trasladoscontratados(nombreCtraslados,fecha,precio) VALUES('"+contratarTraslado.getNombre()+"','"+fechaFinal+"',"+precio+");");
		   	    if(rs != 0)
		   	    	respuesta.setOut(true);
		   	    else
		   	    	respuesta.setOut(false);
		   	    conexion.close();		   	    
		   	}
	   		catch(Exception e)
	   		{
	   			e.printStackTrace();
	   		}
    		
    		return respuesta;
        }
     
    }
    