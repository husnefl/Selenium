package tests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day11_ExtentReports extends TestBase {

    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @BeforeClass
    public static void extentReportsSetUp() {
        //      REPORT  PATH
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/test-output/reports/" + currentTime + "html_report.html";

//        creating HTML report in the path
        extentHtmlReporter = new ExtentHtmlReporter(path);
//        creating extent reports object for generating the Entire reports with configuration
        extentReports = new ExtentReports();

//        ***************
//        adding custom System Info
        extentReports.setSystemInfo("Test Environment", "Regression");
        extentReports.setSystemInfo("Application", "TechProEd");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Team", "Eagles");
        extentReports.setSystemInfo("SQA", "John Fox");

//        adding more custom config info
        extentHtmlReporter.config().setReportName("TechProEd home page");
        extentHtmlReporter.config().setDocumentTitle("TechProEd extent reports");

//        ********************
//        DONE WITH CONFIGURATION(Attach Reporter)
        extentReports.attachReporter(extentHtmlReporter);
//        SUMMARY: Extent Reports and Extent HTML Reporter is used to add custom information on the report and create the report in a PATH
//        REPORT IS DONE. NOW CREATING EXTENT TEST TO LOG INFO IN THE TEST CASE
//        Creating extent test
        extentTest = extentReports.createTest("My Extent Reporter", "Regression Test Report");
    }
    @Test
    public void extentReportsTest(){
        //use the report
        driver.get("https://www.techproeducation.com");
        extentTest.pass("User is on TechPro Education Home page");
//        click on LMS
        driver.findElement(By.linkText("LMS LOGIN")).click();
        extentTest.pass("User is on LMS home page");
//        verify the URL
        String expectedURL ="https://lms.techproeducation.com/";
        String actualURL=driver.getCurrentUrl();
        extentTest.pass("Asserting the LMS URL");
        Assert.assertEquals("LMS LOGIN PAGE IS NOT DISPLAYED",expectedURL,actualURL);
        extentTest.pass("TEST IS COMPLETE");
       /*
       // verify the url 2.way:
       String lmsUrl = driver.getCurrentUrl();
        assertEquals("https://lms.techproeducation.com/",lmsUrl);
        extentTest.pass(Url assertion is done)
        */
    }
    @Test
    public void extentReportsTest2(){
//        pass is used to mark the step as PASSED
        extentTest.pass("PASS");
//        info is used to just give an information for that step
        extentTest.info("INFO");
//        fail is used to mark the step as FAILED
        extentTest.fail("FAILED");
//        skip is used to mark the step as SKIPPED
        extentTest.skip("SKIPPED");
//        warning is used to give working information
        extentTest.warning("WARNING");
    }


    @AfterClass
    public static void extentReportsTearDown(){
       //generate the report
        extentReports.flush();//herseyi getirAction classtaki perform gibi o olmadan gelmiyor

    }
    }






