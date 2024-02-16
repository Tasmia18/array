package POM_JpetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class profile_Information {
WebDriver driver;
By language=By.name("account.languagePreference");
By Category=By.name("account.favouriteCategoryId");
By enable_list=By.name("account.listOption");
By enable_mybanner=By.name("account.bannerOption");


public profile_Information(WebDriver driver)
{
	this.driver=driver;
}
public void profileInfo() throws InterruptedException
{
	
	WebElement e1=driver.findElement(By.name("account.languagePreference"));
	Select s=new Select(e1);
	s.selectByVisibleText("english");
	
	
	 WebElement cg= driver.findElement(By.name("account.favouriteCategoryId"));
	 Select se=new Select(cg);
		se.selectByVisibleText("CATS");
		
		
	 driver.findElement(enable_list).click();
	 driver.findElement(enable_mybanner).click();
}
}