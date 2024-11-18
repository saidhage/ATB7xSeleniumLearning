package com.testingacademy.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium30 {

    @Description("Verify ebay print the prices of imac ")
    @Test
    public void test_imacPrices() throws InterruptedException {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");    // using chromeOptions class for maximize window
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchCTA = driver.findElement(By.cssSelector("input[value='Search']"));
        searchCTA.click();
        Thread.sleep(3000);
        //print all the titles

       List<WebElement> titles = driver.findElements(By.xpath("//div[@class='s-item__title']"));
       //By.cssSelector("div.s-item__title")

       List <WebElement> prices = driver.findElements(By.cssSelector("span.s-item__price"));
       //By.xpath("//span[@class="s-item__price"]")


        int size = Math.min(titles.size(), prices.size());
        for (int i =0; i<size; i++)
        {
            System.out.println("Title: " + titles.get(i).getText() + " ||" +   "Price: " + prices.get(i).getText());
            System.out.println();

        }













    }
}
