package Webdriver_FrameWork.Selenium_FrameWork_design;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POM_JpetStore.LogIn;
import POM_JpetStore.account_Info;
import POM_JpetStore.profile_Information;
import POM_JpetStore.saveInformation;
import POM_JpetStore.signIn_jpet;
import POM_JpetStore.user_Info;
import jpetStore.ExcelRead;
import jpetStore.browser_intiate1;

public class TestPage {
    WebDriver driver;
    String data[];
    @BeforeMethod
    public void setup() throws InterruptedException, IOException {
    	browser_intiate1 br=new browser_intiate1();
		driver=br.crose_browser1();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    String Excelpath=("C:\\Users\\shoai\\OneDrive\\Desktop\\ReadFile.xlsx");

    @Test(dataProvider="information")
    public void valid_Reg(String fname,String lname,String Email,String phone,String address1,String city,String state,String zip,String country) throws IOException, InterruptedException {
    	ExtentReports report=new ExtentReports();
		ExtentSparkReporter sparkreport=new ExtentSparkReporter("C:\\Users\\shoai\\eclipse-workspace\\Selenium_FrameWork_design\\target\\report.html");
		ExtentTest et=report.createTest("login Application");
		report.attachReporter(sparkreport);
    	
    	data=new String[5];
    	
		LogIn lf=new LogIn(driver);
		lf.logIn_Info();
		et.log(Status.PASS,"user launched the browser");
		signIn_jpet si=new signIn_jpet(driver);
		si.register();
		
		FileInputStream fis=new FileInputStream(Excelpath);
		//read the excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String userId=sheet.getRow(1).getCell(0).getStringCellValue();
		String newpassword=sheet.getRow(1).getCell(1).getStringCellValue();
		String repeatpass=sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(userId + "" + newpassword + "" + repeatpass);

		
		user_Info ur=new user_Info(driver);
		ur.accountData(userId, newpassword,repeatpass);
		et.log(Status.PASS,"user's information get entered");
		
		account_Info ai=new account_Info(driver);
        ai.profileData(fname,lname,Email,phone,address1,city,state,zip,country);
        et.log(Status.PASS,"user's profile data entered");
       
        profile_Information pf=new profile_Information(driver);
       pf.profileInfo();
       
      // saveInformation sm=new saveInformation(driver);
       //sm.save_Info();
    	//To take a Screen shot:
      TakesScreenshot sc= (TakesScreenshot)driver;
      File file=sc.getScreenshotAs(OutputType.FILE);
      File dest=new File("C:\\Users\\shoai\\OneDrive\\Desktop\\Screen\\scr"+System.currentTimeMillis()+"jpeg");
      FileUtils.copyFile(file, dest);
      et.log(Status.PASS,"ScreenShot capture sucessfully");
      
     
}
    
	@DataProvider(name="information")
    public Object[][]getData()
    {
    	return new Object[][] {
    		new Object[]{"tasmia","rahman","tasmia@gmail.com","54332456","3421 73 street","jackson heights","New york","11372","usa"}
    	};
    }
	
	
	@AfterMethod
    public void afterMethod() throws InterruptedException {
    	Thread.sleep(2000);
		driver.close();
    }
	//String act=driver.getTitle();
	//Assert.assertEquals(act,"expected result");

}
