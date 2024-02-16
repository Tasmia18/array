package jpetStore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser_intiate1 {
	WebDriver driver;
	  String FilePath="C:\\Users\\shoai\\eclipse-workspace\\Selenium_FrameWork_design\\config.properties";
		public WebDriver crose_browser1() throws IOException
		{
		
			FileInputStream fis=new FileInputStream(FilePath);
			Properties p=new Properties();
			p.load(fis);
			String browsername=p.getProperty("browser");
			switch(browsername)
			{
			case "Chrome":{
			 driver=new ChromeDriver();
				driver.get(p.getProperty("url"));
				break;
			}
			case "Edge":{
				driver=new EdgeDriver();
				driver.get(p.getProperty("url"));
				break;
			}
			case "Firefox":{
				driver=new FirefoxDriver();
				driver.get(p.getProperty("url"));
				break;
			}
			}
		    return driver;
		}
	}


