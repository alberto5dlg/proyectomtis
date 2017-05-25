package org.example.www.pagos;
public class PagosSkeleton{
              
	public org.example.www.pagos.RealizarPagoResponse realizarPago(org.example.www.pagos.RealizarPago realizarPago) {
		RealizarPagoResponse response = new RealizarPagoResponse();
		
		try { 
			MySQL db = new MySQL();
			db.MySQLConnect();
            String query = "SELECT * FROM facturas where id="+realizarPago.getIdFactura()+" and usuario='"+realizarPago.getIdUsuario()+"';";
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(query);
            
            if(db.registro.next()) {
            	db.comando = db.conexion.createStatement();
            	query = "UPDATE facturas SET pagada ='Pagada' WHERE id="+realizarPago.getIdFactura()+" and usuario='"+realizarPago.getIdUsuario()+"';";
            	int i = db.comando.executeUpdate(query);
	            response.setPagada(true);
	            response.setDetalles("Factura: "+ realizarPago.getIdFactura()+" con importe: "+ db.registro.getFloat(3) +", pagada correctamente por: "+realizarPago.getIdUsuario());
            } else {
            	response.setPagada(false);
	            response.setDetalles("Factura "+ realizarPago.getIdFactura()+" no existente, Lo sentimos " + realizarPago.getIdUsuario() + " llame y pida mas información");
            }
            
            return response; 
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.setPagada(false);
			response.setDetalles("No se ha podido pagar la factura ... " );
		}
		return response; 
    }
     
	public org.example.www.pagos.ComprobarPagoResponse comprobarPago(org.example.www.pagos.ComprobarPago comprobarPago) {
		ComprobarPagoResponse response = new ComprobarPagoResponse();
		
		try { 
			MySQL db = new MySQL();
			db.MySQLConnect();
            String query = "SELECT * FROM facturas where id="+comprobarPago.getIdFactura()+" and usuario='"+comprobarPago.getIdUsuario()+"';";
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(query);
            
            if(db.registro.next()) {
            	if(db.registro.getString(4).equals("Pagada")){
            		response.setPagada(true);
            		response.setDetalles("Factura: "+ comprobarPago.getIdFactura()+" con importe: "+ db.registro.getFloat(3) +", pagada correctamente por: "+comprobarPago.getIdUsuario());
            	} else {
            		response.setDetalles("Factura: "+ comprobarPago.getIdFactura()+" con importe: "+ db.registro.getFloat(3) +", no está pagada, "+comprobarPago.getIdUsuario());
            	}
            } else {
            	response.setPagada(false);
	            response.setDetalles("Factura "+ comprobarPago.getIdFactura()+" no existente, Lo sentimos " + comprobarPago.getIdUsuario() + " llame y pida mas información");
            }
            
            return response; 
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.setPagada(false);
			response.setDetalles("No se ha podido pagar la factura ... " );
		}
		return response; 
    }
     
}
    