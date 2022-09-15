package com.nttdata.page;

import org.openqa.selenium.By;

public class LinioPage {

    //Localizadores de elementos
    public static By emailInput = By.id("login_form_email");
    public static By passInput = By.xpath("/html/body/div[1]/main/div/div/div[2]/div[1]/form/div/div[2]/input");
    public static By sessionButton = By.xpath("/html/body/div[1]/main/div/div/div[2]/div[1]/form/button");
    public static By validaSesion = By.xpath("/html/body/header/nav/div/div[4]/div[2]/a/span[2]");
    public static By remateButton = By.xpath("/html/body/div[3]/main/div[1]/div[1]/div[1]/a[5]/span[2]");
    public static By producto = By.xpath("/html/body/div[3]/main/div/div[8]/div[2]/div/div[2]/a[1]/div[2]/p/span");
    public static By carritoButton = By.id("buy-now");
    public static By validaProducto = By.xpath("/html/body/div[4]/main/div[6]/div/div/div/div[1]/div/h2[1]");


}
