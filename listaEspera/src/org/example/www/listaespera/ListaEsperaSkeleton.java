
/**
 * ListaEsperaSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.listaespera;
    /**
     *  ListaEsperaSkeleton java skeleton for the axisService
     */
    public class ListaEsperaSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param anyadirAListaDeEspera 
             * @return anyadirAListaDeEsperaResponse 
         */
        
    	public AnyadirAListaDeEsperaResponse anyadirAListaDeEspera(AnyadirAListaDeEspera ent){
       	 AnyadirAListaDeEsperaResponse res = new AnyadirAListaDeEsperaResponse();
       	 try {
				res.setSalida(ListaEspera.AnyadirAListaDeEspera(ent.getIdAerolinea(), ent.getIdVuelo(), ent.getCorreo(),ent.getPlazas()));
			} catch (Exception e) {
				e.printStackTrace();
			}
       	 return res;
       }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param obtenerListaVuelos 
             * @return obtenerListaVuelosResponse 
         */
        
    	public ObtenerListaVuelosResponse obtenerListaVuelos(ObtenerListaVuelos ent){
       	 ObtenerListaVuelosResponse res = new ObtenerListaVuelosResponse();
       	 try {
				ListaEspera.obtenerListaVuelos();
				res.setIdAerolinea(ListaEspera.idAerolineas);
				res.setIdVuelo(ListaEspera.idVuelos);
			} catch (Exception e) {
				e.printStackTrace();
			}
       	 return res;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param hayClientesEnEspera 
             * @return hayClientesEnEsperaResponse 
         */
        
	     public HayClientesEnEsperaResponse hayClientesEnEspera(HayClientesEnEspera ent){
	    	 HayClientesEnEsperaResponse res = new HayClientesEnEsperaResponse();
	    	 try {
				res.setSalida(ListaEspera.hayClientesEnEspera());
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	 return res;
	     }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param obtenerClientes 
             * @return obtenerClientesResponse 
         */
        
                 public org.example.www.listaespera.ObtenerClientesResponse obtenerClientes
                  (
                  org.example.www.listaespera.ObtenerClientes ent
                  )
            {
                	 ObtenerClientesResponse res = new ObtenerClientesResponse();
                	 try {
						ListaEspera.obtenerClientes(ent.getIdAerolinea(), ent.getIdVuelo());
					} catch (Exception e) {
						e.printStackTrace();
					}
                	 res.setCorreo(ListaEspera.correos);
                	 res.setPlazas(ListaEspera.plazas);
                	 return res;
            }
     
    }
    