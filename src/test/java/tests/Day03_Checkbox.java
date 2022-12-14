package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Day03_Checkbox {
    WebDriver driver;
    @Before
    public void setUp(){
        //        user goes to http://a.testaddressbook.com/sign_in
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
    }
    @Test
    public void checkboxTest(){
//Locationg checkbox 1 and checkbox2
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.id("box2"));
//        Click on the checkbox 1 if it is NOT already selected
        if (!checkbox1.isSelected()){//isSelected() returns true id checkbox is checked, returns false if checkbox is not checked
            checkbox1.click();
        }
//        Then click on checkbox2 if box is not selected
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
//        Then verify that checkbox1 is checked.
        Assert.assertTrue(checkbox1.isSelected());
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}