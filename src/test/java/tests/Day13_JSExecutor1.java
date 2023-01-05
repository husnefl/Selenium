package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class Day13_JSExecutor1 extends TestBase {
    /*
    Given
        Go to https://techproeducation.com/"
    When
        Scroll into "WE OFFER"
    And
        Scroll into "LMS LOGIN"
    And
        Scroll into "WHY US"
    And
        Scroll back up to "Enroll Free"
    And
        Scroll all the way down
    And
        Scroll all the way up
    Then
        Take a screenshot of each step
     */
    @Test
    public void scrollIntoViewTest() throws IOException {
//        Go to https://techproeducation.com/
        driver.get("https://techproeducation.com/");
        takeScreenshotOfPage();
        //Thread.sleep(3000);
        waitFor(2);
        WebElement weOffer = driver.findElement(By.xpath("//*[.='we offer']"));
        //Create JS Executor object
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true);",weOffer);
       takeScreenshotOfPage();

       // Scroll into "LMS LOGIN"
        waitFor(2);
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.linkText("LMS LOGIN")));
        takeScreenshotOfPage();

//        Scroll into "WHY US"
      //h3[.='WHY US?']
        waitFor(2);
        //scrollIntoViewJS() resuable method in testbase class to scroll into a view by using javascriot executor
       scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
       takeScreenshotOfPage();

//        Scroll back up to "Enroll Free"
        waitFor(2);
        scrollIntoViewJS(driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        takeScreenshotOfPage();

//        Scroll all the way down by using JavaScript
        waitFor(2);
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        scrollAllDownByJS();
        takeScreenshotOfPage();

//        Scroll all the way up
        waitFor(2);
        scrollAllUpByJS();
        takeScreenshotOfPage();

    }
    @Test
    public void clickByJSTest(){
        //        Go to https://techproeducation.com/
        driver.get("https://techproeducation.com/");

        //click on LMS LOGIN by using JS  Executor
        WebElement LMSLoginButton = driver.findElement(By.linkText("LMS LOGIN"));
        //LMSLoginButton.click();//selenium click
        clickByJS(LMSLoginButton);//if doesnot work selenium use this one
    }
    @Test
    public void clickByJSTest2(){
       // Go to  http://www.uitestpractice.com/Students/Form
        driver.get("http://www.uitestpractice.com/Students/Form");

        //click on "Submit"Button
      //  driver.findElement(By.xpath("//button[.='Submit']")).click();//selenium click did not work
        clickByJS(driver.findElement(By.xpath("//button[.='Submit']")));
    }

    @Test
    public  void setValueByJSTest(){
        //go to https://techproeducation.com/
        driver.get("https://techproeducation.com/");

        //Type "QA" into search box
       WebElement searchBox = driver.findElement(By.name("s"));
      // searchBox.sendKeys("QA");//selenium sendKey() method

        setValueByJS(searchBox,"QA");//JS set Attribute

    }

    @Test
    public void getValueByJSTest(){

        //Go to https://www.carettahotel.com/
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();//We did use these two because of security issue

        //Get the value of "CHECK-IN DATE"
        System.out.println("Selenium getText(): "+driver.findElement(By.id("checkin_date")).getText());//It does not take the default value of web element by using selenium getText()
        getValueByJS("checkin_date");

    }

    @Test
    public void changeBackgroundColorAndBorderByJavaJs(){
        //Go to https://www.carettahotel.com/
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();//We did use these two because of security issue

        //Change the color ""Check Availability"
       WebElement checkAvailability = driver.findElement(By.xpath("//input[@type='submit']"));
       changeBackgroundColorByJS(checkAvailability,"red");


        //Add border to "Log In"
        addBorderWithJS(driver.findElement(By.linkText("Log in")), "5px solid red");



    }



}
