package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductToCartTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[contains(.,'Log in')]"))) {
            click(By.xpath("//a[contains(text(),'Log out')]"));
        }
        click(By.xpath("//a[contains(.,'Log in')]"));

        type(By.id("Email"), "qwertymaiia@gmail.com");
        type(By.id("Password"), "qwertymaiia123$");

        click(By.cssSelector("input[value='Log in']"));
    }

    @Test
    public void addProductToCartPositiveTest() {
        System.out.println("***** Start login positive test for adding product to the cart *****");
        // 1. go to the book
        click(By.xpath("//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='header-menu']/ul[@class='top-menu']/li[1]/a[@href='/books']"));
        // 2. click into the 'Add to cart' button under the first element:
        click(By.xpath("//input[@type='button' and @value='Add to cart']"));
        // 4. click on the cart link
        click(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        // 5. check the cart for the adding product - there is our product
        Assert.assertTrue(isElementPresent(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/a")));
    }
}
