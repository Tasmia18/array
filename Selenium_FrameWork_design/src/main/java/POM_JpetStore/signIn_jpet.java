package POM_JpetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signIn_jpet {
	WebDriver driver;
	By registration=By.xpath("//*[@id=\"Catalog\"]/a");
	public signIn_jpet(WebDriver driver) {
		this.driver=driver;
	}
	public void register()
	{
		   driver.findElement(registration).click();
	
	}
}
