package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
public class Day14_NoSuchElementException extends TestBase {
    @Test
    public void noSuchElementExceptionTest(){
        driver.get("https://techproeducation.com/");

//        Wrong locator
        driver.findElement(By.id("wrong-id")).click();// org.openqa.selenium.NoSuchElementException:
    }
}