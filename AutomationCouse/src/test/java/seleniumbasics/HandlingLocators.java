package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base {
	
	public void verifyLocators()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("description"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		// cssSelector syntax -- tagname[attribute='attributevalue']
		driver.findElement(By.cssSelector("button[id='button-one']"));
		// absolute Xpath & Relative Xpath -- we use relative Xpath
		// this is full Xpath i.e absolute Xpath -- /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
		// Relative Xpath syntax current node -- //tagname[@attribute='attributevalue']
		//*[@id="button-one"]
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		//ancestor is used to locate parents
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		// Next topic -- WebElements -- It is an interface
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingLocators hl = new HandlingLocators();
		hl.initialiseBrowser();
		hl.verifyLocators();

	}

}
