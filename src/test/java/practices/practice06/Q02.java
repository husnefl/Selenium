package practices.practice06;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q02 extends TestBase {
    //We will make a roof of 5% of the height of the earliest built tower.
    //Find how many meters we will build.
     /*
    Given
        Go to https://www.techlistic.com/p/demo-selenium-practice.html
    When
        Put all built years into a list
    And
        Calculate min year
    And
        Put all heights into a list
    And
        Calculate the height to build
    Then
        Assert that build height is 25.45 meters
     */

    @Test
    public void test(){
//        Go to https://www.techlistic.com/p/demo-selenium-practice.html
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

//        Put all built years into a list
        List<WebElement> builtYears = driver.findElements(By.xpath("(//tbody)[2]/tr/td[4]"));


//        Calculate min year
        int minYear = Integer.parseInt(builtYears.get(0).getText());
        for (WebElement w : builtYears){

            if(Integer.parseInt(w.getText())<minYear){
                minYear = Integer.parseInt(w.getText());
            }

        }
        System.out.println("minYear = " + minYear);//2004

//        Put all heights into a list

//        Calculate the height to build

//        Assert that build height is 25.45 meters





    }
}