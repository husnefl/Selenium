package practices.practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static junit.framework.TestCase.assertEquals;

public class Q03 extends TestBase {
/*


    Given
        Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    When
        Click all the buttons
    Then
        Assert all buttons clicked
     */

    @Test
    public void Test() {
//       Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
//       Click all the buttons
        driver.findElement(By.id("onblur")).click();
        waitFor(2);
        driver.findElement(By.id("onclick")).click();//This is for clicking on "onBlur" button
        waitFor(2);
        driver.findElement(By.id("onclick")).click();//This is for clicking on "onClick" button

        WebElement oncontextmenu = driver.findElement(By.id("oncontextmenu"));
        WebElement ondoubleclick = driver.findElement(By.id("ondoubleclick"));
        WebElement onfocus = driver.findElement(By.id("onfocus"));
        WebElement onkeydown = driver.findElement(By.id("onkeydown"));
        WebElement onkeyup = driver.findElement(By.id("onkeyup"));
        WebElement onkeypress = driver.findElement(By.id("onkeypress"));
        WebElement onmouseover = driver.findElement(By.id("onmouseover"));
        WebElement onmouseleave = driver.findElement(By.id("onmouseleave"));
        WebElement onmousedown = driver.findElement(By.id("onmousedown"));

        Actions actions = new Actions(driver);
//        2.way:
//        waitFor(1);
//        actions.contextClick(oncontextmenu).perform();
//        waitFor(1);
//        actions.doubleClick(ondoubleclick).perform();
//        waitFor(1);
//        actions.click(onfocus).perform();
//        waitFor(1);
//        actions.click(onkeydown).sendKeys(Keys.ENTER).perform();
//        waitFor(1);
//        actions.click(onkeyup).sendKeys(Keys.ENTER).perform();
//        waitFor(1);
//        actions.click(onkeypress).sendKeys(Keys.ENTER).perform();
//        waitFor(1);
//        actions.moveToElement(onmouseover).perform();
//        waitFor(1);
//        actions.moveToElement(onmouseleave).perform();
//        waitFor(1);
//        actions.click(onmousedown).perform();//This one did not work because of previous leave action
//        waitFor(1);
//        actions.click(onmousedown).perform();
//
        waitFor(2);
        actions.
                contextClick(oncontextmenu).
                doubleClick(ondoubleclick).
                click(onfocus).
                click(onkeydown).sendKeys(Keys.ENTER).
                click(onkeyup).sendKeys(Keys.ENTER).
                click(onkeypress).sendKeys(Keys.ENTER).
                moveToElement(onmouseover).
                moveToElement(onmouseleave).
                click(onmousedown).//This  one did not work bbecause of previous leave action
                click(onmousedown).
                build().perform();
        waitFor(2);

//        Assert all buttons clicked
        int numberOfClickedButtons = driver.findElements(By.xpath("//p[.='Event Triggered']")).size();
        assertEquals(11, numberOfClickedButtons);
    }
}
