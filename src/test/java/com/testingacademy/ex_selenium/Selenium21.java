package com.testingacademy.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium21 {

    public static void main(String[] args) {


        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("https://goggle.com");
        driver.quit();
    }
}
