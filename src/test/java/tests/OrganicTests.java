package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class OrganicTests extends BaseTests {


    @Test ()
    public void RegistroDeUsuario() {

    //Registro de email y contraseña

   registerUserPage.ClickInButonSignIn();
   registerUserPage.SetEmailBox("solo@gmail.com");
   Assert.assertTrue(registerUserPage.ValidarTexto());
   registerUserPage.ActivarElCheckbox();
   Assert.assertTrue(registerUserPage.ValidarCheck());
   registerUserPage.SetPasswordBox("UserKardec1234");
   Assert.assertTrue(registerUserPage.ValidarContraseñaEnModoculto());
   registerUserPage.ClickButonContinuar();

   //Registro de direccion
   registerAddressPage.SetFirstNameBox("User");
   registerAddressPage.SetLastNameBox("User2");
   registerAddressPage.SetAddressLineBox("Lower1234");
   registerAddressPage.SetCityTownBox("Cork");
   registerAddressPage.SetCountyBox("Ireland");
   registerAddressPage.SetPostZipCodeBox("1234");
   registerAddressPage.SetTelephoneBox("1234");
   registerAddressPage.ButtonRegister();
   Assert.assertTrue(registerAddressPage.ValidateUser());

    }

    @Test (priority = 1)
    public void CrearWhishlist() {

    String productName = "Tomatoes";

     loginPage.Login("solo@gmail.com","UserKardec1234");

      // aca hay un error no toma logra hacer click en el boton "Back to Store"
     loginPage.ClickEnButtonVolveAlHome();


     homePage.searchInTextBox(productName);
     Assert.assertTrue(homePage.validarQueSeVisualiceElProductoSelecionado());

     // aca no logra mover el mouse a la imagne del tomate
     homePage.setMoverMouse();


     homePage.clickButtonAdd();
     homePage.clickEnButtonRemove();

    }
}




