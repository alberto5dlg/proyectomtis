
/**
 * Aerolinea2MessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.aerolinea_1;

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


        

            if("reservarVuelo".equals(methodName)){
                
                org.example.www.aerolinea_1.ReservarVueloResponse reservarVueloResponse17 = null;
	                        org.example.www.aerolinea_1.ReservarVuelo wrappedParam =
                                                             (org.example.www.aerolinea_1.ReservarVuelo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_1.ReservarVuelo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               reservarVueloResponse17 =
                                                   
                                                   
                                                         skel.reservarVuelo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), reservarVueloResponse17, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-1/",
                                                    "reservarVuelo"));
                                    } else 

            if("disponibilidadVuelos".equals(methodName)){
                
                org.example.www.aerolinea_1.DisponibilidadVuelosResponse disponibilidadVuelosResponse19 = null;
	                        org.example.www.aerolinea_1.DisponibilidadVuelos wrappedParam =
                                                             (org.example.www.aerolinea_1.DisponibilidadVuelos)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_1.DisponibilidadVuelos.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disponibilidadVuelosResponse19 =
                                                   
                                                   
                                                         skel.disponibilidadVuelos(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disponibilidadVuelosResponse19, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-1/",
                                                    "disponibilidadVuelos"));
                                    } else 

            if("hayPlazas".equals(methodName)){
                
                org.example.www.aerolinea_1.HayPlazasResponse hayPlazasResponse21 = null;
	                        org.example.www.aerolinea_1.HayPlazas wrappedParam =
                                                             (org.example.www.aerolinea_1.HayPlazas)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_1.HayPlazas.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               hayPlazasResponse21 =
                                                   
                                                   
                                                         skel.hayPlazas(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), hayPlazasResponse21, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-1/",
                                                    "hayPlazas"));
                                    } else 

            if("cancelarVuelo".equals(methodName)){
                
                org.example.www.aerolinea_1.CancelarVueloResponse cancelarVueloResponse23 = null;
	                        org.example.www.aerolinea_1.CancelarVuelo wrappedParam =
                                                             (org.example.www.aerolinea_1.CancelarVuelo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.aerolinea_1.CancelarVuelo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancelarVueloResponse23 =
                                                   
                                                   
                                                         skel.cancelarVuelo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelarVueloResponse23, false, new javax.xml.namespace.QName("http://www.example.org/Aerolinea-1/",
                                                    "cancelarVuelo"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.ReservarVuelo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.ReservarVuelo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.ReservarVueloResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.ReservarVueloResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.DisponibilidadVuelos param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.DisponibilidadVuelos.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.DisponibilidadVuelosResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.DisponibilidadVuelosResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.HayPlazas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.HayPlazas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.HayPlazasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.HayPlazasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.CancelarVuelo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.CancelarVuelo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.aerolinea_1.CancelarVueloResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.aerolinea_1.CancelarVueloResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_1.ReservarVueloResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_1.ReservarVueloResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_1.ReservarVueloResponse wrapreservarVuelo(){
                                org.example.www.aerolinea_1.ReservarVueloResponse wrappedElement = new org.example.www.aerolinea_1.ReservarVueloResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_1.DisponibilidadVuelosResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_1.DisponibilidadVuelosResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_1.DisponibilidadVuelosResponse wrapdisponibilidadVuelos(){
                                org.example.www.aerolinea_1.DisponibilidadVuelosResponse wrappedElement = new org.example.www.aerolinea_1.DisponibilidadVuelosResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_1.HayPlazasResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_1.HayPlazasResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_1.HayPlazasResponse wraphayPlazas(){
                                org.example.www.aerolinea_1.HayPlazasResponse wrappedElement = new org.example.www.aerolinea_1.HayPlazasResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.aerolinea_1.CancelarVueloResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.aerolinea_1.CancelarVueloResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.aerolinea_1.CancelarVueloResponse wrapcancelarVuelo(){
                                org.example.www.aerolinea_1.CancelarVueloResponse wrappedElement = new org.example.www.aerolinea_1.CancelarVueloResponse();
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
        
                if (org.example.www.aerolinea_1.CancelarVuelo.class.equals(type)){
                
                        return org.example.www.aerolinea_1.CancelarVuelo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_1.CancelarVueloResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_1.CancelarVueloResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_1.DisponibilidadVuelos.class.equals(type)){
                
                        return org.example.www.aerolinea_1.DisponibilidadVuelos.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_1.DisponibilidadVuelosResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_1.DisponibilidadVuelosResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_1.HayPlazas.class.equals(type)){
                
                        return org.example.www.aerolinea_1.HayPlazas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_1.HayPlazasResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_1.HayPlazasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_1.ReservarVuelo.class.equals(type)){
                
                        return org.example.www.aerolinea_1.ReservarVuelo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.aerolinea_1.ReservarVueloResponse.class.equals(type)){
                
                        return org.example.www.aerolinea_1.ReservarVueloResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    