package jtest;

import jtest.PageObject.HomePage;
import jtest.PageObject.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import jtest.WebDriverSettings;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void LoginTest(){
        WebDriver driver= new ChromeDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.Authorization();
        String BattleTag = "Среброкрыл#231501";

       LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
       loginPage.FillAccountName("pictureofmyhappiness@gmail.com");
       loginPage.FillPassword("zx09mn12");
       loginPage.SubmitForm();
       Assert.assertTrue(homePage.GetBattleTag().equals(BattleTag));
    }
}
