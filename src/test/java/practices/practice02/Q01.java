package practices.practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Q01 extends TestBase {
      /*
    Given
         Go to url : https://phptravels.com/demo/
    When
         Fill the form
    And
         Click on 'SUBMIT'
    Then
         Assert that the form has been sent
     */

    @Test
    public void test() throws InterruptedException {
        //Go to url : https://phptravels.com/demo/
        driver.get("https://phptravels.com/demo/");

        //Fill the form
        driver.findElement(By.name("first_name")).sendKeys("John");
        driver.findElement(By.name("last_name")).sendKeys("Doe");
        driver.findElement(By.name("business_name")).sendKeys("QA Engineer");
        driver.findElement(By.name("email")).sendKeys("john@doe.com");

        int number1 = Integer.parseInt(driver.findElement(By.id("numb1")).getText());
        int number2 = Integer.parseInt(driver.findElement(By.id("numb2")).getText());
        String result = number1+number2+"";

        driver.findElement(By.id("number")).sendKeys(result);

        //Click on 'SUBMIT'
        driver.findElement(By.id("demo")).click();

        //Assert that the form has been sent

        WebElement thankYou = driver.findElement(By.xpath("//strong[.=' Thank you!']"));
        Thread.sleep(5000);
        assertTrue(thankYou.isDisplayed());

    }
}