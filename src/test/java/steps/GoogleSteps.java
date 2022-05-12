package steps;


import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage google = new GooglePage();

    @Given("^navego en google$")
    public void navigateToGoogle(){
        google.navegarAGoogle();
    }

    
    @When("^busco algo$")
    public void entradaDeBusqueda(){
       
    }

    
    @And("^toco boton de busqueda$")
    public void tocarBoton(){
       
    }

    
    @Then("^obtengo resultado$")
    public void validarResultado(){
       
    }
}
