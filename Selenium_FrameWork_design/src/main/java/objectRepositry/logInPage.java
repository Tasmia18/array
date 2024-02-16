package objectRepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInPage {
	WebDriver driver;
   By username=By.name("username");
   By password=By.name("password");
   By logIn=By.name("signon");
   
   public logInPage(WebDriver driver)
   {
	   this.driver=driver;
   }
  
public void logIn_cardential(String user,String pass) {
	   driver.findElement(username).sendKeys(user);
	   driver.findElement(password).clear();
	   driver.findElement(password).sendKeys(pass);
	   driver.findElement(logIn).click();
	   
   }
}
