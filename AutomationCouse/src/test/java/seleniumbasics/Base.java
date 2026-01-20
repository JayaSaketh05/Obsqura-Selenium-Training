package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	
	public void initialiseBrowser()
	{
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
		//driver.manage().window().maximize();
	}
	
	public void browserCloseAndQuit()
	{
		// driver.close(); closes only currently opened window
		driver.quit(); // closes all the windows
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.initialiseBrowser();
		base.browserCloseAndQuit();

	}

}
