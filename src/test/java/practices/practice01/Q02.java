package practices.practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02 {
    //  ...Practice 2...
    // Set Driver Path
    // Create chrome driver object
    // Maximize the window
    // Open google home page https://www.google.com/
    // Wait for 3 seconds
    // Go to the "https://techproeducation.com/"
    // Get the title and URL of the page
    // Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
    // Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
    // Then go to "https://medunna.com/"
    // Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
    // Back to the previous webpage
    // Refresh the page
    // Navigate to forward
    // Wait for 3 seconds
    // Close the browser
    public static void main(String[] args) throws InterruptedException {
        // Set Driver Path
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");

        // Create chrome driver object
        WebDriver driver =  new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        // Wait for 3 seconds
        Thread.sleep(3000);
        // Go to the "https://techproeducation.com/"
        driver.navigate().to("https://techproeducation.com/");

        // Get the title and URL of the page
        String techproTitle = driver.getTitle();
        System.out.println("techproTitle=" +techproTitle);
        String techproURL =driver.getCurrentUrl();
        System.out.println("techproURL =" + techproURL);

        // Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
       if (techproTitle.contains("Bootcamps")){
           System.out.println("Title contains Bootcamps");
       }else{
           System.out.println("Title does not contain Bootcamps");
       }

        // Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
       if (techproURL.contains("Courses")){
           System.out.println("URL contains Courses");

       }else{
           System.out.println("URL does not contain Courses");
       }

       // Then go to "https://medunna.com/"
        driver.get("https://medunna.com/");

        // Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
     String medunnaTitle= driver.getTitle();
       if (medunnaTitle.contains("MEDUNNA")){
           System.out.println("Title contains MEDUNNA");
       }else{
           System.out.println("Title does not contain MEDUNNA");
       }

        // Back to the previous webpage
        driver.navigate().back();

        // Refresh the page
        driver.navigate().refresh();
        // Navigate to forward
        driver.navigate().forward();

        // Wait for 3 seconds
        Thread.sleep(3000);

        // Close the browser
        driver.close();
    }
}
