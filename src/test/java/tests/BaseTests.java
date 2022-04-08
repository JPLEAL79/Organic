package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterAddressPage;
import pages.RegisterUserPage;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    public WebDriver driver;


    public RegisterAddressPage registerAddressPage;
    public RegisterUserPage registerUserPage;
    public LoginPage loginPage;
    public HomePage homePage;

    @BeforeMethod
    public void beforeMetohd() {

        //instrucciones para arrancar el browser
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--disable-notifications"); //Opción de Chrome sirve para desactivar notificacion
        opts.addArguments("--start-maximized"); //Opción de Chrome sirve para que inicie maximizado

        String path = Paths.get(System.getProperty("user.dir"), "src/test/resources/webdrivers/chromedriver.exe").toString();
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver(opts);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://automationstore.onlineweb.shop/");





        registerAddressPage = new RegisterAddressPage(driver);
        registerUserPage = new RegisterUserPage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);



    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
