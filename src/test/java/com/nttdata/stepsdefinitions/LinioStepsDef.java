package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LinioSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinioStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    LinioSteps linioSteps;

    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }


    @Given("que me encuentro en la página de login de linio")
    public void queMeEncuentroEnLaPáginaDeLoginDeLinio() {
        driver.get("https://www.linio.com.pe/account/login");
        screenShot();
    }

    @When("ingreso el email {string} y ingreso la contraseña {string}")
    public void ingresoElEmailYIngresoLaContraseña(String email, String pass) {
        linioSteps = new LinioSteps(driver);
        linioSteps.emailmio(email);
        linioSteps.passInput(pass);
        linioSteps.sessionButton();
        screenShot();
    }

    @And("valido la sesión del usuario llamado {string}")
    public void validoLaSesiónDelUsuarioLlamado(String usunombre) {
        String nomusu =  inventorySteps(driver).getNombreUsu();
        Assertions.assertEquals(usunombre, nomusu);
    }


    @Given("que me encuentro en la pagina linio")
    public void queMeEncuentroEnLaPaginaLinio() {
        driver.get("https://www.linio.com.pe/");
        screenShot();
    }

    @When("hago clic en un producto")
    public void hagoClicEnUnProducto() {
        linioSteps.unproductoclic();
        screenShot();
    }

    @And("Añadir al carrito")
    public void añadirAlCarrito() {
        linioSteps.añadircarritoclic();
        screenShot();
    }

    @Then("valido el producto agregado {string}")
    public void validoElProductoAgregado(String titulonom) {
        try {
            String texto =  inventorySteps(driver).getcarritoTitulo();
            //prueba: validamos el mensaje final
            Assertions.assertEquals(titulonom,texto) ;
            screenShot();

        }catch (Exception e){

        }
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }


    @When("hago clic en Remate")
    public void hagoClicEnRemate() {
        linioSteps.remate();
        screenShot();
    }
}
