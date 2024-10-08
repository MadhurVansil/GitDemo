package rahulshettyacademy.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingPage;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\EclipseWorkspace\\SeleniumFrameworkDesign\\src\\main\\java\\rahulshettyacademy\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		
		
		}
		
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			
			//firefox
		}
		
		else if (browserName.equalsIgnoreCase("edge"))
		{
			
			//edge
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	@BeforeMethod
	public LandingPage launchApplication() throws IOException
	{
		
		driver=initializeDriver();
		
		landingPage=new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
		
	}
	
	
	public void tearDown()
	{
		
		driver.close();
		
	}
	
	
}
