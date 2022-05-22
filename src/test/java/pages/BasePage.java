package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    protected static WebDriver driver;
    private static WebDriverWait wait;
    public static Actions accionesNav;
    public static String pathGoogle = "C:\\Users\\agush\\Downloads\\chromedriver_win32(6)\\chromedriver.exe";
    
    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", pathGoogle);
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }
    
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        //Espera explicita introducida de forma implicta a todo el frame
        wait = new WebDriverWait(driver,10);
        //Espera implicita indicada
        //Para todo en el frame espera 10s
        // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public static void navegarA(String url){
        driver.get(url);
    }

    public static void cerrarNavegador(){
        driver.quit();
    }

    private WebElement Find(String locator){
        //Con el until lo que va a hacer la espera explicita, es esperar hasta que aparezca y ejecutar cuando lo vea.
         return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void escribirEnGoogle(String locator,String textoAEscribir){
        Find(locator).clear();
        Find(locator).sendKeys(textoAEscribir);
 
     }

     public void selectorDeListasDesplXValor(String locator,String valorSelecionado){
        Select desplegable = new Select(Find(locator));
        desplegable.selectByValue(valorSelecionado);
     }

     public void selectorDeListasDesplXIndex(String locator,int valorIndexado){
        Select desplegable = new Select(Find(locator));
        desplegable.selectByIndex(valorIndexado);
     }

     public void selectorDeListasDesplXText(String locator,String valorSelecionado){
        Select desplegable = new Select(Find(locator));
        desplegable.selectByVisibleText(valorSelecionado);
     }

     public void pasarMouse(String locator){
        accionesNav.moveToElement(Find(locator));
     }

     public void dobleClick(String locator){
         accionesNav.doubleClick(Find(locator));
     }

     public void clickDerecho(String locator){
         accionesNav.contextClick(Find(locator));
     }

     public String obtenerValorDeUnaTabla(String locator,int row, int column){
         String celdaQueBusco = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
         return Find(celdaQueBusco).getText();
     }

     public void meterUnValorEnUnaTabla(String locator,int row,int column,String ponerTexto){

        String celdaQueBusco = locator+"/table/tbody/tr["+row+"]/td["+column+"]";

        Find(celdaQueBusco).sendKeys(ponerTexto);

     }

     public void cambiarDeIframe(int iframeIndex){
         driver.switchTo().frame(iframeIndex);
     }

     public void switchToParentFrame(){
         driver.switchTo().parentFrame();
     }

     //Pop
     public void rechazarAlerta(){
        try{ 
        driver.switchTo().alert().dismiss();
        }catch(NoAlertPresentException e){
            //Imprime el error
            e.printStackTrace();
        }
    }
    
    //  Puede darse que yo quiera la validacion en los steps de la pagina o en la modelacion, es mas correcto tenerlo en los pasos al final
     public String textoObtenidoDelElemento(String locator){
         return Find(locator).getText();
     }

     public boolean elementoEstaHabilitado(String locator){
         return Find(locator).isEnabled();
     }

     public boolean elementoEstaVisualizado(String locator){
         return Find(locator).isDisplayed();
     }

     public boolean elementoEstaSeleccionado(String locator){
        return Find(locator).isSelected();
     }

    //  Por lo general debo enviar la lista de esto y recibirlo para pasarlo por un fore a String
     public List<WebElement> recorrerTodosLosElementos(String locator){
         return driver.findElements(By.className(locator));
     }
}
