package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("span.title");

    public static By userlineo = By.xpath("/html/body/header/nav/div/div[4]/div[2]/a/span[2]");
    public static By itemsCards = By.cssSelector("div.inventory_item");

    public static By añadircarritotext = By.xpath("/html/body/div[3]/main/div[6]/div/div/div/div[1]/div/h2[1]");
}
