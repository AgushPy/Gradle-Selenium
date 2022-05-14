package pages;

public class TextSanbox extends BasePage{
    
    private String url = "https://facebook.com/";

    public TextSanbox(){
        super(driver);
    }

    public void navegarText(){
        BasePage.navegarA(url);
    }
}
