package POM_JpetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class saveInformation {
WebDriver driver;
By saveFile=By.name("newAccount");
public saveInformation(WebDriver driver)
{
	this.driver=driver;
}
public void save_Info() {
	driver.findElement(saveFile).click();
}
	
}
