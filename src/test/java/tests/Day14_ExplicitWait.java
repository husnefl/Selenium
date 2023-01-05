package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;
import java.time.Duration;
public class Day14_ExplicitWait extends TestBase {
    @Test
    public void explicitWaitTest(){
//        Create a class:ExplicitWait
//        Create a method: explicitWait
//        Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        When user clicks on the Start button
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
//        Then verify the ‘Hello World!’ Shows up on the screen
//        THIS PIECE OF CODE FAILS CAUSE IMPLICIT WAIT IS NOT ABLE TO HANDLE THE WAIT TIME
//        SOLUTION: TRY EXPLICIT WAIT OR FLUENT WAIT
//        WebElement helloElement = driver.findElement(By.xpath("//div[@id='finish']//h4"));
//        Assert.assertEquals("Hello World!",helloElement.getText());
//        1. Create webdriver wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        2. Use wait object to handle syncronization issue(wait issue)
//        *waits for teh xpath to be visible UP TP 10 SECONDS
//        *returns the WEB ELEMENT
//        *If the element is not found within 10 seconds, the throw time out exception
        WebElement helloElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
        Assert.assertEquals("Hello World!",helloElement.getText());
    }
    @Test
    public void explicitWaitReusable(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        WebElement helloElement = waitForClickablility(By.xpath("//div[@id='finish']//h4"),10);
        Assert.assertEquals("Hello World!",helloElement.getText());

    }
}
