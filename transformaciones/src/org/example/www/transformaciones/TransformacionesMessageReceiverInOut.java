
/**
 * TransformacionesMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.transformaciones;

        /**
        *  TransformacionesMessageReceiverInOut message receiver
        */

        public class TransformacionesMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TransformacionesSkeleton skel = (TransformacionesSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("fechas".equals(methodName)){
                
                org.example.www.transformaciones.FechasResponse fechasResponse17 = null;
	                        org.example.www.transformaciones.Fechas wrappedParam =
                                                             (org.example.www.transformaciones.Fechas)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.transformaciones.Fechas.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               fechasResponse17 =
                                                   
                                                   
                                                         skel.fechas(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), fechasResponse17, false, new javax.xml.namespace.QName("http://www.example.org/Transformaciones/",
                                                    "fechas"));
                                    } else 

            if("facturaToPDF".equals(methodName)){
                
                org.example.www.transformaciones.FacturaToPDFResponse facturaToPDFResponse19 = null;
	                        org.example.www.transformaciones.FacturaToPDF wrappedParam =
                                                             (org.example.www.transformaciones.FacturaToPDF)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.transformaciones.FacturaToPDF.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               facturaToPDFResponse19 =
                                                   
                                                   
                                                         skel.facturaToPDF(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), facturaToPDFResponse19, false, new javax.xml.namespace.QName("http://www.example.org/Transformaciones/",
                                                    "facturaToPDF"));
                                    } else 

            if("jSONtoXML".equals(methodName)){
                
                org.example.www.transformaciones.JSONtoXMLResponse jSONtoXMLResponse21 = null;
	                        org.example.www.transformaciones.JSONtoXML wrappedParam =
                                                             (org.example.www.transformaciones.JSONtoXML)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.transformaciones.JSONtoXML.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               jSONtoXMLResponse21 =
                                                   
                                                   
                                                         skel.jSONtoXML(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jSONtoXMLResponse21, false, new javax.xml.namespace.QName("http://www.example.org/Transformaciones/",
                                                    "jSONtoXML"));
                                    } else 

            if("xMLtoJSON".equals(methodName)){
                
                org.example.www.transformaciones.XMLtoJSONResponse xMLtoJSONResponse23 = null;
	                        org.example.www.transformaciones.XMLtoJSON wrappedParam =
                                                             (org.example.www.transformaciones.XMLtoJSON)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.transformaciones.XMLtoJSON.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               xMLtoJSONResponse23 =
                                                   
                                                   
                                                         skel.xMLtoJSON(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), xMLtoJSONResponse23, false, new javax.xml.namespace.QName("http://www.example.org/Transformaciones/",
                                                    "xMLtoJSON"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.Fechas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.Fechas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.FechasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.FechasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.FacturaToPDF param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.FacturaToPDF.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.FacturaToPDFResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.FacturaToPDFResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.JSONtoXML param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.JSONtoXML.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.JSONtoXMLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.JSONtoXMLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.XMLtoJSON param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.XMLtoJSON.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.transformaciones.XMLtoJSONResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.transformaciones.XMLtoJSONResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.transformaciones.FechasResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.transformaciones.FechasResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.transformaciones.FechasResponse wrapfechas(){
                                org.example.www.transformaciones.FechasResponse wrappedElement = new org.example.www.transformaciones.FechasResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.transformaciones.FacturaToPDFResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.transformaciones.FacturaToPDFResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.transformaciones.FacturaToPDFResponse wrapfacturaToPDF(){
                                org.example.www.transformaciones.FacturaToPDFResponse wrappedElement = new org.example.www.transformaciones.FacturaToPDFResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.transformaciones.JSONtoXMLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.transformaciones.JSONtoXMLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.transformaciones.JSONtoXMLResponse wrapJSONtoXML(){
                                org.example.www.transformaciones.JSONtoXMLResponse wrappedElement = new org.example.www.transformaciones.JSONtoXMLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.transformaciones.XMLtoJSONResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.transformaciones.XMLtoJSONResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.transformaciones.XMLtoJSONResponse wrapXMLtoJSON(){
                                org.example.www.transformaciones.XMLtoJSONResponse wrappedElement = new org.example.www.transformaciones.XMLtoJSONResponse();
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
        
                if (org.example.www.transformaciones.FacturaToPDF.class.equals(type)){
                
                        return org.example.www.transformaciones.FacturaToPDF.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.transformaciones.FacturaToPDFResponse.class.equals(type)){
                
                        return org.example.www.transformaciones.FacturaToPDFResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.transformaciones.Fechas.class.equals(type)){
                
                        return org.example.www.transformaciones.Fechas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.transformaciones.FechasResponse.class.equals(type)){
                
                        return org.example.www.transformaciones.FechasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.transformaciones.JSONtoXML.class.equals(type)){
                
                        return org.example.www.transformaciones.JSONtoXML.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.transformaciones.JSONtoXMLResponse.class.equals(type)){
                
                        return org.example.www.transformaciones.JSONtoXMLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.transformaciones.XMLtoJSON.class.equals(type)){
                
                        return org.example.www.transformaciones.XMLtoJSON.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.transformaciones.XMLtoJSONResponse.class.equals(type)){
                
                        return org.example.www.transformaciones.XMLtoJSONResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    