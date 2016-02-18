package captureScreenshot;

import org.openqa.selenium.firefox.FirefoxDriver;
public class FacebookScreenshot {
	
	public void captureScreenshot(){
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}

}
