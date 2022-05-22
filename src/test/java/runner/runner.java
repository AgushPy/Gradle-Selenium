package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/features",
    glue = "steps",
    plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/json-report/cucumber.json"},
    monochrome = true ,
    tags = "@Test"
)

public class runner{
    @AfterClass
    public static void limpiarDriver(){
        BasePage.cerrarNavegador();
    }

}