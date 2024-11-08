package com.testingacademy.ex_selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Selenium02 {

        @Test
        public void test_01() {
            FirefoxDriver driver =  new FirefoxDriver();
            driver.get("https://google.com");
            driver.quit();

        }
    }

