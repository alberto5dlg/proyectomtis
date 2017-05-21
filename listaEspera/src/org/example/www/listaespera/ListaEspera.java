package org.example.www.listaespera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListaEspera {
	private static Connection conexion;
	public static int[] idAerolineas;
	public static int[] idVuelos;
	public static int[] plazas;
	public static String[] correos;
	
	
	private static Statement prepararConexion() throws Exception{
		DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		DriverManager.setLoginTimeout(1);
        conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectomtis","root", "root");
        return conexion.createStatement();
	}
		
	public static boolean  AnyadirAListaDeEspera(int idAerolinea, int idVuelo,String correoCliente,int plazas) throws Exception {
		boolean estado = true;
		try {
        	Statement s = prepararConexion();
        	String sqlInsert = "INSERT INTO listaEspera(idVuelo, idAerolinea, correoCliente,plazas) VALUES (" + idVuelo + ", " + idAerolinea + ", '" + correoCliente + "', " + plazas + ");";
    		System.out.println(sqlInsert);
        	if(s.executeUpdate(sqlInsert) <= 0){
        		System.out.println("NO Actualizada Lista de Espera");
        		estado = false;
        	} else {
    			System.out.println("Actualizada Lista de Espera");
    		}
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se puede conectar con la base de datos");
        } 
        return estado;
    }

		
	public static boolean  hayClientesEnEspera() throws Exception {
        ResultSet resultado;
        boolean estado = false;
    	String sql = "select id from listaEspera;";
    	System.out.println(sql);
        Statement s = prepararConexion();
        resultado = s.executeQuery (sql);             
        resultado.last(); 
        if(resultado.getRow() >= 1){ //devuelve la fila actual de la select
        	System.out.println("Lista de Espera NO Vacia"); 
        	estado = true;
        } else {
			System.out.println("Lista de Espera VACIA"); 
		}         	
        conexion.close();     
        return estado;
    }	
	
	public static void obtenerListaVuelos() throws Exception {
        ResultSet resultado;
    	String sql = "select idAerolinea,idVuelo from listaEspera group by idVuelo,idAerolinea;";
    	System.out.println(sql);
        Statement s = prepararConexion();
        resultado = s.executeQuery (sql);  
        if (resultado.last()) {
          int rowcount = resultado.getRow();
          idAerolineas = new int[rowcount];
          idVuelos = new int[rowcount];
          resultado.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
        }
        int i = 0;
        while(resultado.next()) {
           	idAerolineas[i] = resultado.getInt(1);
           	idVuelos[i] = resultado.getInt(2);
           	i++;
        }
        System.out.println("Obtenidos Vuelos");        	
        conexion.close();     
    }	
	
	public static void obtenerClientes(int idAerolinea, int idVuelo) throws Exception {
        ResultSet resultado;
    	String sql = "select correoCliente,plazas from listaEspera where idAerolinea = " + idAerolinea + " and idVuelo = " + idVuelo + " ;";
    	System.out.println(sql);
        Statement s = prepararConexion();
        resultado = s.executeQuery (sql);  
        if (resultado.last()) {
          int rowcount = resultado.getRow();
          correos = new String[rowcount];
          plazas = new int[rowcount];
          resultado.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
        }
        int i = 0;
        while(resultado.next()) {
        	correos[i] = resultado.getString(1);
        	plazas[i] = resultado.getInt(2);
           	i++;
        }
        System.out.println("Obtenidos Clientes");        	
        conexion.close();     
    }	
}
