
/**
 * Aerolinea2MessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.aerolinea_2;

        /**
        *  Aerolinea2MessageReceiverInOut message receiver
        */

        public class Aerolinea2MessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        Aerolinea2Skeleton skel = (Aerolinea2Skeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("disponibilidadVuelosConSoloFecha".equals(methodName)){
                
                org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse disponibilidadVuelosConSoloFechaResponse25 = null;
	                        org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFecha wrappedParam =
                                                             (org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFecha)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFecha.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disponibilidadVuelosConSoloFechaResponse25 =
                                                   
                                                   
                                                         skel.disponibilidadVuelosConSoloFecha(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disponibilidadVuelosConSoloFechaResponse25, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-2/",
                                                    "disponibilidadVuelosConSoloFecha"));
                                    } else 

            if("reservarVuelo".equals(methodName)){
                
                org.example.www.aerolinea_2.ReservarVueloResponse reservarVueloResponse27 = null;
	                        org.example.www.aerolinea_2.ReservarVuelo wrappedParam =
                                                             (org.example.www.aerolinea_2.ReservarVuelo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_2.ReservarVuelo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               reservarVueloResponse27 =
                                                   
                                                   
                                                         skel.reservarVuelo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), reservarVueloResponse27, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-2/",
                                                    "reservarVuelo"));
                                    } else 

            if("hayPlazasListado".equals(methodName)){
                
                org.example.www.aerolinea_2.HayPlazasListadoResponse hayPlazasListadoResponse29 = null;
	                        org.example.www.aerolinea_2.HayPlazasListado wrappedParam =
                                                             (org.example.www.aerolinea_2.HayPlazasListado)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_2.HayPlazasListado.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               hayPlazasListadoResponse29 =
                                                   
                                                   
                                                         skel.hayPlazasListado(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), hayPlazasListadoResponse29, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-2/",
                                                    "hayPlazasListado"));
                                    } else 

            if("disponibilidadVuelos".equals(methodName)){
                
                org.example.www.aerolinea_2.DisponibilidadVuelosResponse disponibilidadVuelosResponse31 = null;
	                        org.example.www.aerolinea_2.DisponibilidadVuelos wrappedParam =
                                                             (org.example.www.aerolinea_2.DisponibilidadVuelos)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_2.DisponibilidadVuelos.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disponibilidadVuelosResponse31 =
                                                   
                                                   
                                                         skel.disponibilidadVuelos(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disponibilidadVuelosResponse31, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-2/",
                                                    "disponibilidadVuelos"));
                                    } else 

            if("cancelarVuelo".equals(methodName)){
                
                org.example.www.aerolinea_2.CancelarVueloResponse cancelarVueloResponse33 = null;
	                        org.example.www.aerolinea_2.CancelarVuelo wrappedParam =
                                                             (org.example.www.aerolinea_2.CancelarVuelo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_2.CancelarVuelo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancelarVueloResponse33 =
                                                   
                                                   
                                                         skel.cancelarVuelo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelarVueloResponse33, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-2/",
                                                    "cancelarVuelo"));
                                    } else 

            if("hayPlazas".equals(methodName)){
                
                org.example.www.aerolinea_2.HayPlazasResponse hayPlazasResponse35 = null;
	                        org.example.www.aerolinea_2.HayPlazas wrappedParam =
                                                             (org.example.www.aerolinea_2.HayPlazas)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_2.HayPlazas.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               hayPlazasResponse35 =
                                                   
                                                   
                                                         skel.hayPlazas(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), hayPlazasResponse35, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-2/",
                                                    "hayPlazas"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFecha param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFecha.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.ReservarVuelo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.ReservarVuelo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.ReservarVueloResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.ReservarVueloResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.HayPlazasListado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.HayPlazasListado.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.HayPlazasListadoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.HayPlazasListadoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.DisponibilidadVuelos param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.DisponibilidadVuelos.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.DisponibilidadVuelosResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.DisponibilidadVuelosResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.CancelarVuelo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.CancelarVuelo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.CancelarVueloResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.CancelarVueloResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.HayPlazas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.HayPlazas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_2.HayPlazasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_2.HayPlazasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse wrapdisponibilidadVuelosConSoloFecha(){
                                org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse wrappedElement = new org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_2.ReservarVueloResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_2.ReservarVueloResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_2.ReservarVueloResponse wrapreservarVuelo(){
                                org.example.www.aerolinea_2.ReservarVueloResponse wrappedElement = new org.example.www.aerolinea_2.ReservarVueloResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_2.HayPlazasListadoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_2.HayPlazasListadoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_2.HayPlazasListadoResponse wraphayPlazasListado(){
                                org.example.www.aerolinea_2.HayPlazasListadoResponse wrappedElement = new org.example.www.aerolinea_2.HayPlazasListadoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_2.DisponibilidadVuelosResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_2.DisponibilidadVuelosResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_2.DisponibilidadVuelosResponse wrapdisponibilidadVuelos(){
                                org.example.www.aerolinea_2.DisponibilidadVuelosResponse wrappedElement = new org.example.www.aerolinea_2.DisponibilidadVuelosResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_2.CancelarVueloResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_2.CancelarVueloResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_2.CancelarVueloResponse wrapcancelarVuelo(){
                                org.example.www.aerolinea_2.CancelarVueloResponse wrappedElement = new org.example.www.aerolinea_2.CancelarVueloResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_2.HayPlazasResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_2.HayPlazasResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_2.HayPlazasResponse wraphayPlazas(){
                                org.example.www.aerolinea_2.HayPlazasResponse wrappedElement = new org.example.www.aerolinea_2.HayPlazasResponse();
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
        
                if (org.example.www.aerolinea_2.CancelarVuelo.class.equals(type)){
                
                        return org.example.www.aerolinea_2.CancelarVuelo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.CancelarVueloResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_2.CancelarVueloResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.DisponibilidadVuelos.class.equals(type)){
                
                        return org.example.www.aerolinea_2.DisponibilidadVuelos.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFecha.class.equals(type)){
                
                        return org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFecha.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_2.DisponibilidadVuelosConSoloFechaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.DisponibilidadVuelosResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_2.DisponibilidadVuelosResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.HayPlazas.class.equals(type)){
                
                        return org.example.www.aerolinea_2.HayPlazas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.HayPlazasListado.class.equals(type)){
                
                        return org.example.www.aerolinea_2.HayPlazasListado.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.HayPlazasListadoResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_2.HayPlazasListadoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.HayPlazasResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_2.HayPlazasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.ReservarVuelo.class.equals(type)){
                
                        return org.example.www.aerolinea_2.ReservarVuelo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_2.ReservarVueloResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_2.ReservarVueloResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    