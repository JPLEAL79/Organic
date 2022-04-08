package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTests;

public class RegisterUserPage extends BaseTests {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id='account']")
    private WebElement clickEnSignIn;

    @FindBy(xpath = " //*[@id='account_login_register_email']")
    private WebElement emailBox;
    @FindBy(xpath = "//*[@id='account_login_register_which_register']")
    private WebElement checkBox;
    @FindBy(xpath = "//*[@id='account_login_register_register_password']")
    private WebElement passwordBox;
    @FindBy(xpath = "//*[@id='account_login_register_button_register']")
    private WebElement clickButon;


    public RegisterUserPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(this.driver, this);
    }


    public void ClickInButonSignIn() {
        clickEnSignIn.click();

    }

    public void SetEmailBox(String email) {
        emailBox.clear();
        emailBox.sendKeys(email);
    }

    public void ActivarElCheckbox() {
        checkBox.click();

    }

    public boolean ValidarTexto() {
        return emailBox.isDisplayed();
    }

    public boolean ValidarCheck() {
        return checkBox.isDisplayed();

    }

    public void SetPasswordBox(String password) {
        passwordBox.clear();
        passwordBox.sendKeys(password);

    }


    public void ClickButonContinuar() {
        clickButon.click();


    }

    public boolean ValidarContraseñaEnModoculto() {
        return passwordBox.isDisplayed();
    }

}



