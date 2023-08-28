package com.ait.qa26.demoWebShop.maiiakatts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }
    @Test
    public void findElementsTest(){
        //find full list of elements with tag h3:
        List<WebElement> elements = driver.findElements(By.tagName("h3"));
        System.out.println(elements.size());

        //find element by tag_name:
        WebElement element = driver.findElement(By.tagName("h3"));
        System.out.println(element.getText());

        //find element by id:
        driver.findElement(By.id("newsletter-email"));

    }
    @Test
    public void findElementByCssTest(){
        //1.id -> css:
        driver.findElement(By.cssSelector("#small-searchterms"));
        //2.class_name -> css
        driver.findElement(By.cssSelector(".search-box"));
        //3.tag -> css
        driver.findElement(By.cssSelector("span"));
        //4.name -> css
        driver.findElement(By.cssSelector("[name='description']"));
        //5.class contains text, that is in params and starts with -> css
        driver.findElement(By.cssSelector("[class*='ico-lo']"));
        //6.class contains text, that is in params -> css
        driver.findElement(By.cssSelector("[class^='ajax']"));
        //7.class contains text, that is in params and on the end -> css
        driver.findElement(By.cssSelector("[class$='-login']"));
        //8.tag,class and attribute -> css
        driver.findElement(By.cssSelector("form[action='/search']"));
    }
    @Test
    public void findElementByXpathTest(){
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//div[@class='search-box']"));
        driver.findElement(By.xpath("//span"));
        driver.findElement(By.xpath("//*[@name='description']"));
        driver.findElement(By.xpath("//*[contains(@class, 'ico-lo')]"));
        driver.findElement(By.xpath("//*[starts-with(@class, 'ajax')]"));
        driver.findElement(By.xpath("//*[contains(@class, '-login') and substring(@class, string-length(@class) - 5) = '-login']"));
        driver.findElement(By.xpath("//form[@action='/search']"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
