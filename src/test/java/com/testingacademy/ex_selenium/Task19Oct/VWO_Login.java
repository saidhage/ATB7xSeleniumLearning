package com.testingacademy.ex_selenium.Task19Oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWO_Login {

    @Test
    public void vwoLoginProcess () {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("login-username")).sendKeys("sdhage@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("P@ssword1");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement heading = driver.findElement(By.linkText("Dashboard"));
        System.out.println(heading.getText());

        Assert.assertEquals(heading.getText(), "Dashboard");

        driver.quit();

    }
}
