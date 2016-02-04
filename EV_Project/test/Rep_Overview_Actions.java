package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rep_Overview_Actions {
	private static FirefoxDriver driver;
	private static String baseUrl= "http://appery.io/app/mobile-frame?src=http://appery.io/app/view/6e1b60d5-b6c2-4eba-809d-9ca98083d060&type=mobile";
	

	@BeforeClass
	public static void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	

	
	driver.findElement(By.xpath("//div[@class='list-table-body']/ion-scroll[@class='stretch-vertically scroll-view ionic-scroll']/div[1]/div/div[1]/div[1]")).click(); //click on Demon McNight
	Wait(2000);
	driver.findElement(By.xpath("//div[@class='row center-vertical-container']/div[3]/span")).click(); // нажимаем на Options
	
	
	
//	driver.findElement(By.xpath("//div[@class='popover-backdrop active']/div/ion-popover-view/ion-content/div[1]/div[@class='list']/span[4]")).click(); // click Nearby Reps
//	driver.findElement(By.xpath("//ion-header-bar[@class='bar bar-header disable-user-behavior']/div[1]/button[2]")).click(); // click back button
//	driver.findElement(By.xpath("//div[@class='rep-info-grid']/div[1]/div[3]/p")).click(); // нажимаем на меню
	
	
	//div[@class='rep-info-grid']/div[1]/div[3]/p
	//div[@class='rep-info-grid']/div[1]/div[3]/p
	//ion-header-bar[@class='bar bar-header disable-user-behavior']/div[1]/button[2] // back button
	//div[@class='popover-backdrop active']/div/ion-popover-view/ion-content/div[1]/div[@class='list']/span
	
	List<WebElement> Menu =driver.findElements(By.xpath("//ion-popover-view/ion-content/div[1]/div/span"));
		for(WebElement me : Menu) {
			System.out.println(me.getText());
	 
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