package jtest.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }


    private By Login=By.cssSelector("[href=\"/login?redirect=%2Fru-ru\"]");

    private By HeaderSection = By.xpath("//section[@class=\"HeaderSection\"]");

    @FindBy(xpath = "//div[@class=\"Navbar-label Navbar-accountAuthenticated\"]")
    private WebElement DropLabel;



    @FindBy(xpath = "//div[@class=\"Navbar-accountDropdownLoggedIn\"]")
    private WebElement DropMenu;

    private By BattleTag = By.cssSelector("[class=\"Navbar-accountDropdownBattleTag\"]");

    private By BattleTagNumber=By.cssSelector("[class=\"Navbar-accountDropdownBattleTagNumber\"]");

    private By AccountName = By.id("accountName");

    public void Authorization(){
        driver.findElement(By.xpath("//div[@class=\"Navbar-label Navbar-accountUnauthenticated\"]")).click();
        WebElement header = driver.findElement(By.xpath("//div[@class=\"Navbar-accountDropdownLoggedOut\"]"));
        header.findElement(Login).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountName));
    }

    public void open() {
        driver.get("https://playhearthstone.com/ru-ru");
        driver.manage().window().maximize();
    }

    public String GetBattleTag(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DropLabel.click();
        String temp= (DropMenu.findElement(BattleTag).getText()+DropMenu.findElement(BattleTagNumber).getText());
        return temp;
    }

    public void Linker (String path){
        driver.findElement(By.xpath(path)).click();
        String winHandleBefore = driver.getWindowHandle(); //save the current window handle
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        } //switch window
        driver.close();
        driver.switchTo().window(winHandleBefore); //switch again to the first window

    }

    public void Matchvideo(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[7]/a")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"esportsHomepageAppMount\"]/div/div[4]/section[1]/div[1]/div/div[1]/a[1]")).click();

    }

    public void Serchcard(){
        driver.findElement(By.xpath("//*[@id=\"Navigation-container\"]/div/div[3]/div")).click();
        SerchPage serchPage = PageFactory.initElements(driver, SerchPage.class);
        serchPage.FillSerchPlace("E.T.C.");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement header = driver.findElement(By.xpath("//*[@id=\"Navigation-container\"]/div/div[5]/div[3]"));
        header.findElement(By.xpath("//*[@id=\"Navigation-container\"]/div/div[5]/div[3]/div[1]/div[2]/div/div/div/div[2]/ul/li[2]/a")).click();

    }


}