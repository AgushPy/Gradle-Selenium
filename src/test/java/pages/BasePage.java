package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    protected static WebDriver driver;
    private static WebDriverWait wait;
    public static String pathGoogle = "C:\\Users\\agush\\Downloads\\chromedriver_win32(6)\\chromedriver.exe";
    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", pathGoogle);
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public static void navegarA(String url){
        driver.get(url);
    }
}
