
/**
 * Aerolinea1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.aerolinea_1;
    /**
     *  Aerolinea1Skeleton java skeleton for the axisService
     */
    public class Aerolinea1Skeleton{
        

    	public ReservarVueloResponse reservarVuelo(ReservarVuelo ent) {
			ReservarVueloResponse res = new ReservarVueloResponse();
	       	 try {
	       		 	res.setSalida(Aerolinea.reservarVuelo(1, ent.getIdVuelo(),ent.getIdCliente(),ent.getPlazas()));
				} catch (Exception e) {
					e.printStackTrace();
				}
	       	 return res;
		}
         
        public DisponibilidadVuelosConSoloFechaResponse disponibilidadVuelosConSoloFecha(DisponibilidadVuelosConSoloFecha ent){
        	DisponibilidadVuelosConSoloFechaResponse res = new DisponibilidadVuelosConSoloFechaResponse();
        	try {
				res.setResultados(Aerolinea.consultarDisponibilidadSoloFecha(1, ent.getFecha()));
			} catch (Exception e) {
				e.printStackTrace();
			}
        	return res;
        }
     
         
         public DisponibilidadVuelosResponse disponibilidadVuelos(DisponibilidadVuelos ent){
          	 DisponibilidadVuelosResponse res = new DisponibilidadVuelosResponse();
          	 try {
   				res.setResultados(Aerolinea.consultarDisponibilidad(1,ent.getOrigen(),ent.getDestino(),ent.getFecha()));
   			} catch (Exception e) {
   				e.printStackTrace();
   			}
          	 return res; 
          }
     
         
         public HayPlazasResponse hayPlazas(HayPlazas ent){
        	 HayPlazasResponse res = new HayPlazasResponse();
           	 try {
    				res.setSalida(Aerolinea.hayPlazas(1, ent.getIdVuelo()));
    				res.setNumPlazas(Aerolinea.plazasLibres);
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
           	 return res; 
         }
               
       
         public HayPlazasListadoResponse hayPlazasListado(HayPlazasListado ent){
        	 HayPlazasListadoResponse res = new HayPlazasListadoResponse();
        	 try {
				res.setPlazas(Aerolinea.hayPlazasListado(1, ent.getIdVuelos()));
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
    