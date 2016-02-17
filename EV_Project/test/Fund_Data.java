package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import login_other.LoginPage;
import login_other.MainMenuSelect;

public class Fund_Data {
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
	//Wait(2000);
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[5]")).click(); //click Fund Data
	Wait(2000);
	
	String fund_list = driver.findElement(By.xpath("//div[@class='row no-padding no-margin rrrow']/div/span")).getText(); //find the location of Find List element.
	Assert.assertEquals(fund_list, "Fund List"); // check This Week text presenting 
	
	String fund = driver.findElement(By.xpath("//div[@class='item my-list-highlited-item']/div/div[1]/span")).getText();
	
	driver.findElement(By.xpath("//div[@class='button-bar']/button[3]")).click(); //click Managers tab
	driver.findElement(By.xpath("//div[@class='fund-data-managers']/ion-scroll/div[1]/div[1]/div/div[3]")).click(); //click arrow in front of the 1-st manager fir expanding
	
	String manager = driver.findElement(By.xpath("//div[@class='fund-data-managers']/ion-scroll/div[1]/div[1]/div/div[2]/div")).getText(); //save manager's information
	
	
	
	  
	 System.out.println( fund_list + "\n" + fund + "\n" + manager);
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