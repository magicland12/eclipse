package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import login_other.ActivitySortSearchIcons;
import login_other.LoginPage;
//import login_other.MainMenuSelect;

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
		
		LoginPage login=new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		login.clickLoginButton();
		login.resize_frame();
		login.landscape_orientation();		
	
	
	
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