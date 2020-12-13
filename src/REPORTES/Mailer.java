package REPORTES;

import BEAN.Cliente;
import BEAN.Det_DocVenta;
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
    
    public void sendbol(Det_DocVenta ddv){
        String aux;
        Properties propiedad = new Properties(); 
        propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable","true");
        propiedad.setProperty("mail.smtp.port","587");
        propiedad.setProperty("mail.smtp.auth","true");
       
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnviar = "marketbarrio2020@gmail.com";
        String contraseña = "Minecraft!";
        String destinatario = "danitocastillo7@gmail.com";
        String asunto = "Boleta MarketBarrio2020";
        aux = "IDVENTA: '"+ddv.getIdVenta()+"' Id Producto: '"+ddv.getIdProducto()+"'Precio: '"+ddv.getPrecio()+"'Cantidad: '"+ddv.getCantidad()+"'";
        String mensaje = aux;
        
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
            aux = "";
                    
        } catch(MessagingException ex) {
            System.out.println("Existe un Error en el mailer:"+ex);
        }    
    }
    
    public void senFac(Det_DocVenta ddv){
        String aux;
        Properties propiedad = new Properties(); 
        propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable","true");
        propiedad.setProperty("mail.smtp.port","587");
        propiedad.setProperty("mail.smtp.auth","true");
       
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnviar = "marketbarrio2020@gmail.com";
        String contraseña = "Minecraft!";
        String destinatario = "danitocastillo7@gmail.com";
        String asunto = "Facatura MarketBarrio2020";
        
        aux = "IDVENTA: "+ddv.getIdVenta()+" \nId Producto: "+ddv.getIdProducto()+", Precio: "+ddv.getPrecio()+",  Cantidad:  "+ddv.getCantidad()+"'";
        String mensaje = aux;
        
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
                    
        } catch(MessagingException ex) {
            System.out.println("Existe un Error en el mailer:"+ex);
    
        }
    }
}
