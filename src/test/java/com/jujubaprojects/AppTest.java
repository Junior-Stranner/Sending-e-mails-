package com.jujubaprojects;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 * Unit test for simple App.
 */
public class AppTest {
    private String userName = "JuniorTesteStranner";
    private String password = "ydbggjggqpccobdf";
    /**
     * Rigorous Test :-)
     */
   @org.junit.Test 
public void testeEmail(){

    try {

         /*Olhe as configurações smtp do seu E-mail*/
        Properties properties = new Properties();

        properties.put("mail.smtp.ssl.trust","*");
        properties.put("mail.smtp.auth","true");/*Autorização */
        properties.put("mail.smtp.auth","true");/*Autorização */
        properties.put("mail.smtp.starttls", "true");/*Autenticação */
        properties.put("mail.smtp.host","smtp.gmail.com");/*Servidor Gmail Google */
        properties.put("mail.smtp.port","465");/*Porta do Servidor */
        properties.put("mail.smtp.socketFactory.port","465");/*Especifica a porta a ser Conectada pela socket */
        properties.put("mail.smtp.socketFactory.Class","javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão ao SMTP*/

       Session session = Session.getInstance(properties, new Authenticator() {
        protected  PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(userName, password);

           }
       });

       Address[] toUser = InternetAddress.parse("JuniorTesteStranner");

       Message message = new MimeMessage(session);
       message.setFrom(new InternetAddress(userName));/*Quem está enviando */
       message.setRecipients(Message.RecipientType.TO,toUser);/*E-mail de destino "Para quem estou enviando" */
       message.setSubject("E-mail enviado com Java");/*Assunto com email */
   //    message.setContent(textoEmail,"text/html; charset=utf-8");
       message.setText("Olá Programador , vc acaba de Receber um e-mail enviado com Java");
       
       Transport.send(message);
        
        
    } catch (Exception e) {
        e.printStackTrace();

    }
  }
     
}
