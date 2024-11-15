package com.testingacademy.ex_selenium.Task19Oct;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AwesomeQA {

    @Description("Verify Account registration process")
    @Test
    public void registerAccount () throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("sai");
        driver.findElement(By.name("lastname")).sendKeys("D");
        driver.findElement(By.id("input-email")).sendKeys("said@yahoo.com");
        driver.findElement(By.name("telephone")).sendKeys("9991112121");
        driver.findElement(By.id("input-password")).sendKeys("password1");
        driver.findElement(By.name("confirm")).sendKeys("password1");
        driver.findElement(By.name("agree")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        Thread.sleep(3000);

        Assert.assertTrue(driver.getPageSource().contains("Your Account Has Been Created!"));

        driver.quit();





    }

}
