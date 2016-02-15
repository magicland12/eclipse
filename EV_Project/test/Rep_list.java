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

public class Rep_list {
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
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[1]")).click();
	driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click();

	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[2]")).click(); //вывод текста


	driver.findElement(By.xpath("//div[@class='rep-list-grid']/div[2]/div/div/div[1]/div/div[1]/div[1]")).click(); //-- click on Name sorting icon
	driver.findElement(By.xpath("//div[@class='rep-list-grid']/div[2]/div/div/div[1]/div/div[1]/div[2]")).click();//-- click on Firm Name sorting icon
	driver.findElement(By.xpath("//div[@class='rep-list-grid']/div[2]/div/div/div[1]/div/div[1]/div[3]")).click();//-- click on Address,Phone Name sorting icon
	driver.findElement(By.xpath("//div[@class='rep-list-grid']/div[2]/div/div/div[1]/div/div[1]/div[4]")).click();//-- click on YTD Sales sorting icon
	driver.findElement(By.xpath("//div[@class='rep-list-grid']/div[2]/div/div/div[1]/div/div[1]/div[5]")).click();//-- click on Prior YR Sales sorting icon
	
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[1]/div/i")).click(); // click Name search icon
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[2]/div[1]/label/input")).sendKeys("Damon" + Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='list-table-body search-opened']/ion-scroll/div[1]/div/div[1]/div[1]")).click(); //click on Demon McNight
	driver.findElement(By.xpath("//ion-header-bar[@class='bar bar-header disable-user-behavior']/div[1]/button[2]")).click(); //back button
	//div[@class='list-table-body search-opened']/ion-scroll/div[1]/div/div[1]/div[1]
	Wait(2000);
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[2]/div/i")).click(); // click Firm Name search icon
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[2]/div[1]/label/input")).sendKeys("Susp" + Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='list-table-body search-opened']/ion-scroll/div[1]/div/div[1]/div[1]")).click(); //click on Demon McNight
	driver.findElement(By.xpath("//ion-header-bar[@class='bar bar-header disable-user-behavior']/div[1]/button[2]")).click(); //back button
	Wait(2000);
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[3]/div/i")).click(); // click Address,Phone search icon
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[2]/div[1]/label/input")).sendKeys("222");
	driver.findElement(By.xpath("//div[@class='list-table-body search-opened']/ion-scroll/div[1]/div/div[1]/div[1]")).click(); //click on Demon McNight
	driver.findElement(By.xpath("//ion-header-bar[@class='bar bar-header disable-user-behavior']/div[1]/button[2]")).click(); //back button
	
	
	
	
	
	
	//ion-header-bar[@class='bar bar-header disable-user-behavior']/div[1]/button[2] -BackButton
	//div[@class='list-table']/div[1]/div/div[1]/div[1]/div/i
	//div[@class='list-table']/div[1]/div/div[2]/div[1]/label/input
	
	 List<WebElement> List =driver.findElements(By.xpath("//div[@class='list-table-body search-closed']/ion-scroll/div[1]/div/div[1]")); //Name, FirmName, YTD Sales, PriorYRSales
	 for(WebElement el : List) {
	  System.out.print(el.getText()+ " ");
	  }
	  
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