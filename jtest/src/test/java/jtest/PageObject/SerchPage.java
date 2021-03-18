package jtest.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SerchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SerchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    @FindBy(id = "siteSearchInput")
    private WebElement SerchPlace;

    public void FillSerchPlace(String strSerchPlace){
        SerchPlace.sendKeys(strSerchPlace);
    }

}

