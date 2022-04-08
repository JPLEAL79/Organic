package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTests;

public class LoginPage extends BaseTests {


    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id='account']")
    private WebElement clickInSignIn;

    @FindBy(xpath = "//*[@id='account_login_register_email']")
    private WebElement emailBox;
    @FindBy(id= "account_login_register_login_password")
    private WebElement passwordBox;
    @FindBy(xpath = "//*[@id='account_login_register_which_login']")
    private WebElement checkActivation;
    @FindBy(id = "account_login_register_button_login")
    private WebElement loginButton;
    @FindBy(xpath = "//main/div/div[@class='account_buttons']/child::a")
    private WebElement backButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(this.driver, this);
    }

    public void Login(String email, String password) {
        clickInSignIn.click();
        emailBox.clear();
        emailBox.sendKeys(email);
        passwordBox.clear();
        passwordBox.sendKeys(password);
        checkActivation.click();
        loginButton.click();
    }

    public void ClickEnButtonVolveAlHome() {
        wait.until(ExpectedConditions.elementToBeClickable((backButton)));
        backButton.click();

    }

}



