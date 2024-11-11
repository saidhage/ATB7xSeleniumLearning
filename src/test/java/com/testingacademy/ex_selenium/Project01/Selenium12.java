package com.testingacademy.ex_selenium.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium12 {


       @Test
       public void verifyTitle (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
       // Assert.assertEquals("Work Smarter. Scale Faster.", "Work Smarter. Scale Faster.");
        Assert.assertEquals(driver.getPageSource(), "Work Smarter. Scale Faster." );
        driver.quit();


}}
