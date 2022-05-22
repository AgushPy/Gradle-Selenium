package steps;


import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage google = new GooglePage();

    @Given("^navego en google$")
    public void navigateToGoogle(){
        //La espera prohibida no hay que usarla se debe tirar una excepcion de interrumped
        // Thread.sleep(1000);
        google.navegarAGoogle();
    }
    
    
    @When("^busco (.+) algo$")
    public void entradaDeBusqueda(String valorBuscar){
        google.escribirEnElNavegador(valorBuscar);
    }
    
    
    @And("^toco boton de busqueda$")
    public void tocarBoton(){
        google.clickBuscarGoogle();
    }

    
    @Then("^obtengo resultado$")
    public void validarResultado(){
        google.entrarPagina();
        // Assert.assertEquals("",google.primerResultado());
        
    }
}
