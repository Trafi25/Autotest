package jtest;

import jtest.PageObject.HomePage;
import jtest.PageObject.LoginPage;
import jtest.PageObject.SerchPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class SerchTest {
    @Test
    public void SerchTest() {
        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();

        homePage.Serchcard();
        String ETCURL = "https://playhearthstone.com/ru-ru/cards/1754-elite-tauren-chieftain?hsquery=E.T.C.";
        Assert.assertTrue(driver.getCurrentUrl().equals(ETCURL));





    }
}