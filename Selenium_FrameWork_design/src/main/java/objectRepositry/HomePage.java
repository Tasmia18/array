package objectRepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;
 By sign_On=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
 
 public HomePage(WebDriver driver)
 {
	this.driver=driver;
 }
 public void signIn()
 {
	 driver.findElement(sign_On).click();
 }
}
