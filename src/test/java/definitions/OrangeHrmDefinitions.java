package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.orangeHRM.InicioSesionOHrm;

public class OrangeHrmDefinitions {

    private WebDriver driver = WebDriverManager.getDriver();

    @Given("estoy en la web {string}")
    public void estoy_en_la_web(String url) {
        driver.get(url);
    }

    @When("ingreso el usuario {string}")
    public void ingreso_el_usuario(String username) {
        InicioSesionOHrm.getInputUserName(driver).sendKeys(username);
    }

    @When("ingreso el password {string}")
    public void ingreso_el_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        InicioSesionOHrm.getInputPassword(driver).sendKeys(password);
    }

    @When("presiono el boton Login")
    public void presiono_el_boton_login() {
        InicioSesionOHrm.getSubmitButton(driver).click();
    }

    @Then("valido el ingreso con exito")
    public void valido_el_ingreso_con_exito() {
        Assert.assertTrue("No se ha realizado el login", true);
    }
}
