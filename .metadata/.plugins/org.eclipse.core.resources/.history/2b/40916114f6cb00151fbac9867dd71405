package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rep_Overview {
	private static FirefoxDriver driver;
	private static String baseUrl= "http://appery.io/app/mobile-frame?src=http://appery.io/app/view/6e1b60d5-b6c2-4eba-809d-9ca98083d060&type=mobile";
	private boolean acceptNextAlert = true;

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
	driver.findElement(By.xpath("//div[@class='row no-margin info-container']/div[2]/div/div[1]/i")).click(); //click Reports icon
	driver.findElement(By.xpath("//div[@class='popover-backdrop active']/div/ion-popover-view/ion-content/div[1]/div/span[2]")).click(); //select Rep Products
	
	
	driver.findElement(By.xpath("//div[@class='row no-margin info-container']/div[2]/div/div[3]/div[1]/div[1]/div[1]/div[1]/span")).click(); // click Product sotring button
	driver.findElement(By.xpath("//div[@class='rep-list-table-header']/div[1]/div[2]/div/div/div[1]")).click(); // click LBD sotring button
	driver.findElement(By.xpath("//div[@class='rep-list-table-header']/div[1]/div[2]/div/div/div[2]")).click(); // click MTD sotring button
	driver.findElement(By.xpath("//div[@class='rep-list-table-header']/div[1]/div[2]/div/div/div[3]")).click(); // click QTD sotring button
	driver.findElement(By.xpath("//div[@class='rep-list-table-header']/div[1]/div[2]/div/div/div[4]")).click(); // click YTD sotring button
	
	
	List<WebElement> List =driver.findElements(By.xpath("/html/body/div[1]/ion-side-menus/ion-side-menu-content/div/div/ion-content/div/div[2]/div[2]/div/div[3]/div[2]/ion-scroll/div[1]/div[1]/div/div"));
	for(WebElement el : List) {
	 System.out.println(el.getText());
	 
	}
	
	
//	driver.findElement(By.xpath("//div[@class='rep-info-grid']/div[1]/div[3]/p")).click(); // нажимаем на меню
	
	/*	List<WebElement> Menu =driver.findElements(By.xpath("//div[@class='popover-backdrop active']/div/ion-popover-view"));
	for(WebElement me : Menu) {
	 System.out.println(me.getText());
	} // вывод списка меню
	
	//div[@class='rep-report-body-container no-padding']/ion-scroll/div[@class='scroll']//div[1] вывод всех строк Rep Products
	//div[@class='popover-backdrop active']/div/ion-popover-view - вывод первой строки Rep Products
	 * /html/body/div[1]/ion-side-menus/ion-side-menu-content/div/div/ion-content/div/div[2]/div[2]/div/div[3]/div[2]/ion-scroll/div[1]/div[1]/div/div - вывод первой строки Rep Products
	 */
/*	 // вывод строки Rep Products
	 
	/* 
	 
	 
	 //Rep Products one row is printed
	       
	/*String addr = driver.findElement(By.xpath("//div[@class='rep-list-grid']/div[2]/div/div/div[2]/ion-scroll/div[1]/div/div[@class='row item'][1]/div[3]/div/div[1]//span")).getText();
	System.out.println(addr);
	List<WebElement> AdrDit =driver.findElements(By.xpath("//div[@class='rep-list-grid']/div[2]/div/div/div[2]/ion-scroll/div[1]/div/div[@class='row item'][1]/div[3]/div/div[2]//span"));
	for(WebElement el : AdrDit) {
		 System.out.print(el.getText() + " ");
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