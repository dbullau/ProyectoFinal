package co.edu.unbosque.model;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import enviocorreo.EnvioCorreos;

public class Correos {
	private static String emailFrom = "";
    private static String passwordFrom = "";
    
    
    private String contenido;
    private String emailTo;// aca va el correo que ingresa el usuario//
    private Properties mPropiedades;
    private Session mSecion;
    private MimeMessage mCorreo;
    private String asunto;
    
    private void crearCorreo() {
    	  emailTo = txtTo.getText().trim();// aca va el esoacio donde  ingresa el usuario su correo//
          asunto = "tu cuenta asido creada !";
          contenido = txtcontenido.getText().trim();// aca va el usuario y la contraseña de los que se registran//
          
           // Simple mail transfer protocol
         mPropiedades.put("mail.smtp.host", "smtp.gmail.com");
         mPropiedades.put("mail.smtp.ssl.trust", "smtp.gmail.com");
         mPropiedades.setProperty("mail.smtp.starttls.enable", "true");
         mPropiedades.setProperty("mail.smtp.port", "587");
         mPropiedades.setProperty("mail.smtp.user",emailFrom);
         mPropiedades.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
         mPropiedades.setProperty("mail.smtp.auth", "true");
          
          mSecion = Session.getDefaultInstance(mPropiedades);
    
    try {
        mCorreo = new MimeMessage(mSecion);
        mCorreo.setFrom(new InternetAddress(emailFrom));
        mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo)); // aqui va la variable de el correo de el usuario  que se registro//
        mCorreo.setSubject(asunto);
        mCorreo.setText(contenido, "ISO-8859-1", "html");
                 
        
    } catch (AddressException ex) {
        Logger.getLogger(Correos.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MessagingException ex) {
        Logger.getLogger(Correos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

private void sendEmail() {
    try {
        Transport mTransport = mSecion.getTransport("smtp");
        mTransport.connect(emailFrom, passwordFrom);
        mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
        mTransport.close();
        
        JOptionPane.showMessageDialog(null, "se le envio un correo de confirmacion ");
    } catch (NoSuchProviderException ex) {
        Logger.getLogger(Correos.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MessagingException ex) {
        Logger.getLogger(Correos.class.getName()).log(Level.SEVERE, null, ex);
    }

}
}
