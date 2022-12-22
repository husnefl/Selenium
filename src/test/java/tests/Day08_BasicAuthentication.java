package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day08_BasicAuthentication extends TestBase {

    @Test
    public void authTest(){
        /*
        Authentications are used for security reason(Dogrulama,dogurulugunu ispat etme)
        username : admin
        pass     : admin
        url      : the-internet.herokuapp.com/basic_auth
        SPECIAL URL FOR AUTHENTICATION
        GO LINK  : https://username:pass@url
         */
        //this will do authentication
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //assertion
        String successMessage = driver.findElement(By.xpath("//p")).getText();
        Assert.assertTrue(successMessage.contains("Congratulations! You must have the proper credentials."));
    }
}
