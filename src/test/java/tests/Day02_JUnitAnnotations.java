package tests;
import org.junit.*;

public class Day02_JUnitAnnotations {
    /*
     * So far we kept using main method
     * We no longer need to use main method to create test cases with JUnit
     * -@Test : is used to create test cases
     * NOTE: All @Test methods must be void
     * -@Before: Runs before each @Test class. This is used to run repeated preconditions.
     * For Example : set up.create driver,maximize window
     * -@After : Runs after each @Test class. This is used to run repeated after condition
     * For Example; driver quit, report generation
     * @BeforeClass: Runs before each Class only ONCE.This method must be static
     * @AfterClass:Runs after each Class only ONCE.This method must be static
     * -@Ignore  :Is used skip/ignore test case
     * * */


    @BeforeClass
    public  static void setUpClass(){
        System.out.println("Before Class Runs before the entire class ONCE");
    }

    @AfterClass
    public static void afterClass (){
        System.out.println("After Class Runs after the entire class ONCE");
    }
    @Before
    public void setUp(){
        System.out.println("Before Method Runs before each @Test annotation");
    }
    @After
    public void tearDown(){
        System.out.println("After Method Runs after each @Test annotation");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test @Ignore
    public void test3(){
        System.out.println("Test 3");
    }
    @Test
    public void test4(){
        System.out.println("Test 4");
    }
    @Test
    public void test5(){
        System.out.println("Test 5");
    }
}
