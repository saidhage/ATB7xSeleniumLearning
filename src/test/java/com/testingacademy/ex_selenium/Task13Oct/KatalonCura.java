package com.testingacademy.ex_selenium.Task13Oct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KatalonCura {


        /*Create a Selenium Script to verify the title for

        Open the Page - https://katalon-demo-cura.herokuapp.com/

        Verify the current URL, current title

        In the page source add a assertion that “CURA Healthcare Service” exist in the page. driver.pageSource() - String
        */

    @Test
    public void katalonCuraTC() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println("Current URL is " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println("Current title is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service" );
        //System.out.println(driver.getPageSource());
       // Assert.assertEquals(driver.getPageSource().contains("CURA Healthcare Service"), true);


        /* Verying "CURA Heathcare services" in page source by using loop  */
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Verified it exists");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
           // System.out.println("CURA Healthcare Service is not present");
        }
     driver.quit();
    }
}
