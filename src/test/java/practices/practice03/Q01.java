package practices.practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q01 extends TestBase {
    /*
   Given
       Go to https://demo.guru99.com/test/drag_drop.html

   When
       Drag orange elements on proper boxes below them

   Then
       Verify they are dropped.
 */
    @Test
    public void test(){
        //Go to https://demo.guru99.com/test/drag_drop.html
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        //Drag orange elements on proper boxes below them
        //Locate elements:
        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement debitAccount = driver.findElement(By.id("bank"));
        WebElement sales = driver.findElement(By.id("credit1"));
        WebElement creditAccount = driver.findElement(By.id("loan"));
        WebElement price = driver.findElement(By.id("fourth"));
        WebElement debitAmount = driver.findElement(By.id("amt7"));
        WebElement creditAmount = driver.findElement(By.id("amt8"));

        //Create actions object:
        Actions actions = new Actions(driver);

        //Drag sources to target:
        actions.
                dragAndDrop(bank,debitAccount).
                dragAndDrop(sales,creditAccount).
                dragAndDrop(price,debitAmount).
                dragAndDrop(price,creditAmount).
                build().perform();

        //Verify they are dropped.
        WebElement perfect = driver.findElement(By.id("equal"));
        assertEquals("Perfect!", perfect.getText());

    }
}