package pageclasses;

import org.openqa.selenium.By;

import parent.BaseTest;
import utils.Utility;

public class LoginPage extends BaseTest {
	
	By email=By.xpath("//input[@id='email']");
	By password= By.xpath("//input[@id='password']");
	By signin = By.xpath("//input[@type='submit']");
	
	
	public void Login()
	{
		driver.findElement(email).sendKeys(Utility.username);
		driver.findElement(password).sendKeys(Utility.password);
		driver.findElement(signin).click();
		
	}

}
