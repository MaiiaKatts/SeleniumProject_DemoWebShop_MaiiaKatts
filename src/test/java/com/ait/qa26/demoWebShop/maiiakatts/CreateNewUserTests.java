package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewUserTests extends TestBase {

    //we need condition of entrance to the site!
    @BeforeMethod
    public void ensurePrecondition() {
        //user should be logged out
        if (!isElementPresent(By.xpath("//a[contains(.,'Log in')]"))) {
            click(By.xpath("//a[contains(text(),'Log out')]"));
        }
        click(By.xpath("//a[contains(.,'Log in')]"));
    }

    @Test
    public void createExistedUserNegativeTest() {

        System.out.println(
                "***** Start to create existed user negative test *****"
        );
        click(By.xpath("//a[contains(.,'Register')]"));
        click(By.id("gender-male"));
        click(By.id("gender-female"));

        type(By.id("FirstName"), "Maiia");
        type(By.id("LastName"), "Katts");
        type(By.id("Email"), "qwertymaiia@gmail.com");
        type(By.id("Password"), "qwertymaiia123$");
        type(By.id("ConfirmPassword"), "qwertymaiia123$");

        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.
                cssSelector(".validation-summary-errors li")),
                "The specified email already exists");
    }
}
