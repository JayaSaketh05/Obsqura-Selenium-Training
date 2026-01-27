package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements extends Base {

    public void verifyWebElements() {

        driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");

        WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
        messageBox.sendKeys("test message");
      // driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("test message"); 
      // line 14 can be used as a combo of lines 12 & 13

        WebElement showsMsgButton = driver.findElement(By.xpath("//button[@id='button-one']"));
        System.out.println(showsMsgButton.isDisplayed());
        System.out.println(showsMsgButton.isEnabled());
        showsMsgButton.click();

        WebElement textMessage = driver.findElement(By.id("message-one"));
        System.out.println(textMessage.getText());

        //messageBox.clear();
        System.out.println(showsMsgButton.getCssValue("background-color"));
    }

    public static void main(String[] args) {
        HandlingWebElements webElement = new HandlingWebElements();
        webElement.initialiseBrowser();
        webElement.verifyWebElements();
    }
}
