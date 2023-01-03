package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import utilities.TestBase;
import java.io.IOException;
public class Day13_JSExecutor extends TestBase {
    @Test
    public void scrollIntoViewTest() throws IOException {
        driver.get("https://techproeducation.com/");
        waitFor(3);
//        1. create js executor object
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        2. execute the command
        waitFor(3);
//        scrolling We Offer element
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[.='we offer']")));
        waitFor(3);
        takeScreenshotOfPage();

        waitFor(3);
//        scrolling LMS LOGIN element
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        waitFor(3);
        takeScreenshotOfPage();

        waitFor(3);
//        scrolling WHY US element
        scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
        waitFor(3);
        takeScreenshotOfPage();

        waitFor(3);
//        scrolling back up to enroll free
        scrollIntoViewJS(driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        waitFor(3);
        takeScreenshotOfPage();

//     scroll all the way down
        scrollAllDownByJS();
        waitFor(3);
        takeScreenshotOfPage();


//    scroll all the way up
        scrollAllUpByJS();
        waitFor(3);
        takeScreenshotOfPage();

    }

    @Test
    public void clickByJSTest() {
        driver.get("https://techproeducation.com/");
//        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
//        clickByJS(lmsLogin);
        clickByJS(driver.findElement(By.linkText("LMS LOGIN")));
    }
    @Test
    public void typeInTheInputTest(){
        driver.get("https://techproeducation.com/");
        setValueByJS(driver.findElement(By.xpath("//input[@type='search']")), "QA");
    }

    @Test
    public void getValueOfInputTest(){

        driver.get("https://www.priceline.com/");
        getValueByJS("hotelDates");
/*
//We are able to get the default value of the Check-in Check-out box
//This is one of the limitations of the selenium because normally, we cannot get the value of an attribute with selenium

 */
    }
    @Test
    public void colorByJSTest(){
        driver.get("https://www.priceline.com/");
        changeBackgroundColorByJS(driver.findElement(By.xpath("//button[@data-testid='HOTELS_SUBMIT_BUTTON']")),"yellow");
        addBorderWithJS(driver.findElement(By.xpath("//button[@data-testid='HOTELS_SUBMIT_BUTTON']")),"5px solid green");
    }



}



