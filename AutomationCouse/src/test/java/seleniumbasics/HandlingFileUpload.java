package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	
	public void fileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
		fileUpload.sendKeys("C:\\Users\\Jaya Saketh\\git\\Obsqura-Selenium-Training\\AutomationCouse\\src\\test\\resources");
		WebElement checkBox = driver.findElement(By.id("terms"));
		checkBox.click();
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();
		
	}
	
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadButton = driver.findElement(By.id("pickfiles"));
		uploadButton.click();
		
		StringSelection string = new StringSelection("\"C:\\Users\\Jaya Saketh\\git\\Obsqura-Selenium-Training\\AutomationCouse\\src\\test\\resources\\45375-Charts.pdf\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		
		Robot r = new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingFileUpload fileUpload = new HandlingFileUpload();
		fileUpload.initialiseBrowser();
		// fileUpload.fileUploadUsingSendKeys();
		try {
			fileUpload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
