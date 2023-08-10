package com.jujubaprojects;


/**
 * Unit test for simple App.
 */
public class AppTest {

 
    
    @org.junit.Test
    public void testeEmail() throws Exception{

        StringBuilder stringBuilderTextoEmail = new StringBuilder();
        stringBuilderTextoEmail.append("Olá <br>");
        stringBuilderTextoEmail.append("Você está recendo o acesso ao curso Java <br>");

    //    stringBuilderTextoEmail.append("<a target=\_blank\href=\http://projetojavaweb.com/certificado-aluno/login\style>");
       //   stringBuilderTextoEmail.append("<span style ");



        ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("JuniorTesteStranner@gmail.com",
        "Junior Stranner",
        "Testando email com Java",
        stringBuilderTextoEmail.toString());

         enviaEmail.enviarEmail(true);
      
       
       /*Caso o e-mail não seje enviado 
        * Cloque um tempo de espera mais isso 
        so pode ser usado para testes
        */
       Thread.sleep(5000);
   //    System.out.println(session);
       

    }


}
