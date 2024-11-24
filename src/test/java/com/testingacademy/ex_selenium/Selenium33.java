package com.testingacademy.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium33 {

    @Description("Check the login process by invalid email id and verify error message and add explicit wait to find error message element or text in that error message  ")
    @Test
    public void loginnegativeProcess() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement email = driver.findElement(By.name("username"));email.sendKeys("abcd@yahoo.com");
        WebElement pass = driver.findElement(By.id("login-password"));
        pass.sendKeys("123456");

        driver.findElement(By.id("js-login-btn")).click();

        WebElement errorMessage = driver.findElement(By.id("js-notification-box-msg"));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait2.until(ExpectedConditions.visibilityOf(errorMessage));

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
       wait.until(ExpectedConditions.textToBePresentInElement(errorMessage, "Your email, password, IP address or location did not match"));






        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");


        driver.quit();









    }
}
