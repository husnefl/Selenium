package practices.practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q03 extends TestBase {
    /*
   Given
       Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
   When
       Click "CLICK ME" of JavaScript Alert
   And
       Get the alert text
   Then
       Verify that message is "I am an alert box!"
   When
       Accept alert
    */
    @Test
    public void test(){
        //Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        //Click "CLICK ME" of JavaScript Alert
        driver.findElement(By.id("button1")).click();

        //Get the alert text
        String alertText = driver.switchTo().alert().getText();

        //Verify that message is "I am an alert box!"
        assertEquals("I am an alert box!",alertText);

        //Accept alert
        driver.switchTo().alert().accept();

    }
}