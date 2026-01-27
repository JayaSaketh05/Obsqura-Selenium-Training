package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
public void handlingFrames() {
		
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());
		
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		
		WebElement frameText = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameText.getText());
		
		//to get the control back to whole page from just frames
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frames = new HandlingFrames();
		frames.initialiseBrowser();
		frames.handlingFrames();

	}

}
