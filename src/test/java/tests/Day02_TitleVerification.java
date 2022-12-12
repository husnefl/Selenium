package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day02_TitleVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
        WebDriver driver =new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com");

        //get the title
       String actualTitle = driver.getTitle();
       String expectedTitle ="Techpro Education | Online It Courses & Bootcamps";

      //Verify if page title is "Techpro Education | Online It Courses & Bootcamps"
      if (actualTitle.equals(expectedTitle)){
          System.out.println("PASS");
      }else{
          System.out.println("FAIL");
          System.out.println("ACTUAL TITLE :" + actualTitle);
          System.out.println("EXPECTED TITLE :" + expectedTitle);
      }
      driver.quit();

    }
}
