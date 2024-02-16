package POM_JpetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	WebDriver driver;
	   By signIn=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	   

	 public LogIn(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	  
	public void logIn_Info() {
		   driver.findElement(signIn).click();
		      
	   }
}
