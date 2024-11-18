package com.testingacademy.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium29 {

    @Description("Verify that free trial expired message in idrive.com")
    @Test
    public void test_verifyExpireMessage() throws InterruptedException {


        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");    // using chromeOptions class for maximize window
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(3000);

        WebElement email_xpath_id = driver.findElement(By.id("username"));
       // WebElement email_cssSelector =  driver.findElement(By.cssSelector("input#username"));
      // WebElement email_cssSelector2 =  driver.findElement(By.cssSelector("#username"));//cssSelector for id we can use directly #value
      // WebElement email_xpath = driver.findElement(By.xpath("//input[@id='username']"));
        email_xpath_id.sendKeys("augtest_040823@idrive.com");

        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("123456");

        WebElement signIn = driver.findElement(By.id("frm-btn"));
        WebElement signInn = driver.findElement(By.cssSelector("div.id-frm-btnblk > button"));
        signInn.click();
        Thread.sleep(20000);

        WebElement warning = driver.findElement(By.cssSelector("div.id-card-cont h5.id-card-title"));
        WebElement warningXpath = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        System.out.println(warningXpath.getText());
        Assert.assertEquals(warningXpath.getText(), "Your free trial has expired");


        driver.quit();














    }
}
