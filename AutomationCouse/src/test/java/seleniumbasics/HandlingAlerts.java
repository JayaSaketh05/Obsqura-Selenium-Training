package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		//al.dismiss();
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("test message");
		al.accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingAlerts alerts = new HandlingAlerts();
		alerts.initialiseBrowser();
		//alerts.verifySimpleAlert();
		//alerts.verifyConfirmAlert();
		alerts.verifyPromptAlert();

	}

}
