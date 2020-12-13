package REPORTES;

import BEAN.Cliente;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class Mailer{
    Cliente c = new Cliente();
    public void Mailerr(){
        Properties propiedad = new Properties(); 
        propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable","true");
        propiedad.setProperty("mail.smtp.port","587");
        propiedad.setProperty("mail.smtp.auth","true");
     /*   
        Session sesion = Session.getDefaultInstance(propiedad);
        String fech = 
        String correoEnviar = "marketbarrio2020@gmail.com";
        String contraseña = "Minecraft!";
        String destinatario = txtRecibe.getText();
        
        String asunto = "Boleta MarketBarrio2020";
        String mensaje = txtMensaje.getText();
        
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress (correoEnviar));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnviar,contraseña);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(null,"Correo Enviado");
            
            Limpia();
                    
        } catch (MessagingException ex) {
            Logger.getLogger(Panel1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
        
       
    }
}
