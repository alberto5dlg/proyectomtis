
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
    	  public ObtenerClientesANotificarResponse obtenerClientesANotificar
          (  ObtenerClientesANotificar ent)
    {
             ObtenerClientesANotificarResponse res = new ObtenerClientesANotificarResponse();
             try {
                ListaEspera.clientesANotificar(ent.getIdAerolinea(), ent.getVuelos(), ent.getPlazas());
                res.setCorreos(ListaEspera.correos);
                res.setMensajes(ListaEspera.mensajes);
             } catch (Exception e) {
                e.printStackTrace();
            }
             return res;
    }
        
  public AnyadirAListaDeEsperaResponse anyadirAListaDeEspera(AnyadirAListaDeEspera ent){
     AnyadirAListaDeEsperaResponse res = new AnyadirAListaDeEsperaResponse();
     try {
            res.setSalida(ListaEspera.AnyadirAListaDeEspera(ent.getIdAerolinea(), ent.getIdVuelo(), ent.getCorreo(),ent.getPlazas(),ent.getOrigen(),ent.getDestino()));
        } catch (Exception e) {
            e.printStackTrace();
        }
     return res;
   }


    public ObtenerListaVuelosResponse obtenerListaVuelos(ObtenerListaVuelos ent){
     ObtenerListaVuelosResponse res = new ObtenerListaVuelosResponse();
     try {
            ListaEspera.obtenerListaVuelos();
            res.setIdVuelo1(ListaEspera.idVuelos1);
            res.setIdVuelos2(ListaEspera.idVuelos2);
        } catch (Exception e) {
            e.printStackTrace();
        }
     return res;
    }

    
    
     public HayClientesEnEsperaResponse hayClientesEnEspera(HayClientesEnEspera ent){
         HayClientesEnEsperaResponse res = new HayClientesEnEsperaResponse();
         try {
            res.setSalida(ListaEspera.hayClientesEnEspera());
        } catch (Exception e) {
            e.printStackTrace();
        }
         return res;
     }



     public ObtenerClientesResponse obtenerClientes(ObtenerClientes ent){
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
    