package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/features",
    glue = "steps"
)

public class runner{
    // GooglePage google = new GooglePage();

    // // @Given("^navego en google$")
    // public void navigateToGoogle(){
    //     google.navegarAGoogle();
    // }
}