package login_other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenuSelect {
	
	WebDriver driver;
	
	By main_menu_icon=By.xpath("//ion-header-bar/div[1]/button[1]");

	public MainMenuSelect(WebDriver driver)
	{
		this.driver=driver;
	}
	public void MainMenu()
	{
		driver.findElement(main_menu_icon).click();
	}
	
	
	
	
	

}
