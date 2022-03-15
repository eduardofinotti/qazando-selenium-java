package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.MessagePage;
import runner.RunCucumberTest;

public class MessageSteps extends RunCucumberTest {

    MessagePage messagePage = new MessagePage(driver);

    @Dado("^que estou na tela de mensagens$")
    public void que_estou_na_tela_de_mensagens()  {
        messagePage.acessarMessage();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos()  {
        messagePage.selecionaAssunto("Webmaster");
        messagePage.preencheEmail("eduardo@qazando.com.br");
        messagePage.preencheMensagem("Minha mensagem");
        messagePage.uploadFile("/Users/eduardo.finotti/IdeaProjects/qazando-curso-selenium/upload.png");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() {
        messagePage.click_submit();
    }

    @Então("^vejo feedbback de mensagem enviada com sucesso$")
    public void vejo_feedbback_de_mensagem_enviada_com_sucesso() {

    }

}
