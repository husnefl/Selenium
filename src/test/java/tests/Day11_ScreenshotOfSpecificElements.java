package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import java.io.File;
import java.io.IOException;
public class Day11_ScreenshotOfSpecificElements extends TestBase {
    @Test
    public void screenshotTest() throws IOException {
        driver.get("https://www.techproeducation.com");

        //Assert the logo is displayed
       WebElement techProEdLogo = driver.findElement(By.xpath("//div[@data-id='898ce2e']"));

        //verifying the logo
        Assert.assertTrue(techProEdLogo.isDisplayed());
        //getting the screenshot using reusable method
        takeScreenshotOfTheElement(techProEdLogo);
        //        taking screenshot of social media icons
        WebElement socials = driver.findElement(By.xpath("//div[@data-id='d7545f2']"));
        takeScreenshotOfTheElement(socials);
    }
}
/*
with in selenium 4, we can even take the screenshots of elements
>WebElement logo = driver.findElement (By.xpath(“//div[@id=’divLogo’]//img”));
File file = logo.getScreenshotAs(OutputType.FILE);
File destFile =new File(“logo.png”);
FileUtils.copyFile(file,destfile);








/
 */