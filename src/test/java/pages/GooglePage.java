package pages;

public class GooglePage extends BasePage {
    public GooglePage(){
        super(driver);
    }

    public void navegarAGoogle(){
        System.out.println("Bandera");
        navegarA("https://www.google.com");
    }
}
