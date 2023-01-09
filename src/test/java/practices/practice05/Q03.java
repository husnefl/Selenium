package practices.practice05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q03 extends TestBase {
    /*
  Given
      Go to https://www.facebook.com/
  When
      Click on "Create New Account"
  And
      Fill all the boxes by using keyboard actions class
   */
    @Test
    public void test(){
//        Go to "https://www.facebook.com/"
        driver.get("https://www.facebook.com/");
        waitFor(3);
//        Click on "Create New Account"
        driver.findElement(By.linkText("Create new account")).click();
        waitFor(3);
//        Fill all the boxes by using keyboard actions class
        WebElement firstNameBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions = new Actions(driver);
        actions.
                click(firstNameBox).
                sendKeys("John").
                sendKeys(Keys.TAB).
                sendKeys("Doe").
                sendKeys(Keys.TAB).
                sendKeys("1234").
                sendKeys(Keys.TAB).
                sendKeys("John.123").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("11").
                sendKeys(Keys.TAB).
                sendKeys("Feb").
                sendKeys(Keys.TAB).
                sendKeys("2000").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();

    }
}