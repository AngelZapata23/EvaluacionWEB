package com.nttdata.steps;

import com.nttdata.page.LinioPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinioSteps {

    private WebDriver driver;

    //constructor
    public LinioSteps(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * Escribir el usuario
     *
     * @param email el usuario
     */
    public void emailmio(String email) {
        WebElement userInputElement = driver.findElement(LinioPage.emailInput);
        userInputElement.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LinioPage.sessionButton));


    }

    /**
     * Escribir el password
     *
     * @param password el password del usuario
     */
    public void passInput(String password) {
        this.driver.findElement(LinioPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void sessionButton() {
        this.driver.findElement(LinioPage.sessionButton).click();
    }



    public void unproductoclic() {
        try {
            this.driver.findElement(LinioPage.producto).click();
        } catch (Exception e) {

        }
    }

    public void añadircarritoclic() {
        try {
            this.driver.findElement(LinioPage.carritoButton).click();
        } catch (Exception e) {

        }

    }
    public void remate() {
        try {
            this.driver.findElement(LinioPage.remateButton).click();
        } catch (Exception e) {

        }
    }
}