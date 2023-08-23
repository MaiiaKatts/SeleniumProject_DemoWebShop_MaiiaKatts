package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenDemoWebShopSiteTest {
    WebDriver driver;

    //PreCondition: before => setUp Method
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //driver.get("https://demowebshop.tricentis.com");
        driver.navigate().to("https://demowebshop.tricentis.com");
    }

    //Condition: test
    @Test
    public void openDemoWebShopSiteTest() {
        System.out.println(" ***** Site opened ***** ");
    }

    //PostCondition: after => tearDown Method
    @AfterTest
    public void tearDown() {
        //driver.close();
        driver.quit();
    }
}

