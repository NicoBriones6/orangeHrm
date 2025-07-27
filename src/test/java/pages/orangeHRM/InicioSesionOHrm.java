package pages.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

public class InicioSesionOHrm {
    //Elemento Username
    public static WebElement getInputUserName(WebDriver driver){
        return FactoryWebElements.iniciaConXpath(driver,"//input[@name='username']");
    }
    //Elemento Password
    public static WebElement getInputPassword(WebDriver driver){
        return FactoryWebElements.iniciaConXpath(driver,"//input[@name='password']");
    }

    public static WebElement getSubmitButton(WebDriver driver){
        return FactoryWebElements.iniciaConXpath(driver,"//button[@type='submit']");
    }

    public static WebElement getNameTitleMenu(WebDriver driver){
        return FactoryWebElements.iniciaConXpath(driver,"//h6[contains(., 'Dashboard')]");
    }

    public static WebElement getInvalidCredentials(WebDriver driver){
        return FactoryWebElements.iniciaConXpath(driver,"//div[@class='oxd-alert-content oxd-alert-content--error']");
    }

    public static WebElement getForgotPasswordButton(WebDriver driver){
        return FactoryWebElements.iniciaConXpath(driver,"//p[contains(.,'Forgot your password?')]");
    }

    public static WebElement getResetButtonPassword(WebDriver driver){
       return FactoryWebElements.iniciaConXpath(driver," //button[@type='submit'] | //button[contains(.,'Reset Password')]");
    }

    public static WebElement getResetPasswordMessage(WebDriver driver){
        return FactoryWebElements.iniciaConXpath(driver,"//h6[contains(.,'Reset Password link sent successfully')]");
    }
}
