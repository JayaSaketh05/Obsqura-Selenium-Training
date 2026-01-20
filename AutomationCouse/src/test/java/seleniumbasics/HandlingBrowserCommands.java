package seleniumbasics;

public class HandlingBrowserCommands extends Base {
	
	public void verifyBrowserCommands()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		String handle = driver.getWindowHandle(); // getWindowHandles() for multiple windows
		System.out.println(handle);
	}
	
	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) 
	{
		HandlingBrowserCommands browser = new HandlingBrowserCommands();
		browser.initialiseBrowser();
		// browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
	}
}
