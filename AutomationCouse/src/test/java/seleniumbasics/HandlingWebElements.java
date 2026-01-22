package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements extends Base {

    public void verifyWebElements() {

        driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");

        WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
        messageBox.sendKeys("test message");

        WebElement showsMsgButton = driver.findElement(By.xpath("//button[@id='button-one']"));
        System.out.println(showsMsgButton.isDisplayed());
        System.out.println(showsMsgButton.isEnabled());
        showsMsgButton.click();

        WebElement textMessage = driver.findElement(By.id("message-one"));
        System.out.println(textMessage.getText());

        messageBox.clear();
        System.out.println(showsMsgButton.getCssValue("background-color"));
    }

    public static void main(String[] args) {
        HandlingWebElements webElement = new HandlingWebElements();
        webElement.initialiseBrowser();
        webElement.verifyWebElements();
    }
}
