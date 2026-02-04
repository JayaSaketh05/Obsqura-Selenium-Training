package testscripts;

import java.io.IOException;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasics.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
	
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		
	//	WebElement username = driver.findElement(By.id("user-name"));
	//	username.sendKeys("standard_user");
		
	//	WebElement password = driver.findElement(By.id("password"));
	//	password.sendKeys("secret_sauce");
		
	//	WebElement loginButton = driver.findElement(By.id("login-button"));
	//	loginButton.click();
		
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	
	}
	
	
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		
	/*	WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauc");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	*/
		
		String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
		
	}
	
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		
	/*	
	 	WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_use");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	*/
		
		String usernamevalue = ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
		
		
		
	}
	
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		
	/*	WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_use");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauc");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	*/
		
		String usernamevalue = ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
		
	}

}
