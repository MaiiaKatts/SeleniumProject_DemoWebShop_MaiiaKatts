package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateNewUserTests extends TestBase {

    @Test
    public void createNewUserPositiveTest(){

        driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("gender-female")).click();

        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Maiia");

        driver.findElement(By.id("LastName")).click();
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Katts");

        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("qwertymaiia@gmail.com");

        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("qwertymaiia123$");

        driver.findElement(By.id("ConfirmPassword")).click();
        driver.findElement(By.id("ConfirmPassword")).clear();
        driver.findElement(By.id("ConfirmPassword")).sendKeys("qwertymaiia123$");

        driver.findElement(By.name("register-button")).click();
        String expectedText = "qwertymaiia@gmail.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualText = driver.findElement(By.cssSelector("#Email")).getAttribute("value");
        Assert.assertEquals(actualText, expectedText);

    }
}

