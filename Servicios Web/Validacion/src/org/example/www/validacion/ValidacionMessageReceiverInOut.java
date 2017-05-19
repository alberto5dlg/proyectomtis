
/**
 * ValidacionMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.validacion;

        /**
        *  ValidacionMessageReceiverInOut message receiver
        */

        public class ValidacionMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ValidacionSkeleton skel = (ValidacionSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("validarIBAN".equals(methodName)){
                
                org.example.www.validacion.ValidarIBANResponse validarIBANResponse21 = null;
	                        org.example.www.validacion.ValidarIBAN wrappedParam =
                                                             (org.example.www.validacion.ValidarIBAN)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.validacion.ValidarIBAN.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarIBANResponse21 =
                                                   
                                                   
                                                         skel.validarIBAN(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarIBANResponse21, false, new javax.xml.namespace.QName("http://www.example.org/Validacion/",
                                                    "validarIBAN"));
                                    } else 

            if("validarFecha".equals(methodName)){
                
                org.example.www.validacion.ValidarFechaResponse validarFechaResponse23 = null;
	                        org.example.www.validacion.ValidarFecha wrappedParam =
                                                             (org.example.www.validacion.ValidarFecha)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.validacion.ValidarFecha.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarFechaResponse23 =
                                                   
                                                   
                                                         skel.validarFecha(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarFechaResponse23, false, new javax.xml.namespace.QName("http://www.example.org/Validacion/",
                                                    "validarFecha"));
                                    } else 

            if("validarDNI".equals(methodName)){
                
                org.example.www.validacion.ValidarDNIResponse validarDNIResponse25 = null;
	                        org.example.www.validacion.ValidarDNI wrappedParam =
                                                             (org.example.www.validacion.ValidarDNI)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.validacion.ValidarDNI.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarDNIResponse25 =
                                                   
                                                   
                                                         skel.validarDNI(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarDNIResponse25, false, new javax.xml.namespace.QName("http://www.example.org/Validacion/",
                                                    "validarDNI"));
                                    } else 

            if("validarTarjeta".equals(methodName)){
                
                org.example.www.validacion.ValidarTarjetaResponse validarTarjetaResponse27 = null;
	                        org.example.www.validacion.ValidarTarjeta wrappedParam =
                                                             (org.example.www.validacion.ValidarTarjeta)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.validacion.ValidarTarjeta.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarTarjetaResponse27 =
                                                   
                                                   
                                                         skel.validarTarjeta(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarTarjetaResponse27, false, new javax.xml.namespace.QName("http://www.example.org/Validacion/",
                                                    "validarTarjeta"));
                                    } else 

            if("validarUsuario".equals(methodName)){
                
                org.example.www.validacion.ValidarUsuarioResponse validarUsuarioResponse29 = null;
	                        org.example.www.validacion.ValidarUsuario wrappedParam =
                                                             (org.example.www.validacion.ValidarUsuario)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.validacion.ValidarUsuario.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarUsuarioResponse29 =
                                                   
                                                   
                                                         skel.validarUsuario(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarUsuarioResponse29, false, new javax.xml.namespace.QName("http://www.example.org/Validacion/",
                                                    "validarUsuario"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarIBAN param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarIBAN.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarIBANResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarIBANResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarFecha param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarFecha.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarFechaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarFechaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarDNI param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarDNI.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarDNIResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarDNIResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarTarjeta param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarTarjeta.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarTarjetaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarTarjetaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarUsuario param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarUsuario.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.validacion.ValidarUsuarioResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.validacion.ValidarUsuarioResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.validacion.ValidarIBANResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.validacion.ValidarIBANResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.validacion.ValidarIBANResponse wrapValidarIBAN(){
                                org.example.www.validacion.ValidarIBANResponse wrappedElement = new org.example.www.validacion.ValidarIBANResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.validacion.ValidarFechaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.validacion.ValidarFechaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.validacion.ValidarFechaResponse wrapValidarFecha(){
                                org.example.www.validacion.ValidarFechaResponse wrappedElement = new org.example.www.validacion.ValidarFechaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.validacion.ValidarDNIResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.validacion.ValidarDNIResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.validacion.ValidarDNIResponse wrapValidarDNI(){
                                org.example.www.validacion.ValidarDNIResponse wrappedElement = new org.example.www.validacion.ValidarDNIResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.validacion.ValidarTarjetaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.validacion.ValidarTarjetaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.validacion.ValidarTarjetaResponse wrapValidarTarjeta(){
                                org.example.www.validacion.ValidarTarjetaResponse wrappedElement = new org.example.www.validacion.ValidarTarjetaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.validacion.ValidarUsuarioResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.validacion.ValidarUsuarioResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.validacion.ValidarUsuarioResponse wrapValidarUsuario(){
                                org.example.www.validacion.ValidarUsuarioResponse wrappedElement = new org.example.www.validacion.ValidarUsuarioResponse();
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
        
                if (org.example.www.validacion.ValidarDNI.class.equals(type)){
                
                        return org.example.www.validacion.ValidarDNI.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarDNIResponse.class.equals(type)){
                
                        return org.example.www.validacion.ValidarDNIResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarFecha.class.equals(type)){
                
                        return org.example.www.validacion.ValidarFecha.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarFechaResponse.class.equals(type)){
                
                        return org.example.www.validacion.ValidarFechaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarIBAN.class.equals(type)){
                
                        return org.example.www.validacion.ValidarIBAN.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarIBANResponse.class.equals(type)){
                
                        return org.example.www.validacion.ValidarIBANResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarTarjeta.class.equals(type)){
                
                        return org.example.www.validacion.ValidarTarjeta.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarTarjetaResponse.class.equals(type)){
                
                        return org.example.www.validacion.ValidarTarjetaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarUsuario.class.equals(type)){
                
                        return org.example.www.validacion.ValidarUsuario.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.validacion.ValidarUsuarioResponse.class.equals(type)){
                
                        return org.example.www.validacion.ValidarUsuarioResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    