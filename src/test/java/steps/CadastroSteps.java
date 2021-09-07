package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    String nome = "Jose";
    String sobrenome = "Ferreira";

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro()  {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome(nome);
        cadastroPage.preencheSobrenome(sobrenome);
        cadastroPage.preenchePassword("aushauhs3333AS@");
        cadastroPage.selecionaAniversario(23, 5, "1992");
        cadastroPage.preencheAddress("Rua da casa do finotti, 123");
        cadastroPage.preencheCity("florianópolis");
        cadastroPage.selecionaState("Colorado");
        cadastroPage.preenchePostalcode("88800");
        cadastroPage.preenchePhoneMobile("+550489919191191");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clickRegister();
    }

    @Então("^vejo cadastro realizado com sucesso")
    public void vejo_cadastro_realizado_com_sucesso() {
        cadastroPage.valida_cadastro(nome, sobrenome);
    }
}
