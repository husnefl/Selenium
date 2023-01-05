package tests;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
public class Day14_NullPointerException {
    //    DECLARED BUT NEVER INSTANTIALTED
    WebDriver driver;//null
    Faker faker;
    @Test
    public void nullPointerExceptionTest(){
        driver.get("https://techproeducation.com/");//NullPointerException
    }
    @Test
    public void nullPointerTest1(){
        System.out.println(faker.name().fullName());//NullPointerException
    }
}
