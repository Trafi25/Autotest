package jtest;

import jtest.PageObject.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class VideoTest {
    @Test
    public void VideoTest() {
        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();

        homePage.Matchvideo();
        String InstT="Киберспорт - Hearthstone";
        Assert.assertTrue(driver.getTitle().equals(InstT));

}
}
