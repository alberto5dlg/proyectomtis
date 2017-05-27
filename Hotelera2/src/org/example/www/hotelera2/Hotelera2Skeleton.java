
/**
 * Hotelera2Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.hotelera2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
     *  Hotelera2Skeleton java skeleton for the axisService
     */
    public class Hotelera2Skeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param reservarHabitaciones 
             * @return reservarHabitacionesResponse 
         */
        
         public org.example.www.hotelera2.ReservarHabitacionesResponse reservarHabitaciones
         (org.example.www.hotelera2.ReservarHabitaciones reservarHabitaciones)
         {
        	 ReservarHabitacionesResponse res = new ReservarHabitacionesResponse();
	    	 res.setOut(false);
	    	
	    	 try
	    	 {
				
	    		 Date inicio = reservarHabitaciones.getFechaInicio();
				 String sqlInicio = new SimpleDateFormat("yyyy-MM-dd").format(inicio);
				 
				 Date fin = reservarHabitaciones.getFechaFin();
				 String sqlFin = new SimpleDateFormat("yyyy-MM-dd").format(fin);
					
					
	    		 Class.forName("com.mysql.jdbc.Driver");
	    		 // Establecemos la conexión con la base de datos. 
	    		 Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectomtis","root", "root");
				
	    		 Statement s = conexion.createStatement(); 				   		 
	    		 	    		 
	    		 ResultSet rsReserva = s.executeQuery ("select * from reservahotel2 where idHabitacion=" + reservarHabitaciones.getIdHabitacion() + ";");
		   		 boolean disponible = true;
		   		 while (rsReserva.next()) 
		   		 { 
		   			if ( (reservarHabitaciones.getFechaInicio().after(rsReserva.getDate("fechaInicio")) && reservarHabitaciones.getFechaInicio().before(rsReserva.getDate("fechaFin")) )
		   			  || (reservarHabitaciones.getFechaFin().after(rsReserva.getDate("fechaInicio")) && reservarHabitaciones.getFechaFin().before(rsReserva.getDate("fechaFin"))) )
		   			{
		   				disponible = false;
		   			}
		   		 }   			    		 
	    		 res.setOut(disponible);
	    		 
	    		 if (disponible)
	    		 {
	    			 PreparedStatement i = conexion.prepareStatement("INSERT INTO reservahotel2 VALUES (null,?,'" + sqlInicio + "','" + sqlFin +"')",
			       	 PreparedStatement.RETURN_GENERATED_KEYS);

					 String idHabitacion = reservarHabitaciones.getIdHabitacion();						       				       		
			       	 i.setString(1,idHabitacion);			       		
			       	 i.executeUpdate(); // Se ejecuta la inserción.
	    		 }
				
	    		 // Cerramos la conexion a la base de datos. 
			   	 conexion.close();
			   
			   		
			 } catch (Exception e)
			 {
			    e.printStackTrace();
			 }				
			
	    	 return res;
         }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getHabitaciones 
             * @return getHabitacionesResponse 
         */
        
         public org.example.www.hotelera2.GetHabitacionesResponse getHabitaciones
         (org.example.www.hotelera2.GetHabitaciones getHabitaciones)
         {
        	 GetHabitacionesResponse res = new GetHabitacionesResponse();
        	 res.setOut("Error");
	    	
        	 try
        	 {
				
        		 Class.forName("com.mysql.jdbc.Driver");
        		 // Establecemos la conexión con la base de datos. 
        		 Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectomtis","root", "root");
				
        		 Statement s = conexion.createStatement(); 
				
        		 String strHabitaciones = "";
        		 ResultSet rsHotel = s.executeQuery ("select id from hotel2 where huespedes=" + getHabitaciones.getHuespedes() + " and localidad='" + getHabitaciones.getDestino() + "';");
        		 while (rsHotel.next()) 
        		 { 
        			 strHabitaciones += rsHotel.getInt("id") + " ";
        		 }
        		 if (strHabitaciones.equals(""))
        			 strHabitaciones = "No hay habitaciones.";
        		 res.setOut(strHabitaciones);
        		  
			   	 conexion.close();
			   
			   		
			 } catch (Exception e)
			 {
			    e.printStackTrace();
			 }				
			
        	 return res;
         }
     
    }
    