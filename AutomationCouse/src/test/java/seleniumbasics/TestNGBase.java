package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	
public WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser()
	{
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void browserCloseAndQuit()
	{
		// driver.close(); closes only currently opened window
		// driver.quit(); // closes all the windows
	}

}
