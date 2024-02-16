package selenium_properties.properties_objrepository;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    String filepath="C:\\Users\\shoai\\eclipse-workspace\\properties_objrepository\\or_properties";
    FileInputStream fis;
    
    @Test
    public void shouldAnswerWithTrue() throws IOException
    {
    	fis=new FileInputStream(filepath);
    	Properties p= new Properties();
    	p.load(fis);
    	driver.findElement(By.xpath(p.getProperty("signin"))).click();
    	driver.findElement(By.name(p.getProperty("user"))).sendKeys("j2ee");
    	driver.findElement(By.name(p.getProperty("pass"))).sendKeys("j2ee");
    	driver.findElement(By.name(p.getProperty("signon"))).click();;
    }
}
