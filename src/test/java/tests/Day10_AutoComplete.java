package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
public class Day10_AutoComplete extends TestBase {
    @Test
    public void autoCompleteTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        //    When user type “uni” in the search box
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        //    And select the ‘United Kingdom’ from the suggestions
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='United Kingdom']")).click();
        //    And click on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();
        //    Then verify the result contains ‘United Kingdom’
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
    }
    @Test
    public void autoCompleteTestWithReusabelMethod() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        searchAndSelectFromList("uni","United Kingdom");// TEST CASE 1
        searchAndSelectFromList("an","Angola");//TEST CASE 2
        searchAndSelectFromList("bah","Bahamas");//TEST CASE 3
    }
}