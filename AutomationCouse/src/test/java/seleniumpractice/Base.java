package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public void initialiseBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().fullscreen();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base = new Base();
		base.initialiseBrowser();

	}

}
