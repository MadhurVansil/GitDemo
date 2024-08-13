package rahulshettyacademy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class ErrorValidations extends BaseTest{

	@Test
	 public void errorValidations() throws IOException
	 {
		
		// String productName = "ZARA COAT 3";

		
		
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		 landingPage.loginToApplication("palakv@gmail.com","Madhur12222024#");
		
		
		Assert.assertEquals(landingPage.getErrorMessage(), "Incorrect email or password.");
		

		
	}

}
