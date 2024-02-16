package Webdriver_FrameWork.Selenium_FrameWork_design;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilleties.ExcelData;
import Utilleties.browser_inetiate;
import objectRepositry.HomePage;
import objectRepositry.logInPage;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    String data[];
    /**
     * Rigorous Test :-)
     */
    @Test
   // @Parameters({"user","pass"})
   
public void valid_application() throws IOException  {
//		ExtentReports report=new ExtentReports();
//		ExtentSparkReporter sparkreport=new ExtentSparkReporter("C:\\Users\\shoai\\eclipse-workspace\\Selenium_FrameWork_design\\target\\report.html");
//		ExtentTest et=report.createTest("login Application");
//		report.attachReporter(sparkreport);
		
		browser_inetiate br=new browser_inetiate();
		driver=br.crose_browser();
		//et.log(Status.PASS,"user launched the browser");

     
		HomePage h=new HomePage(driver);
        h.signIn();
        //et.log(Status.PASS,"welcome to Home page");

        ExcelData ex=new ExcelData();
        ex.readExcel();
        String user=data[0];
        String pass=data[1];
        logInPage l=new logInPage(driver);
        l.logIn_cardential(user,pass);
        //et.log(Status.PASS,"user successfully login ");

        //report.flush();
	}
}
	







