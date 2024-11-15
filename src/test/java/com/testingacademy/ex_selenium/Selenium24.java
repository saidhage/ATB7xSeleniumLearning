package com.testingacademy.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium24 {



    @Test
    public void testLogin() throws InterruptedException {
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("guest");
        opts.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(opts);
        driver.get("https://app.vwo.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

//find the email input (element) and enter email ===>by using function  driver.findelement();
        // this function will return webelement so ==> WebElement inputEmailBox = driver.findelement();

        WebElement inpEmailBox = driver.findElement(By.id("login-username"));
        inpEmailBox.sendKeys("sdhage@vwo.com");

        WebElement inpPass = driver.findElement(By.name("password"));
        inpPass.sendKeys("123456");

        WebElement signInCTA = driver.findElement(By.id("js-login-btn"));
        signInCTA.click();

        Thread.sleep(3000);

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");

        //linkText = full match
        //partial linktext = contains partial match
        WebElement freeTrialLink = driver.findElement(By.linkText("Start a free trial"));
        freeTrialLink.click();

        Thread.sleep(3000);

        WebElement privacyPolicyLink = driver.findElement(By.partialLinkText("Privacy"));
        privacyPolicyLink.click();

        Thread.sleep(4000);

       driver.quit();








    }
}
