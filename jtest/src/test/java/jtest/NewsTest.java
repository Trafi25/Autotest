package jtest;

import jtest.PageObject.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class NewsTest {
    @Test
    public void NewsTest(){
        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();

        driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[6]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[6]/div/div/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"NewsHome\"]/div/div[2]/div[2]/a[1]")).click();
        String NewsUrl= "https://playhearthstone.com/ru-ru/news/23642550/opisanie-obnovleniya-20-0";
        Assert.assertTrue(driver.getCurrentUrl().equals(NewsUrl));

}}
