import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    //    MAIN METHOD
    public static void main(String[] args) {
//    chrome : webdriver.chrome.driver
//    1. SETTING THE PATH FOR CHROMEDRIVER
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");//MAC
//    System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");//WINDOWS

//    2. CREATE CHROME DRIVER
        WebDriver driver = new ChromeDriver();

//    3. WRITE YOUR TEST CASES
        driver.get("https://www.amazon.com");

    }
}