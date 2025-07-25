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
}
