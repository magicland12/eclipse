package test;



import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import login_other.LoginPage;
import login_other.MainMenuSelect;
import login_other.WaitForElementPresent;

public class Share_Doc {
	private static FirefoxDriver driver;
	private static String baseUrl= "http://appery.io/app/mobile-frame?src=http://appery.io/app/view/6e1b60d5-b6c2-4eba-809d-9ca98083d060&type=mobile";
	

	@BeforeClass
	public static void setUp() throws Exception {
	
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		
		LoginPage login=new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		login.clickLoginButton();
		login.resize_frame();
		login.landscape_orientation();		

	driver.switchTo().frame("frame_viewport");
	MainMenuSelect menu=new MainMenuSelect(driver);
	
	
	menu.MainMenu();
	//menu is opened
	
	
	Wait(2000);
	
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[7]")).click();
	Wait(2000);
	
	driver.findElement(By.xpath("//div[@class='row no-padding library']/div[2]/div/ion-scroll/div[1]/div[2]/div[1]/div[1]/div[3]/div/div[1]/div")).click(); //click on 2-nd row in the list of docs
	Wait(2000); // Doc is opened
	
	
	driver.switchTo().defaultContent();
	
	  ((JavascriptExecutor)driver).executeScript("scroll(400,0)");
	
	  driver.switchTo().frame("frame_viewport");
	  driver.findElement(By.xpath("//ion-side-menu-content/ion-header-bar/div[1]/button[3]")).click(); // click Share icon
		// Share Doc page is opened
	
	driver.findElement(By.xpath("//div[@class='col send-doc-email-wrap']/div[1]/div[1]/div[2]/div/input")).click(); //click on input
	driver.findElement(By.xpath("//body/div[3]/div[1]/label/input")).sendKeys("Maz" + Keys.ENTER);
	

	
	driver.findElement(By.xpath("//*[contains(text(), 'Maz')]")).click(); // find record with text Maz and click on it
	
	driver.findElement(By.xpath("//body/div[3]/div/button")).click(); //click button 'Done'
	Wait(2000);
	
	driver.findElement(By.xpath("//*[contains(text(), 'Add/remove Documents')]")).click();
	driver.findElement(By.xpath("//body/div[4]/div[1]/label/input")).sendKeys("Accessing" + Keys.ENTER);
	driver.findElement(By.xpath("//*[contains(text(), 'Accessing')]")).click();
	Wait(2000);
	driver.findElement(By.xpath("//body/div[4]/div/button")).click(); //click button 'Done'
	
	driver.findElement(By.xpath("//div[@class='col send-doc-email-wrap']/div[1]/div[5]/div/label/input")).sendKeys("Test Share Doc e-mail");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source,new File("./ScreenShots/ShareDoc/BeforeSending.png"));
	
	driver.findElement(By.xpath("//button[@class='email-button button button-positive button-inline button-clear'][1]")).click(); //click Send button
	
	driver.quit();

	}
	

	public void Wait(int time){
		   try {
		    Thread.sleep(time);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		    }
	
		 
}