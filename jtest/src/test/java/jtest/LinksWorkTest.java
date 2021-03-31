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
    public void LinksWorkTest1() {
        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        String checkpass;
        String truepass;

        String path = "//*[@id=\\\"__next\\\"]/div/div[10]/div/div/span[2]/span/div[1]/a/div\"";
        checkpass = homePage.Linker(path);
        System.out.println(checkpass);
        truepass="https://www.youtube.com/c/HearthstoneRU/featured";
        Assert.assertTrue(checkpass.equals(truepass));
    }
    @Test
    public void LinksWorkTest2() {

        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        String checkpass;
        String truepass;

        String path = "//*[@id=\"__next\"]/div/div[10]/div/div/span[2]/span/div[1]/a/div";
        checkpass = homePage.Linker(path);
        System.out.println(checkpass);
        truepass="https://twitter.com/hearthstone_ru";
        Assert.assertTrue(checkpass.equals(truepass));

    }

    @Test
    public void LinksWorkTest3() {

        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        String checkpass;
        String truepass;

        String path = "//*[@id=\"__next\"]/div/div[10]/div/div/span[2]/span/div[4]/a/div";
        checkpass = homePage.Linker(path);
        System.out.println(checkpass);
        truepass="https://www.instagram.com/playhearthstone/";
        Assert.assertTrue(checkpass.equals(truepass));

    }


}
