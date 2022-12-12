package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day01_BasicNavigation {
    public static void main(String[] args) {
//        STEP 1: SET UP
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
//        STEP 2: CREATE
        WebDriver driver = new ChromeDriver();
//        STEP 3: WRITE TEST SCRIPTS
//        Maximize the window
        driver.manage().window().maximize();
//        Open google home page https://www.walmart.com/
        driver.get("https://www.walmart.com/");
//        On the same class, Navigate to amazon home page https://www.amazon.com/
//        driver.get("https://www.amazon.com/");//WORKS
        driver.navigate().to("https://www.amazon.com/");
//        Navigate back to walmart
        driver.navigate().back();
//        Navigate forward to amazon
        driver.navigate().forward();
//        Refresh the page
        driver.navigate().refresh();
//        Close/Quit the browser
//        driver.close();
        driver.quit();
    }
}