package test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import login_other.LoginPage;
import login_other.MainMenuSelect;
import org.junit.Assert;

public class Firm_Overview {
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
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[4]")).click();
	Wait(2000);
	
	driver.findElement(By.xpath("//div[@class='list-table-body search-closed']/ion-scroll/div[1]/div[1]/div/div[1]")).click(); //click on the first line 
	//Firm Overview page is opened.
	////div[@class='row no-padding no-margin']/div[1]/div[1]/div first block with Firm Name
	
	
	String firm_reps = driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[1]/div/span")).getText(); //check whether it's really Firm Reps or not
	Assert.assertEquals(firm_reps, "Firm Reps"); // check Firm Reps text presenting 
	
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/span")).click(); //click Name sorting Icon
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/span")).click(); //click YTD Sales sorting Icon
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[3]/span")).click(); //click Name sorting Icon
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[4]/span")).click(); //click Name sorting Icon
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[4]/span")).click(); //click Name sorting Icon

	
	
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/i")).click(); //click Name searching Icon
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/label/input")).sendKeys("J" + Keys.ENTER );
	String found_name = driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[2]/ion-scroll/div[1]/div/div/div[1]/span")).getText(); //save Found Name
	
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/i")).click(); //close searhing field
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[5]/i")).click(); //click 'Phone'searching icon
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/label/input")).sendKeys("9547" + Keys.ENTER );
	String found_phone = driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[1]/div[2]/div/div[2]/div/div/div[2]/ion-scroll/div[1]/div/div/div[5]/span")).getText(); //save Found Name

	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/span")).click();//click Portfolio
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/span")).click(); //click LBD
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[1]/div[3]/span")).click(); //click MTD
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[1]/div[4]/span")).click(); //click QTD
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[1]/div[5]/span")).click(); //click YTD
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[1]/div[6]/span")).click(); //last
	
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/i")).click();
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[2]/div[1]/label/input")).sendKeys("Boston" + Keys.ENTER);
	String portfolio = driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[2]/div/div/div[2]/div/div/div[2]/ion-scroll/div[1]/div/div/div[1]/span")).getText(); //save found Portfolio %Boston%
	driver.findElement(By.xpath("//div[@class='col section firm-info-right-section']/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/i")).click(); //close searching field
	
	
	driver.findElement(By.xpath("//div[@class='row no-padding no-margin']/div[2]/div/div/div[1]/div/i")).click(); //click Reports ICON
	
	String selected_firm = driver.findElement(By.xpath("//div[@class='col section firm-info-left-section']/div[1]/div/div[1]/div/span")).getText();
	
	Assert.assertEquals(selected_firm, "Ameriprise Financial Services");
	
	
	List<WebElement> list =driver.findElements(By.xpath("//div[@class='col section firm-info-left-section']/div[1]/div/div")); //Name, FirmName, YTD Sales, PriorYRSales
	
	for(WebElement el : list) {
	  System.out.print(el.getText() + "\n\n");
	 	}
	 System.out.println(found_name + "\n" + found_phone + "\n" + portfolio );
	
	

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