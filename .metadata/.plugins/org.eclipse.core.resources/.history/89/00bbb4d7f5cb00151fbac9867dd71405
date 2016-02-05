package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nearby_Reps {
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
	

	
	driver.findElement(By.xpath("//div[@class='list-table-body']/ion-scroll[@class='stretch-vertically scroll-view ionic-scroll']/div[1]/div/div[1]/div[1]")).click(); //click on Demon McNight
	Wait(2000);
	driver.findElement(By.xpath("//div[@class='row center-vertical-container']/div[3]/span")).click(); // нажимаем на Options
	
	Wait(2000);

	driver.findElement(By.xpath("//ion-popover-view/ion-content/div[1]/div/span[4]")).click(); // click Nearby Reps
	Wait(2000);
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[1]/div/span")).click(); // click on Name sorting column
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[2]/div/span")).click(); // click on Firm Name sorting column
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[3]/div/span")).click(); // click on Address,Phone sorting column
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[4]/div/span")).click(); // click on YTD Sales sorting column
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[5]/div/span")).click(); // click on Prior YR Sales sorting column
	Wait(2000);
	
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[1]/div[1]/div/i")).click();
	driver.findElement(By.xpath("//div[@class='list-table']/div[1]/div/div[2]/div[1]/label/input")).sendKeys("W" + Keys.ENTER);
	
	////ion-popover-view/ion-content/div[1]/div/span[4]
	
	String name = driver.findElement(By.xpath("//div[@class='list-table']/div[2]/ion-scroll/div[1]/div/div/div[1]/span")).getText(); // сохраняем Name
	String firmName = driver.findElement(By.xpath("//div[@class='list-table']/div[2]/ion-scroll/div[1]/div/div/div[2]/span")).getText(); // сохраняем первую строку Branches 
	
	String address = driver.findElement(By.xpath("//div[@class='list-table']/div[2]/ion-scroll/div[1]/div/div/div[3]//div/span")).getText(); //save Address
	String ytdSales = driver.findElement(By.xpath("//div[@class='list-table']/div[2]/ion-scroll/div[1]/div/div/div[4]/span")).getText(); // save YTD Sales
	String priorYRSales = driver.findElement(By.xpath("//div[@class='list-table']/div[2]/ion-scroll/div[1]/div/div/div[5]/span")).getText(); // save prior yr sales
	
	
//	String address = driver.findElement(By.xpath("//div[@class='col g-search-tabs-container']")).getText(); // сохраняем адрес
	System.out.println(name + "\n"+"\n" + firmName + "\n"+"\n" + address + "\n" + "\n" + ytdSales + "\n" + "\n" + priorYRSales ); //выводим все 3 поля в консоли
	
	
	
	
	
/*	List<WebElement> Menu =driver.findElements(By.xpath("//ion-popover-view/ion-content/div[1]/div/span"));
	for(WebElement me : Menu) {
	 System.out.println(me.getText());
	 
	} // вывод списка меню
	
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