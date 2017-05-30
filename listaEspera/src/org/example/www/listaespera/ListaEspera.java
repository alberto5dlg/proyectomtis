package org.example.www.listaespera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class ListaEspera {
	private static Connection conexion;
	public static int[] idAerolineas;
	public static int[] idVuelos1;
	public static int[] idVuelos2;
	public static int[] plazas;
	public static String[] correos;
	public static String[] mensajes;
	public static String listadoVuelos1, listadoVuelos2;
	public static String listaCorreos, listaMensajes;
	
	private static Statement prepararConexion() throws Exception{
		DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		DriverManager.setLoginTimeout(1);
        conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3311/proyectomtis","root", "root");
        return conexion.createStatement();
	}
		
	public static boolean  AnyadirAListaDeEspera(int idAerolinea, int idVuelo,String correoCliente,int plazas,String origen, String destino) throws Exception {
		boolean estado = true;
		try {
        	Statement s = prepararConexion();
        	String sqlInsert = "INSERT INTO listaEspera(idVuelo, idAerolinea, correoCliente,plazas,origen,destino) VALUES (" + idVuelo + ", " + idAerolinea + ", '" + correoCliente + "', " + plazas + ", '" + origen + "', '"+ destino + "');";
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
		for(int i=1; i<=2; i++){ // para hacerlo para las dos aerolineas
			ResultSet resultado;
	    	String sql = "select distinct idVuelo from listaEspera where idAerolinea = " + i + ";";
	    	System.out.println(sql);
	        Statement s = prepararConexion();
	        resultado = s.executeQuery (sql);  
	        if (resultado.last()) {
	          int rowcount = resultado.getRow();
	          idAerolineas = new int[rowcount];
	          idVuelos1 = new int[rowcount];
	          idVuelos2 = new int[rowcount];
	          resultado.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
	        }
	        int j = 0;
	        while(resultado.next()) {
	        	if(i == 1)
	        		idVuelos1[j] = resultado.getInt(1);
	        	else 
	        		idVuelos2[j] = resultado.getInt(1);
	           	j++;
	        }
	        //String a array
	       // int[] arr = Arrays.stream(res.substring(1, res.length()-1).split(","))
	         //   .map(String::trim).mapToInt(Integer::parseInt).toArray();
	        //System.out.println(Arrays.toString(arr));
	        conexion.close(); 
		}
		listadoVuelos1 = Arrays.toString(idVuelos1); // Array a string
		listadoVuelos2 = Arrays.toString(idVuelos2); // Array a string
        System.out.println("Obtenidos Vuelos " + listadoVuelos1 + " " + listadoVuelos2);  
           
    }	
	
	public static void clientesANotificar(int idAerolinea, String vuelosLista,String plazasLista) throws Exception {
		int[] vuelos = Arrays.stream(vuelosLista.substring(1, vuelosLista.length()-1).split(","))
	   	           .map(String::trim).mapToInt(Integer::parseInt).toArray();
	   	System.out.println("Recibo Vuelos " + Arrays.toString(vuelos));
	   	int[] plazas = Arrays.stream(plazasLista.substring(1, plazasLista.length()-1).split(","))
	   	           .map(String::trim).mapToInt(Integer::parseInt).toArray();
	   	System.out.println("Recibo Plazas " + Arrays.toString(plazas));
		int numVuelos = vuelos.length;
		correos = new String[numVuelos];
        mensajes = new String[numVuelos];
        int k = 0;
		for(int i=0;i<numVuelos; i++){
			ResultSet resultado;
	    	String sql = "select plazas,correoCliente,origen,destino from listaEspera where idAerolinea = " + idAerolinea + " and idVuelo = " + vuelos[i] + " ;";
        	System.out.println(sql);
        	Statement s = prepararConexion();
            resultado = s.executeQuery (sql); 
        	while(resultado.next()) {
               	int plazasSolicitadas = resultado.getInt(1);
        		System.out.println("Dentro " + plazasSolicitadas + " con " + plazas[i]);
               	if(plazasSolicitadas <= plazas[i]){
               		correos[k] = resultado.getString(2);
               		String origen = resultado.getString(3);
               		String destino = resultado.getString(4);
               		mensajes[k] = "Tienes plazas para tu vuelo deseado con la aerolinea" + idAerolinea + " desde " + origen + " hasta " + destino;
               		k++;
               	}
            }
        	conexion.close();
        }    
		listaCorreos = String.join(",", correos); // Array a string
		listaMensajes = String.join(",", mensajes); // Array a string
		//String strArray[] = listaCorreos.split(",");
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
