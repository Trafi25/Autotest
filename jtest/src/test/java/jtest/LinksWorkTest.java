package jtest;

import jtest.PageObject.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LinksWorkTest {
    @Test
    public void LinksWorkTest() {
        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();

        String path = "//*[@id=\"__next\"]/div[3]/div[10]/div/div/span[2]/span/div[2]/a/div";
        homePage.Linker(path);
        path ="//*[@id=\"__next\"]/div[3]/div[10]/div/div/span[2]/span/div[1]/a/div";
        homePage.Linker(path);
        path="//*[@id=\"__next\"]/div[3]/div[10]/div/div/span[2]/span/div[4]/a/div";
        homePage.Linker(path);
        String InstLink="https://playhearthstone.com/ru-ru";
        Assert.assertTrue(driver.getCurrentUrl().equals(InstLink));

    }
}
