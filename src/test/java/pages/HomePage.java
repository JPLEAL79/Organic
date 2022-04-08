package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {


    private WebDriver driver;
    WebDriverWait wait;

    @FindBy(name = "txtQuickSearch")
    private WebElement searchBox;
    @FindBy(xpath = "//*[@id='header2_inner']/form/div/div/button")
    private WebElement clickButtonLupa;

    @FindBy(xpath = "//*[@id='browse_products_container']/article/a/picture/img")
    private WebElement validateProduct;

    @FindBy(tagName= "picture")
   private WebElement moverMouse;

    @FindBy(xpath = "//*[@id='browse_products_container']/article/div/div[2]/a")
    private WebElement clickButtonAdd;

    @FindBy(xpath = "")
    private WebElement clickButtonRemove;


    public HomePage(WebDriver driver) {
        wait = new WebDriverWait(driver, 15);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);


    }

    public void searchInTextBox(String productName) {
        searchBox.sendKeys(productName);
        clickButtonLupa.click();
    }

    public boolean validarQueSeVisualiceElProductoSelecionado() {
        return validateProduct.isDisplayed();
    }

    public void setMoverMouse() {
        wait.until(ExpectedConditions.visibilityOf(moverMouse));
        Actions actions = new Actions(driver);
        actions.moveToElement(moverMouse).perform();
    }


    public void clickButtonAdd(){
        clickButtonAdd.click();

    }

    public void clickEnButtonRemove(){
        clickButtonRemove.click();
    }
}




