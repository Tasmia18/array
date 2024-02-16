package POM_JpetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class user_Info {
	WebDriver driver;
	 By userId=By.name("username");
	 By newPassword=By.name("password");
	 By repeatPassword=By.name("repeatedPassword");
	 
	 public user_Info(WebDriver driver)
	 {
		this.driver=driver;
	 }
	 public void accountData(String iuser,String npass,String rpass)
	 {
		 driver.findElement(userId).sendKeys(iuser);
		 driver.findElement(newPassword).sendKeys(npass);
		 driver.findElement(repeatPassword).sendKeys(rpass);
	 }
	}

