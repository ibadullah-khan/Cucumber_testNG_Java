package UtilitiesFactory;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailReportFactory {

    public static int passed,failed = 0;

    public void EmailReporter() {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication("shoebaccaautomation@gmail.com", "shoebacca@987");
                    }
                }
        );
        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("shoebaccaautomation@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ibadullah.khan@systemsltd.com,muhammad.jamshed@systemsltd.com"));
//            message.setSubject("Shoebecca Test Execution");
//            String messageString= "<head>\n" +
//                    "<style>\n" +
//                    "table {\n" +
//                    "  font-family: arial, sans-serif;\n" +
//                    "  border-collapse: collapse;\n" +
//                    "  width: 60%;\n" +
//                    "}\n" +
//                    "\n" +
//                    "td, th {\n" +
//                    "  border: 3px solid #dddddd;\n" +
//                    "  text-align: center;\n" +
//                    "  padding: 8px;\n" +
//                    "}\n" +
//                    "\n" +
//                    "tr:nth-child(even) {\n" +
//                    "  background-color: #dddddd;\n" +
//                    "}\n" +
//                    "</style>\n" +
//                    "</head>\n" +
//                    "<body>\n" +
//                    "<br><br><h1 style='text-align:center'>ShoeBacca Test Execution Report</h1>\n" +
//                    "<h3 style='text-align:center'>URL: https://stg.shoebacca.com</h3>\n" +
//                    "<table>\n" +
//                    "  <tr>\n" +
//                    "    <th>Type</th>\n" +
//                    "    <th>Count</th>\n" +
//                    "    <th>Percentage</th>\n" +
//                    "  </tr>\n" +
//                    "  <tr>\n" +
//                    "    <td>Total</td>\n" +
//                    "    <td>"+(passed+failed)+"</td>\n" +
//                    "    <td>-</td>\n" +
//                    "  </tr>\n" +
//                    "  <tr>\n" +
//                    "    <td>Passed</td>\n" +
//                    "    <td style='color:green'>"+passed+"</td>\n" +
//                    "    <td style='color:green'>"+(passed/(passed+failed))*100+"%</td>\n" +
//                    "  </tr>\n" +
//                    "  <tr>\n" +
//                    "    <td>Failed</td>\n" +
//                    "    <td style='color:red'>"+failed+"</td>\n" +
//                    "    <td style='color:red'>"+(failed/(passed+failed))*100+"%</td>\n" +
//                    "  </tr>\n" +
//                    "</table>\n" +
//                    "\n" +
//                    "<p>For Detailed Report, Execution Report is Attached to the email</p>\n" +
//                    "\n" +
//                    "<p><i>*Note: This is an automatically generated email – please do not reply to it.</i></p>\n" +
//                    "\n" +
//                    "</body>";
//
//            // Create another object to add another content
//            MimeBodyPart attachment= new MimeBodyPart();
//            // Mention the file which you want to send
//            String filename = "target/executionReports/extentreport.html";
//            // Create data source and pass the filename
//            DataSource source = new FileDataSource(filename);
//            // set the handler
//            attachment.setDataHandler(new DataHandler(source));
//            // set the file
//            attachment.setFileName(filename);
//
//            // Create another object to add another content
//            MimeBodyPart body= new MimeBodyPart();
//            // set the handler
//            body.setContent(messageString,"text/html");
//
//            // Create object of MimeMultipart class
//            Multipart multipart = new MimeMultipart();
//            // add body part 1
//            multipart.addBodyPart(attachment);
//            multipart.addBodyPart(body);
//            message.setContent(multipart);
//            Transport.send(message);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
