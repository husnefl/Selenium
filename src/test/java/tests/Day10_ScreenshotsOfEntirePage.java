package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
import java.io.IOException;
public class Day10_ScreenshotsOfEntirePage extends TestBase {
    @Test
    public void takeScreenShotTest() throws IOException, InterruptedException {
//        Given user search for ‘uni’
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//      TAKE A SCREENSHOT. CREATE A REUSABLE METHOD AND CALL THAT METHOD
        takeScreenshotOfPage();
//       COMPLETE AS HOMEWORK
//        And select United Kingdom
//        searchAndSelectFromList("uni","United Kingdom");
//        When user type “uni” in the search box
        driver.findElement(By.id("myCountry")).sendKeys("uni");
//       And select the ‘United Kingdom’ from the suggestions
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='United Kingdom']")).click();
//        TAKE SCREENSHOT
        takeScreenshotOfPage();
//        Add click on submit button
        //    And click on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();
//        TAKE SCREENSHOT
        takeScreenshotOfPage();
//        Then verify the result contains united Kingdom
        //    Then verify the result contains ‘United Kingdom’
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
//        TAKE SCREENSHOT
        takeScreenshotOfPage();
    }
}