package configs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "definitions",
        tags = "@testLogin", //Este algo hay que modificarlo
        publish = true  //Aqui definimos si queremos que Cucumber suba el reporte a su web o no
)

public class RunCucumber {
    public RunCucumber() {

    }

    @AfterClass
    public static void quitDriver(){
        System.out.println("quitDriver");
        WebDriverManager.driver.quit();
    }
}
