package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class FactoryWebElements {
    public static WebElement iniciaConXpath(WebDriver driver, String xpath){
        WebElement elemento = null;
        try{
            WebDriverWait espera = new WebDriverWait(driver, Duration.ofSeconds(10));
            elemento = espera.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath(xpath)
            ));
        }catch(Exception e){
            System.out.println("Elemento Web no encontrado <<"+xpath+">>");
        }
        return elemento;
    }

    public static List<WebElement> iniciaConXpaths(WebDriver driver, String xpath){
        List<WebElement> elementos = null;
        try{
            WebDriverWait espera = new WebDriverWait(driver, Duration.ofSeconds(10));
            elementos = espera.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                    By.xpath(xpath)
            ));
        }catch(Exception e){
            System.out.println("Elementos Web no encontrados <<"+xpath+">>");
        }
        return elementos;
    }
}
