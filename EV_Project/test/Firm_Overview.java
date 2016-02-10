package test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firm_Overview {
	private static FirefoxDriver driver;
	private static String baseUrl= "http://appery.io/app/mobile-frame?src=http://appery.io/app/view/6e1b60d5-b6c2-4eba-809d-9ca98083d060&type=mobile";
	//private static String baseUrl= "https://idp.appery.io/idp/";
	

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		
	driver.findElement(By.xpath("//form [@id='login_form']/div[1]//input")).sendKeys("amazur@exadel.com");
	driver.findElement(By.xpath("//form [@id='login_form']/div[2]//input")).sendKeys("lavandos");	
	driver.findElement(By.xpath("//input[@id='loginBtn']")).click();	
	driver.findElement(By.xpath("//div[@id='mobile_sizes']/div[3]")).click();
	driver.findElement(By.xpath("//div[@id='switch_to_landscape']")).click();
	
	
	
	driver.switchTo().frame("frame_viewport");
	driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click();
	//menu is opened
	//Wait(2000);
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[4]")).click();
	Wait(2000);


	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[1]")).click(); //-- click on Firm Name sorting icon
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[2]")).click();//-- click on 
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[3]")).click();//-- click on 
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[4]")).click();//-- click on Y
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[5]")).click();//-- click on 
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[6]")).click(); //click on
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[7]")).click(); //-- click on 
	
	
	
	
	 List<WebElement> List =driver.findElements(By.xpath("//ion-scroll[@class='scroll-view ionic-scroll']/div[1]")); //Name, FirmName, YTD Sales, PriorYRSales
	 for(WebElement el : List) {
	  System.out.print(el.getText()+ " ");
	  }
	  
/*	  Wait(2000);
	  String addr = driver.findElement(By.xpath("//div[@class='rep-list-table-body']/ion-scroll/div[1]/div/div[1]/div[3]/div/div[1]/div/span")).getText(); //Address, upper row
	  System.out.print(addr);
	  
	  List<WebElement> AdrDit =driver.findElements(By.xpath("//div[@class='rep-list-table-body']/ion-scroll/div[1]/div/div[1]/div[3]/div/div[2]/div/span[@class='rep-details rep-phone-prefix ng-binding']/span[2]")); //Address, lower row
	  for(WebElement el : AdrDit) {
	   System.out.print(el.getText() + " ");
	   HELLO!
	         }
*/	
	}

	
	public void Wait(int time){
		   try {
		    Thread.sleep(time);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		 }
		 
}