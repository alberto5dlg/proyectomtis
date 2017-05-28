
/**
 * EnviosSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.envios;
    import java.util.Date;
    import java.util.Properties;

    import javax.mail.Authenticator;
        import javax.mail.Message;
        import javax.mail.MessagingException;
        import javax.mail.PasswordAuthentication;
        import javax.mail.Session;
        import javax.mail.Transport;
        import javax.mail.internet.AddressException;
        import javax.mail.internet.InternetAddress;
        import javax.mail.internet.MimeMessage;

    

/**
     *  EnviosSkeleton java skeleton for the axisService
     */
    public class EnviosSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param enviarListado 
             * @return enviarListadoResponse 
         */
        
                 public org.example.www.envios.EnviarListadoResponse enviarListado
                  (
                  org.example.www.envios.EnviarListado ent
                  )
            {
                	 EnviarListadoResponse res = new EnviarListadoResponse();
                	 String[] destinos = ent.getDestinatario();
                	 String[] mensajes = ent.getMensaje();
                	 int tam = destinos.length;
                	 for(int i=0; i<tam; i++){
                		if(!enviaCorreo(destinos[i],ent.getAsunto(),mensajes[i],ent.getFichero()))
                			res.setEnviado(false);
                	 }
                	 res.setEnviado(true);
                	 return res;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param enviarCorreo 
             * @return enviarCorreoResponse 
         */
        
                 public org.example.www.envios.EnviarCorreoResponse enviarCorreo
                  (
                  org.example.www.envios.EnviarCorreo ent
                  )
            {
                	 EnviarCorreoResponse response = new EnviarCorreoResponse();
                	 response.setEnviado(enviaCorreo(ent.getDestinatario(),ent.getAsunto(),ent.getMensaje(),ent.getFichero()));
                	 return response;
        }
                 
                 public boolean enviaCorreo(String dest,String asunto,String mensaje,String fichero){
                     	final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
                       // Get a Properties object
                          Properties props = System.getProperties();
                          props.setProperty("mail.smtp.host", "smtp.gmail.com");
                          props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
                          props.setProperty("mail.smtp.socketFactory.fallback", "false");
                          props.setProperty("mail.smtp.port", "465");
                          props.setProperty("mail.smtp.socketFactory.port", "465");
                          props.put("mail.smtp.auth", "true");
                          props.put("mail.debug", "true");
                          props.put("mail.store.protocol", "pop3");
                          props.put("mail.transport.protocol", "smtp");
                          final String username = "proyectomtisua@gmail.com";//
                          final String password = "proyectoviajes";
                          try{
                          Session session = Session.getDefaultInstance(props, 
                                               new Authenticator(){
                                                  protected PasswordAuthentication getPasswordAuthentication() {
                                                     return new PasswordAuthentication(username, password);
                                                  }});

                        // -- Create a new message --
                          Message msg = new MimeMessage(session);

                       // -- Set the FROM and TO fields --
                          msg.setFrom(new InternetAddress("proyectomtisua@gmail.com"));
                          msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(dest,false));
                          msg.setSubject(asunto);
                          msg.setText(mensaje);
                          msg.setSentDate(new Date());
                          Transport.send(msg);
                          System.out.println("Mensaje Enviado ... ");
                          return true;
                       }catch (MessagingException e){ 
                           System.out.println("Error en el envio: " + e.getMessage());
                           return false;
                       }
                       
                 }
     
    }
    