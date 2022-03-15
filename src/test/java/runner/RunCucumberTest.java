package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@cadastro-sucesso",
        glue = {"steps"}
)
public class RunCucumberTest {

    static ChromeOptions opt = new ChromeOptions();

    public static WebDriver driver;
     
    @BeforeClass
    public static void start(){
        opt.addArguments("headless");
        driver = new ChromeDriver(opt);
    }

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
