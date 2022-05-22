package pages;

public class GooglePage extends BasePage {
    private String botonBusqueda = "//input[@value='Buscar con Google']";
    private String campoBusqueda = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
    private String campoEncontrado ="//h3[contains(text(),'JavaGod - GitHub')]";
    
    private String campoDeBusquedaMl = "//a[@id='AR']";
    private String barraBuscado = "//input[@id='cb1-edit']";
    private String botosBuscarML = "/html/body/header/div/form/button/div";
    private String productoML = "//body/main[@id='root-app']/div[1]/ol[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/h2[1]";
    private String primerResultado = "";

    public GooglePage(){
        super(driver);
    }

    public void navegarAGoogle(){
        System.out.println("Bandera");
        navegarA("https://www.google.com");
        // clickElement(campoDeBusquedaMl);
        // clickElement(barraBuscado);
        // escribirEnGoogle(barraBuscado, "play5");
        // clickElement(botosBuscarML);
        // clickElement(productoML);
    }

    public void clickBuscarGoogle(){
        clickElement(botonBusqueda);
        
    }

    public void escribirEnElNavegador(String valor){
        escribirEnGoogle(campoBusqueda,valor);
    }

    public void entrarPagina(){
        clickElement(campoEncontrado);
    }

    public String primerResultado(){
        return textoObtenidoDelElemento(primerResultado);
    }
}
