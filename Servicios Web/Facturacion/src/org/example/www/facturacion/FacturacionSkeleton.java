package org.example.www.facturacion;

public class FacturacionSkeleton{

	public org.example.www.facturacion.ComprobarFacturaResponse comprobarFactura(org.example.www.facturacion.ComprobarFactura comprobarFactura){
		ComprobarFacturaResponse response = new ComprobarFacturaResponse();
		
		try {
			MySQL db = new MySQL();
			db.MySQLConnect();
			db.comando = db.conexion.createStatement();
			String query = "SELECT * FROM facturas WHERE id="+ comprobarFactura.getId()+";";
			db.registro = db.comando.executeQuery(query);
			if(db.registro.next()){
				response.setId(db.registro.getInt(1));
				response.setUsuario(db.registro.getString(2));
				response.setPrecio(db.registro.getFloat(3));
				response.setEstado(db.registro.getString(4));
				response.setDetalles(db.registro.getString(5));
				return response; 
			} else {
				response.setId(00);
				response.setUsuario("No Existe");
				response.setPrecio(0.0f);
				response.setEstado("No Existe");
				response.setDetalles("La factura que esta buscando no existe");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return response; 
	}

	public org.example.www.facturacion.CrearFacturaResponse crearFactura(org.example.www.facturacion.CrearFactura crearFactura){
		CrearFacturaResponse response = new CrearFacturaResponse();
		String usuario = crearFactura.getUsuario();
		String detalles = crearFactura.getDetalles();
		float precio = crearFactura.getPrecio();
		
		try {
			MySQL db = new MySQL();
            db.MySQLConnect();
            db.comando = db.conexion.createStatement(); 
            String query = "INSERT INTO facturas (usuario, Precio, Pagada, Detalles)"
            		+ "VALUES ('"+ usuario +"',"+ precio +",'No pagada','"+detalles+"')";
            int i = db.comando.executeUpdate(query);
            
            if(i != 0) {
          	  db.registro = db.comando.executeQuery("SELECT id FROM facturas ORDER BY id DESC");
          	  db.registro.next();
          	  response.setIdFactura(Integer.toString(db.registro.getInt(1)));
          	  response.setCreada(true);
            }
  		  return response; 
  	  } catch(Exception e) {
  		  System.out.println(e.getMessage());
  	  }
		response.setCreada(false);
		response.setIdFactura("0");
		return response; 
    }
     
}
    