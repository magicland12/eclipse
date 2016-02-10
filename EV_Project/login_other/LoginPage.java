package login_other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	WebDriver driver;

	By username=By.xpath("//form [@id='login_form']/div[1]//input");
	By password=By.xpath("//form [@id='login_form']/div[2]//input");
	By loginbutton=By.xpath("//input[@id='loginBtn']");
	By resize_frame=By.xpath("//div[@id='mobile_sizes']/div[3]");
	By lanscape_orientation=By.xpath("//div[@id='switch_to_landscape']");

	

	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("amazur@exadel.com");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("lavandos");
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginbutton).click();
	}
	
	public void resize_frame()
	{
		driver.findElement(resize_frame).click();
	}
	
	public void landscape_orientation()
	{
		driver.findElement(lanscape_orientation).click();
	}
	

	
}


