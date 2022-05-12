package pages;

public class GooglePage extends BasePage {
    public GooglePage(){
        super(driver);
    }

    public void navegarAGoogle(){
        navegarA("https://www.google.com");
    }
}
