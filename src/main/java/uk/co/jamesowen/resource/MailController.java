package uk.co.jamesowen.resource;

import com.codahale.metrics.annotation.Timed;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Properties;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Path("/email")
public class MailController {

    @POST
    @Timed
    public Response addUser(EmailMessage request) {
        sendEmail(request);
        return Response.ok().build();
    }

    private void sendEmail(EmailMessage request) {
        final String username = "07009003@hope.ac.uk";
        final String password = "Jimmytime88";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("DONTMATTER@someone.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("07009003@hope.ac.uk"));
            message.setSubject("Email from JamesOwenTech");
            message.setText(request.getMessage());

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

