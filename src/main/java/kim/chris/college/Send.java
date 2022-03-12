
package kim.chris.college;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * 
 */
public class Send 
{
     public void sendMain() {
        
        String from = "draybulambo45@gmail.com";
        String toEmail = "draybulambo45@gmail.com";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "draybulambo45@gmail.com";
        String password = "Muta@7767";    //  Your email password here
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("Verify Code");
            message.setText("hey");
            Transport.send(message);
            System.out.println("ssssss");
        } catch (MessagingException e) {
            if (e.getMessage().equals("Invalid Addresses")) {
                System.out.println("Invalid email");
            } else {
                System.out.println("Error"+e.getMessage());
            }
        }
       
    }
     
}
