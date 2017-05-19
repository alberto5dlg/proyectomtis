package org.example.www.validacion;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Date;

public class ValidacionSkeleton{
          
	public org.example.www.validacion.ValidarIBANResponse validarIBAN(org.example.www.validacion.ValidarIBAN validarIBAN) {
		String cuenta = validarIBAN.getNIban();
    	boolean esValido = false;
 		int i = 2, caracterASCII = 0, resto = 0, dc = 0;
 		String cadenaDc = "";
 		BigInteger cuentaNumero = new BigInteger("0"); 
 		BigInteger modo = new BigInteger("97");
 		ValidarIBANResponse valido = new ValidarIBANResponse();      

 		if(cuenta.length() == 24 && cuenta.substring(0,1).toUpperCase().equals("E") 
 			&& cuenta.substring(1,2).toUpperCase().equals("S")) {

 			do {
 				caracterASCII = cuenta.codePointAt(i);
 				esValido = (caracterASCII > 47 && caracterASCII < 58);
 				i++;
 			}
 			while(i < cuenta.length() && esValido); 
 		
 		
 			if(esValido) {
 				cuentaNumero = new BigInteger(cuenta.substring(4,24) + "142800");
 				resto = cuentaNumero.mod(modo).intValue();
 				dc = 98 - resto;
 				cadenaDc = String.valueOf(dc);
 			}	
 			
 			if(dc < 10) {
 				cadenaDc = "0" + cadenaDc;
 			} 

 			// Comparamos los caracteres 2 y 3 de la cuenta (dígito de control IBAN) con cadenaDc
 			if(cuenta.substring(2,4).equals(cadenaDc)) {
 				esValido = true;
 			} else {
 				esValido = false;
 			}
 		}
 		
 		
 		valido.setValido(esValido);
 		return valido;
	}

	public org.example.www.validacion.ValidarFechaResponse validarFecha(org.example.www.validacion.ValidarFecha validarFecha) {
		
            ValidarFechaResponse response = new ValidarFechaResponse();
            Date inicio = validarFecha.getFechaInicio();
            Date fin = validarFecha.getFechaFin();
            
            if(inicio.before(fin) || inicio.equals(fin))
            	response.setValido(true);
            else 
            	response.setValido(false);
            
            return response; 
    }
    
	public org.example.www.validacion.ValidarDNIResponse validarDNI(org.example.www.validacion.ValidarDNI validarDNI) {
		
		ValidarDNIResponse response = new ValidarDNIResponse(); 
		String dni = validarDNI.getDni();
  	  	boolean esValido = false;
        int i = 0, caracterASCII = 0, miDNI = 0, resto = 0;
        char letra = ' ';
        char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        if(dni.length() == 9 && Character.isLetter(dni.charAt(8))) {
        	   
            do {
                caracterASCII = dni.codePointAt(i);
                esValido = (caracterASCII > 47 && caracterASCII < 58);
                i++;
            } 
            while(i < dni.length() - 1 && esValido);     
        }
 
        if(esValido) {
            letra = Character.toUpperCase(dni.charAt(8));
            miDNI = Integer.parseInt(dni.substring(0,8));
            resto = miDNI % 23;
            esValido = (letra == asignacionLetra[resto]);
        }
       
        response.setValido(esValido);
		return response;
    }
     
    public org.example.www.validacion.ValidarTarjetaResponse validarTarjeta(org.example.www.validacion.ValidarTarjeta validarTarjeta) {
  
    	ValidarTarjetaResponse response = new ValidarTarjetaResponse();
    	String card = validarTarjeta.getNTarjeta().replaceAll("[^0-9]+", "");
    	
    	if ((card == null) || (card.length() < 13) || (card.length() > 19)) {
           response.setOut("Error tarjeta no valida");
           return response;
    	}
    	
    	if (!luhnCheck(card)){
    		response.setOut("Error numero incorrecto");
    		return response;
    	}		
    	response.setOut("Numero de tarjeta Correcto");
    	return response; 
    }
    
    public org.example.www.validacion.ValidarUsuarioResponse validarUsuario(org.example.www.validacion.ValidarUsuario validarUsuario) throws SQLException {
    	
    	ValidarUsuarioResponse response = new ValidarUsuarioResponse();
    	String user = validarUsuario.getUsuario();
    	String pass = validarUsuario.getPassword();
    	
    	try {
  		  MySQL db = new MySQL();
            db.MySQLConnect();
            String query = "SELECT * FROM usuario where username='"+user+"' and password='"+pass+"';";
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(query);
            if(db.registro.next()) {
	               response.setValido(true);
	               return response; 
            }
            response.setValido(false);
            return response; 

  	  } catch (SQLException e){
  		  System.out.println(e.getMessage());
  		  throw new SQLException();
  	  }        	         	            
    }
    
    protected static boolean luhnCheck(String cardNumber) {
        // number must be validated as 0..9 numeric first!!
        int digits = cardNumber.length();
        int oddOrEven = digits & 1;
        long sum = 0;
        for (int count = 0; count < digits; count++) {
            int digit = 0;
            try {
                digit = Integer.parseInt(cardNumber.charAt(count) + "");
            } catch(NumberFormatException e) {
                return false;
            }

            if (((count & 1) ^ oddOrEven) == 0) { // not
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }

        return (sum == 0) ? false : (sum % 10 == 0);
}
    
     
}
    