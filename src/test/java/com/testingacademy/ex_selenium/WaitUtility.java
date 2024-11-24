package com.testingacademy.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility {

public static void checkVisibility (WebDriver driver, By locator ) {
    WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(3000));
    wt.until(ExpectedConditions.visibilityOfElementLocated(locator));

}

public static void checkVisibilityByVisibilityOf (WebDriver driver, WebElement element) {
    WebDriverWait wt1 = new WebDriverWait(driver, Duration.ofSeconds(3000));
    wt1.until(ExpectedConditions.visibilityOf(element));

}

public static void checkVisibilityAndTextToBePresent (WebDriver driver, WebElement element) {
    WebDriverWait wt2 = new WebDriverWait(driver, Duration.ofSeconds(3000));
    wt2.until(ExpectedConditions.visibilityOf(element));
    wt2.until(ExpectedConditions.textToBePresentInElement(element, "TypeExpected text here"));

}


}
