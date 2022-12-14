package tests;
import org.junit.Assert;
import org.junit.Test;
public class Day03_Assertions {
    @Test
    public void assertions(){
        /*
        What is assertion in testing?
        Assertion is done to check if expected result is equal to actual result.
        -expected == actual -> pass
        -expected != actual -> fail
        ------------------
        assertEquals("expected","actual");
        assertTrue(true); -> pass
        assertTrue(false); -> fail
        assertFalse(false); -> pass
        assertFalse(true); -> fail
        --------------------
         */
        Assert.assertEquals(5,5);//pass
        if("Java".contains("apple")){//FAIL
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Assert.assertEquals("java","java");//PASS
        Assert.assertEquals("java".contains("j"),true);//PASS
//        --------------------
        Assert.assertTrue("java".contains("j"));//PASS
//        --------------------
        Assert.assertFalse("Java".contains("j"));//PASS cauz:AssertFalse = statement("Java".contains("j") false = pass
//        TEST EXECUTION STOPS IF ONE THE ASSERTION FAILS. THIS IS CALLED HARD ASSERTIOS
//        TEST EXECUTION CONTINUES EVEN IF TEST VERRIFICATION FAILS. VERIFICATION MEANS LIKE IF STATEMENT
//        What is difference between Assertion and Verification?
//        Assertion stops after assertion fails. Verification continues even after verification fails
//        Junit assertions are hard assertion. If statement is verification
//        NOTE: TestNG has soft assertion as well. We will learn it in TestNG

    }
}
