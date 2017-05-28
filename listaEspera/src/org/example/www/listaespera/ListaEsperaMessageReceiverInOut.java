
/**
 * ListaEsperaMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.listaespera;

        /**
        *  ListaEsperaMessageReceiverInOut message receiver
        */

        public class ListaEsperaMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ListaEsperaSkeleton skel = (ListaEsperaSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("obtenerClientesANotificar".equals(methodName)){
                
                org.example.www.listaespera.ObtenerClientesANotificarResponse obtenerClientesANotificarResponse21 = null;
	                        org.example.www.listaespera.ObtenerClientesANotificar wrappedParam =
                                                             (org.example.www.listaespera.ObtenerClientesANotificar)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.listaespera.ObtenerClientesANotificar.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               obtenerClientesANotificarResponse21 =
                                                   
                                                   
                                                         skel.obtenerClientesANotificar(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), obtenerClientesANotificarResponse21, false, new javax.xml.namespace.QName("http://www.example.org/listaEspera/",
                                                    "obtenerClientesANotificar"));
                                    } else 

            if("anyadirAListaDeEspera".equals(methodName)){
                
                org.example.www.listaespera.AnyadirAListaDeEsperaResponse anyadirAListaDeEsperaResponse23 = null;
	                        org.example.www.listaespera.AnyadirAListaDeEspera wrappedParam =
                                                             (org.example.www.listaespera.AnyadirAListaDeEspera)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.listaespera.AnyadirAListaDeEspera.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               anyadirAListaDeEsperaResponse23 =
                                                   
                                                   
                                                         skel.anyadirAListaDeEspera(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), anyadirAListaDeEsperaResponse23, false, new javax.xml.namespace.QName("http://www.example.org/listaEspera/",
                                                    "anyadirAListaDeEspera"));
                                    } else 

            if("obtenerListaVuelos".equals(methodName)){
                
                org.example.www.listaespera.ObtenerListaVuelosResponse obtenerListaVuelosResponse25 = null;
	                        org.example.www.listaespera.ObtenerListaVuelos wrappedParam =
                                                             (org.example.www.listaespera.ObtenerListaVuelos)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.listaespera.ObtenerListaVuelos.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               obtenerListaVuelosResponse25 =
                                                   
                                                   
                                                         skel.obtenerListaVuelos(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), obtenerListaVuelosResponse25, false, new javax.xml.namespace.QName("http://www.example.org/listaEspera/",
                                                    "obtenerListaVuelos"));
                                    } else 

            if("hayClientesEnEspera".equals(methodName)){
                
                org.example.www.listaespera.HayClientesEnEsperaResponse hayClientesEnEsperaResponse27 = null;
	                        org.example.www.listaespera.HayClientesEnEspera wrappedParam =
                                                             (org.example.www.listaespera.HayClientesEnEspera)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.listaespera.HayClientesEnEspera.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               hayClientesEnEsperaResponse27 =
                                                   
                                                   
                                                         skel.hayClientesEnEspera(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), hayClientesEnEsperaResponse27, false, new javax.xml.namespace.QName("http://www.example.org/listaEspera/",
                                                    "hayClientesEnEspera"));
                                    } else 

            if("obtenerClientes".equals(methodName)){
                
                org.example.www.listaespera.ObtenerClientesResponse obtenerClientesResponse29 = null;
	                        org.example.www.listaespera.ObtenerClientes wrappedParam =
                                                             (org.example.www.listaespera.ObtenerClientes)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.listaespera.ObtenerClientes.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               obtenerClientesResponse29 =
                                                   
                                                   
                                                         skel.obtenerClientes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), obtenerClientesResponse29, false, new javax.xml.namespace.QName("http://www.example.org/listaEspera/",
                                                    "obtenerClientes"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.ObtenerClientesANotificar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.ObtenerClientesANotificar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.ObtenerClientesANotificarResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.ObtenerClientesANotificarResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.AnyadirAListaDeEspera param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.AnyadirAListaDeEspera.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.AnyadirAListaDeEsperaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.AnyadirAListaDeEsperaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.ObtenerListaVuelos param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.ObtenerListaVuelos.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.ObtenerListaVuelosResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.ObtenerListaVuelosResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.HayClientesEnEspera param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.HayClientesEnEspera.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.HayClientesEnEsperaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.HayClientesEnEsperaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.ObtenerClientes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.ObtenerClientes.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.listaespera.ObtenerClientesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.listaespera.ObtenerClientesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.listaespera.ObtenerClientesANotificarResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.listaespera.ObtenerClientesANotificarResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.listaespera.ObtenerClientesANotificarResponse wrapobtenerClientesANotificar(){
                                org.example.www.listaespera.ObtenerClientesANotificarResponse wrappedElement = new org.example.www.listaespera.ObtenerClientesANotificarResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.listaespera.AnyadirAListaDeEsperaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.listaespera.AnyadirAListaDeEsperaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.listaespera.AnyadirAListaDeEsperaResponse wrapanyadirAListaDeEspera(){
                                org.example.www.listaespera.AnyadirAListaDeEsperaResponse wrappedElement = new org.example.www.listaespera.AnyadirAListaDeEsperaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.listaespera.ObtenerListaVuelosResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.listaespera.ObtenerListaVuelosResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.listaespera.ObtenerListaVuelosResponse wrapobtenerListaVuelos(){
                                org.example.www.listaespera.ObtenerListaVuelosResponse wrappedElement = new org.example.www.listaespera.ObtenerListaVuelosResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.listaespera.HayClientesEnEsperaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.listaespera.HayClientesEnEsperaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.listaespera.HayClientesEnEsperaResponse wraphayClientesEnEspera(){
                                org.example.www.listaespera.HayClientesEnEsperaResponse wrappedElement = new org.example.www.listaespera.HayClientesEnEsperaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.listaespera.ObtenerClientesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.listaespera.ObtenerClientesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.listaespera.ObtenerClientesResponse wrapobtenerClientes(){
                                org.example.www.listaespera.ObtenerClientesResponse wrappedElement = new org.example.www.listaespera.ObtenerClientesResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.listaespera.AnyadirAListaDeEspera.class.equals(type)){
                
                        return org.example.www.listaespera.AnyadirAListaDeEspera.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.AnyadirAListaDeEsperaResponse.class.equals(type)){
                
                        return org.example.www.listaespera.AnyadirAListaDeEsperaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.HayClientesEnEspera.class.equals(type)){
                
                        return org.example.www.listaespera.HayClientesEnEspera.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.HayClientesEnEsperaResponse.class.equals(type)){
                
                        return org.example.www.listaespera.HayClientesEnEsperaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.ObtenerClientes.class.equals(type)){
                
                        return org.example.www.listaespera.ObtenerClientes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.ObtenerClientesANotificar.class.equals(type)){
                
                        return org.example.www.listaespera.ObtenerClientesANotificar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.ObtenerClientesANotificarResponse.class.equals(type)){
                
                        return org.example.www.listaespera.ObtenerClientesANotificarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.ObtenerClientesResponse.class.equals(type)){
                
                        return org.example.www.listaespera.ObtenerClientesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.ObtenerListaVuelos.class.equals(type)){
                
                        return org.example.www.listaespera.ObtenerListaVuelos.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.listaespera.ObtenerListaVuelosResponse.class.equals(type)){
                
                        return org.example.www.listaespera.ObtenerListaVuelosResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    