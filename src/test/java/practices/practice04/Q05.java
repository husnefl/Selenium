package practices.practice04;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q05 extends TestBase {
    /*
    Given
        Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
    When
        Fill the username, password and textArea comment:
    And
        Choose a file and upload it
    And
        Select all checkboxes, radio item 1 and dropdown 1
    And
        Click on submit
   Then
        Verify that uploaded file name is on the Form Details
     */

    @Test
    public void test(){
        //Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

        //Fill the username, password and textArea comment:
        driver.findElement(By.name("username")).sendKeys("JohnDoe");
        driver.findElement(By.name("password")).sendKeys("1234");
        WebElement comments = driver.findElement(By.name("comments"));
        comments.clear();
        comments.sendKeys("Hello I am a comment");

        //Choose a file and upload it
        String userHome = System.getProperty("user.home");
        driver.findElement(By.name("filename")).sendKeys(userHome+"/Desktop/image.png");

        //Select all checkboxes, radio item 1 and dropdown 1
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='cb1']"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@value='cb2']"));
        WebElement checkBox3 = driver.findElement(By.xpath("//input[@value='cb3']"));

        if(!checkBox1.isSelected()){
            checkBox1.click();
        }
        if(!checkBox2.isSelected()){
            checkBox2.click();
        }
        if(!checkBox3.isSelected()){
            checkBox3.click();
        }

        driver.findElement(By.xpath("//input[@value='rd1']")).click();//Radio Button 1

        WebElement dropDown = driver.findElement(By.name("multipleselect[]"));
        Select select = new Select(dropDown);
        select.deselectAll();
        driver.findElement(By.xpath("//option[@value='ms1']")).click();//Option 1

        //Click on submit
        driver.findElement(By.xpath("//input[@value='submit']")).click();

        //Verify that uploaded file name is on the Form Details.
        String fileName = driver.findElement(By.id("_valuefilename")).getText();
        assertEquals("image.png",fileName);
    }
}