package rahulshettyacademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rahulshettyacademy.pageobjects.CartPage;

public class AbstractComponent {

	WebDriver driver;
	
	public AbstractComponent(WebDriver driver) {
		
		this.driver=driver;
	}


	public void waitForElementToAppear(By findBy)
	
	{
		
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	
public void waitForWebElementToAppear(WebElement findBy)
	
	{
		
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	
	
	public void waitForElementToDisappear(WebElement ele)
	{
		
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	@FindBy(css="[routerlink*='cart']")
	WebElement cartHeader;
	
	public CartPage goTocartPage()
	{
		
		cartHeader.click();
		CartPage cartPage=new CartPage(driver);
		return cartPage;
	}
}
