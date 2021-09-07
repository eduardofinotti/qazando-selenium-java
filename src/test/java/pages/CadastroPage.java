package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");

    private By select_day_filed = By.id("days");
    private By select_months_filed = By.id("months");
    private By select_years_filed = By.id("years");

    private By eddress_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");

    private By subbmit_button = By.id("submitAccount");

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type) {
        waitElementBePresent(titleM, 20);

        if(type == 1){
            driver.findElement(titleM).click();
        }else if(type == 2){
            driver.findElement(titleF).click();
        }
    }

    public void preencheNome(String name){
        driver.findElement(first_name_field).sendKeys(name);
    }

    public void preencheSobrenome(String sobrenome){
        driver.findElement(last_name_field).sendKeys(sobrenome);
    }

    public void preenchePassword(String pass){
        driver.findElement(password_field).sendKeys(pass);
    }

    public void selecionaAniversario(Integer day, Integer months, String year){
        Select select_day = new Select(driver.findElement(select_day_filed));
        select_day.selectByIndex(day);

        Select select_month = new Select(driver.findElement(select_months_filed));
        select_month.selectByIndex(months);

        Select select_year = new Select(driver.findElement(select_years_filed));
        select_year.selectByValue(year);
    }

    public void preencheAddress(String address) {
        driver.findElement(eddress_field).sendKeys(address);
    }

    public void preencheCity(String city) {
        driver.findElement(city_field).sendKeys(city);
    }

    public void selecionaState(String state){
        Select select_state = new Select(driver.findElement(state_field));
        select_state.selectByVisibleText(state);
    }

    public void preenchePostalcode(String postalcode) {
        driver.findElement(postcode_field).sendKeys(postalcode);
    }

    public void preenchePhoneMobile(String phone) {
        driver.findElement(phone_mobile_field).sendKeys(phone);
    }

    public void clickRegister() {
        driver.findElement(subbmit_button).click();
    }

    public void valida_cadastro(String nome, String sobrenome) {
        waitElementBePresent(By.className("button-search"), 20);
        String resultado_atual = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);
    }

}
