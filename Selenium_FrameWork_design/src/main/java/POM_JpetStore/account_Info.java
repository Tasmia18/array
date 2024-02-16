package POM_JpetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class account_Info {
	WebDriver driver;
	 By firstName=By.name("account.firstName");
	 By lastName=By.name("account.lastName");
	 By Email=By.name("account.email");
	 By phone=By.name("account.phone");
	 By address1=By.name("account.address1");
	 By city=By.name("account.city");
	 By state=By.name("account.state");
	 By zip=By.name("account.zip");
	 By country=By.name("account.country");
	 
	 public account_Info(WebDriver driver)
	 {
		this.driver=driver;
	 }
	 public void profileData(String f1,String l1,String E1,String p1,String add1,String c1,String st,String zi,String coun)
	 {
		 driver.findElement(firstName).sendKeys(f1);
		 driver.findElement(lastName).sendKeys(l1);
		 driver.findElement(Email).sendKeys(E1);
		 driver.findElement(phone).sendKeys(p1);
		 driver.findElement(address1).sendKeys(add1);
		 driver.findElement(city).sendKeys(c1);
		 driver.findElement(state).sendKeys(st);
		 driver.findElement(zip).sendKeys(zi);
		 driver.findElement(country).sendKeys(coun);
	 }
	}

