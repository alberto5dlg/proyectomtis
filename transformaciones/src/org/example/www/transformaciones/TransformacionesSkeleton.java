
/**
 * TransformacionesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.transformaciones;
    /**
     *  TransformacionesSkeleton java skeleton for the axisService
     */
    public class TransformacionesSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param fechas 
             * @return fechasResponse 
         */
        
                 public org.example.www.transformaciones.FechasResponse fechas
                  (
                  org.example.www.transformaciones.Fechas fechas
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#fechas");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param facturaToPDF 
             * @return facturaToPDFResponse 
         */
        
                 public org.example.www.transformaciones.FacturaToPDFResponse facturaToPDF
                  (
                  org.example.www.transformaciones.FacturaToPDF facturaToPDF
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#facturaToPDF");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param jSONtoXML 
             * @return jSONtoXMLResponse 
         */
        
                 public org.example.www.transformaciones.JSONtoXMLResponse jSONtoXML
                 (
                 org.example.www.transformaciones.JSONtoXML ent
                 )
           {
               	 JSONtoXMLResponse res = new JSONtoXMLResponse();
               	 res.setXml(Transformar.jsonToXml(ent.getJson()));
               	 return res;
           }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param xMLtoJSON 
             * @return xMLtoJSONResponse 
         */
        
                 public org.example.www.transformaciones.XMLtoJSONResponse xMLtoJSON
                 (
                 org.example.www.transformaciones.XMLtoJSON ent
                 )
           {
               	 XMLtoJSONResponse res = new XMLtoJSONResponse();
               	 res.setJson(Transformar.xmlToJson(ent.getXml()));
               	 return res;
       }
     
    }
    