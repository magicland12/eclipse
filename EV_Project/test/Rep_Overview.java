package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rep_Overview {
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
		
	driver.findElement(By.xpath("//form [@id='login_form']/div[1]//input")).sendKeys("amazur@exadel.com");
	driver.findElement(By.xpath("//form [@id='login_form']/div[2]//input")).sendKeys("lavandos");	
	driver.findElement(By.xpath("//input[@id='loginBtn']")).click();	
	driver.findElement(By.xpath("//div[@id='switch_to_landscape']")).click();
	driver.findElement(By.xpath("//div[@id='mobile_sizes']/div[3]")).click();
	
	
	driver.switchTo().frame("frame_viewport");
	driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click();
//menu is opened
Wait(2000);
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[1]")).click();
	driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click();

	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[2]")).click();
//rep_list is opened
	

	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[1]/div/i")).click(); // click Name search icon
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[2]/div[1]/label/input")).sendKeys("Damon" + Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='list-table-body search-opened']/ion-scroll/div[1]/div/div[1]/div[1]")).click(); //click on Demon McNight
	Wait(2000);
	driver.findElement(By.xpath("//div[@class='row no-margin info-container']/div[2]/div/div[1]/i")).click(); //click Reports icon
	
	
	// check that Rep Products is available on Reports
	//String reports = driver.findElement(By.xpath("//ion-popover-view[@class='popover none ng-enter active ng-enter-active']/ion-content/div[1]/div/span[2]")).getText(); //check whether it's really Firm Reps or not
	//Assert.assertEquals(reports, "Rep Products"); // check Firm Reps text presenting 
	
	driver.findElement(By.xpath("//ion-popover-view/ion-content/div[1]/div[1]/span[2]")).click(); //select Rep Products
	Wait(5000);

	
	List<WebElement> List =driver.findElements(By.xpath("//ion-popover-view/ion-content/div[1]/div[1]"));
	for(WebElement el : List) {
	 System.out.println(el.getText());
	 driver.quit();
	}
	

	}
	public void Wait(int time){
		   try {
		    Thread.sleep(time);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		 }
}