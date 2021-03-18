package jtest.PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "accountName")
    private WebElement AccountName;

    @FindBy(id = "password")
    private WebElement Password;

    @FindBy(id = "submit")
    private WebElement SubmitButton;

    public void FillAccountName(String strAccountName){
        AccountName.sendKeys(strAccountName);
    }

    public void FillPassword(String strPassword){
        Password.sendKeys(strPassword);
    }

    public void SubmitForm()
    {
        SubmitButton.click();
    }
}
