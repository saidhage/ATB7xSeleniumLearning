package com.testingacademy.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;



public class Selenium34 {


    @Description("handle popup by using wait(explicit wait)")

    @Test
    public void loginnegativeProcess() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());



       //by using visibilityOf(webElement)
        WebElement lpopup = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        WebDriverWait popup = new WebDriverWait(driver, Duration.ofSeconds(3000));
       popup.until(ExpectedConditions.visibilityOf(lpopup)).click();
       popup.until(ExpectedConditions.textToBePresentInElement(lpopup, "Personal Account" ));
            //or
          //by using visibilityOfElementLocated(By.....)
      //  WebDriverWait popup1 = new WebDriverWait(driver, Duration.ofSeconds(3000));
      //  popup1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='commonModal__close']")));
      //  WebElement lpopup1 = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
      //  lpopup1.click();




    }}
