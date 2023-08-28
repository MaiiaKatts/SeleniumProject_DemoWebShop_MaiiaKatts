package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewUserTests extends TestBase {

    @Test
    public void createNewUserPositiveTest(){
    //click on Register - //a[contains(.,'Register')]
    // choose gender - //input[@id='gender-male']
    // choose gender - //input[@id='gender-female']
    // enter FirstName - //input[@id='FirstName']
    // enter LastName - //input[@id='LastName']
    // enter email - //input[@id='Email']
    // enter pass - //input[@id='Password']
    // enter pass - //input[@id='ConfirmPassword']
    //input[@id='register-button']

        driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();

        driver.findElement(By.xpath("//input[@id='FirstName']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Maiia");

        driver.findElement(By.xpath("//input[@id='LastName']")).click();
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Katts");

        driver.findElement(By.xpath("//input[@id='Email']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("qwertymaiia@gmail.com");

        driver.findElement(By.xpath("//input[@id='Password']")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("qwertymaiia123$");

        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("qwertymaiia123$");

        driver.findElement(By.name("register-button")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//input[@id='register-button']")));
//        driver.findElement(By.xpath("//a[contains(.,'Log in')]")).click();
//        driver.findElement(By.cssSelector("[placeholder='Email']")).click();
//        driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("qwerty@gmail.com");
//
//        driver.findElement(By.cssSelector("[placeholder='Password']")).click();
//        driver.findElement(By.cssSelector("[placeholder='Password']")).clear();
//        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Qwerty123$");
//
//        driver.findElement(By.name("registration")).click();
//        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(.,'Sign Out')]")));

    }
}
