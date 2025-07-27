package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        String expectedResult = "Dashboard";
        String unexpectedResult = InicioSesionOHrm.getNameTitleMenu(driver).getText();
        System.out.println("unexpectedResult = " + unexpectedResult);
        Assert.assertEquals(expectedResult, unexpectedResult);
    }

    @Then("valido que no se permite el ingreso")
    public void valido_que_no_se_permite_el_ingreso() {
        String expectedResult = "Invalid credentials";
        String unexpectedResult = InicioSesionOHrm.getInvalidCredentials(driver).getText();
        System.out.println("unexpectedResult = " + unexpectedResult);
        Assert.assertEquals("Invalid credentials", expectedResult);
    }

    @When("presiono el boton Forgot your password")
    public void presiono_el_boton_forgot_your_password() {
        InicioSesionOHrm.getForgotPasswordButton(driver).click();
    }

    @When("permite ingresar el nombre de usuario")
    public void permite_ingresar_el_nombre_de_usuario() {
        String usuario = "Admin";
        InicioSesionOHrm.getInputUserName(driver).sendKeys(usuario);
    }

    @When("presiono el boton ResetPassword")
    public void presiono_el_boton_reset_password() {
        InicioSesionOHrm.getResetButtonPassword(driver).click();
    }
    @Then("valido que que se envie el correo de recuperacion {string}")
    public void valido_que_que_se_envie_el_correo_de_recuperacion(String string) {
        Assert.assertEquals(string, InicioSesionOHrm.getResetPasswordMessage(driver).getText());
    }


}
