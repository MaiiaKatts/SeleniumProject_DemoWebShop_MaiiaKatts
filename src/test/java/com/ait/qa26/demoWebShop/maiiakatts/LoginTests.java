package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        //user should be logged out
        if (!isElementPresent(By.xpath("//a[contains(.,'Log in')]"))) {
            click(By.xpath("//a[contains(.,'Log out')]"));
        }
        click(By.xpath("//a[contains(.,'Log in')]"));
    }
    @Test
    public void loginPositiveTest(){
        // при разделении по модулям - для каждого модуля свой тест,
        // действия будут аналогичны, код будет дублирующим - рефакторинг:
        // cmd+alt+m(method) и cmd+alt+p(parameter)
        System.out.println(
                "***** Start login positive test *****"
        );
        type(By.id("Email"), "qwertymaiia@gmail.com");
        type(By.id("Password"), "qwertymaiia123$");

        click(By.cssSelector("input[value='Log in']"));
        Assert.assertTrue(isElementPresent2(By.xpath("//a[contains(.,'Log out')]")));
    }
}
