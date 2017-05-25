package org.example.www.envios;

import java.util.Properties;
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

public class EnviosSkeleton{

	public org.example.www.envios.EnviarCorreoResponse enviarCorreo(org.example.www.envios.EnviarCorreo enviarCorreo){
		EnviarCorreoResponse response = new EnviarCorreoResponse();
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
		     msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(enviarCorreo.getDestinatario(),false));
		     msg.setSubject(enviarCorreo.getAsunto());
		     msg.setText(enviarCorreo.getMensaje());
		     msg.setSentDate(new Date());
		     Transport.send(msg);
		     response.setEnviado(true);
		     System.out.println("Mensaje Enviado ... ");
		  }catch (MessagingException e){ 
			  System.out.println("Error en el envio: " + e.getMessage());
		  }
		  
		return response; 
    }
     
}
    