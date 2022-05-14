package steps;

import io.cucumber.java.en.Given;
import pages.TextSanbox;

public class TextSandboxSteps {
    TextSanbox test = new TextSanbox();

    @Given("^poner nombre de usuario$")
    public void irASitio(){
        // test.navegarText();
    }
}
