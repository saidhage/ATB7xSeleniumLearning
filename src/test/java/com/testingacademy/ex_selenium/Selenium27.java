package com.testingacademy.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium27 {
   @Description("Verify error message for wrong email id on sign up page")
   @Test
   public void error_freTrail () {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vwo.com/free-trial");
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("assasa@dsdcom");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       List <WebElement> createAccountCTA = driver.findElements(By.tagName("button"));
        createAccountCTA.get(0).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorMessage = driver.findElement(By.className("invalid-reason"));
        System.out.println(errorMessage.getText());

        Assert.assertEquals(errorMessage.getText(), "The email address you entered is incorrect.");

       driver.quit();


    }
}
