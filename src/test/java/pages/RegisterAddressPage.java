package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTests;

public class RegisterAddressPage extends BaseTests {


    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "input#account_address_fname")
    private WebElement firstNameBox;
    @FindBy(xpath = "//*[@id='account_address_lname']")
    private WebElement lastNameBox;
    @FindBy(id = "account_address_address1")
    private WebElement addressLineBox;
    @FindBy(xpath = "//*[@id='account_address_city']")
    private WebElement cityTownBox;
    @FindBy(xpath = "//*[@id='shipping_county']")
    private WebElement countyBox;
    @FindBy(id= "shipping_postcode")
    private WebElement postZipCodeBox;
    @FindBy(xpath ="//*[@id='account_address_telephone']")
    private WebElement telephoneBox;
    @FindBy(id = "add_address_button")
    private WebElement buttonRegister;
    @FindBy(id = "welcome")
    private WebElement validateUser;




    public RegisterAddressPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(this.driver, this);
    }

    public void SetFirstNameBox(String firstName) {
        firstNameBox.clear();
        firstNameBox.sendKeys(firstName);

    }

    public void SetLastNameBox(String lasName) {
        lastNameBox.clear();
        lastNameBox.sendKeys(lasName);

    }

    public void SetAddressLineBox(String addressLine) {
        addressLineBox.clear();
        addressLineBox.sendKeys(addressLine);

    }

    public void SetCityTownBox(String cityTown) {
        cityTownBox.clear();
        cityTownBox.sendKeys(cityTown);

    }

    public void SetCountyBox(String county) {
        countyBox.clear();
        countyBox.sendKeys(county);

    }

    public void SetPostZipCodeBox(String postZipCode) {
        postZipCodeBox.clear();
        postZipCodeBox.sendKeys(postZipCode);

    }

    public void SetTelephoneBox(String telephone) {
        telephoneBox.clear();
        telephoneBox.sendKeys(telephone);

    }

    public void ButtonRegister() {
        buttonRegister.click();

    }

    public boolean ValidateUser() {
        return validateUser.isDisplayed();
    }


}




