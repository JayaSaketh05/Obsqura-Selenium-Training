package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		
		WebElement rightClick = driver.findElement(By.xpath("//a[@id='others']"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).build().perform();
		
	}
	
	public void verifyMouseHover() {
		
		WebElement mouseHover = driver.findElement(By.xpath("//a[@id='others']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHover).build().perform();
	}

	public void verifyDragAndDrop() {
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingActions actions = new HandlingActions();
		actions.initialiseBrowser();
		//actions.verifyRightClick();
		//actions.verifyMouseHover();
		actions.verifyDragAndDrop();

	}

}
