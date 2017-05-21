
/**
 * Aerolinea2Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.aerolinea_1;
    /**
     *  Aerolinea2Skeleton java skeleton for the axisService
     */
    public class Aerolinea2Skeleton{
    	/**
         * Auto generated method signature
         * @param reservarVuelo 
         * @return reservarVueloResponse 
         */
        
    	public ReservarVueloResponse reservarVuelo(ReservarVuelo ent) {
			ReservarVueloResponse res = new ReservarVueloResponse();
	       	 try {
	       		 	res.setSalida(Aerolinea.reservarVuelo(2, ent.getIdVuelo(),ent.getIdCliente(),ent.getPlazas()));
				} catch (Exception e) {
					e.printStackTrace();
				}
	       	 return res;
		}
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param disponibilidadVuelos 
             * @return disponibilidadVuelosResponse 
         */
        
         public DisponibilidadVuelosResponse disponibilidadVuelos(DisponibilidadVuelos ent){
           	 DisponibilidadVuelosResponse res = new DisponibilidadVuelosResponse();
           	 try {
           		 	Aerolinea.salidaJson = false;
    				res.setFicheroResultados(Aerolinea.consultarDisponibilidad(2,ent.getOrigen(),ent.getDestino(),ent.getFecha()));
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
           	 return res; 
           }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param hayPlazas 
             * @return hayPlazasResponse 
         */
        
         public HayPlazasResponse hayPlazas(HayPlazas ent){
        	 HayPlazasResponse res = new HayPlazasResponse();
           	 try {
    				res.setSalida(Aerolinea.hayPlazas(2, ent.getIdVuelo()));
    				res.setNumPlazas(Aerolinea.plazasLibres);
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
           	 return res; 
         }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param cancelarVuelo 
             * @return cancelarVueloResponse 
         */
        
                 public org.example.www.aerolinea_1.CancelarVueloResponse cancelarVuelo
                  (
                  org.example.www.aerolinea_1.CancelarVuelo cancelarVuelo
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#cancelarVuelo");
        }
    
    }
    