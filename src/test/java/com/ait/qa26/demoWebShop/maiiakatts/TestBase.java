package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;

public class TestBase {
    WebDriver driver;

    //PreCondition: before => setUp Method
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //driver.get("https://demowebshop.tricentis.com");
        driver.navigate().to("https://demowebshop.tricentis.com");
    }
    public boolean isHomeComponentPresent() {
        return driver.findElements(By.cssSelector("#nivo-slider")).size()>0;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    public boolean isElementPresent2(By locator) {
        try {
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException ex){
            return false;
        }
    }

    //PostCondition: after => tearDown Method
    @AfterMethod(enabled = false)
    public void tearDown() {
        //driver.close();
        driver.quit();
    }
}