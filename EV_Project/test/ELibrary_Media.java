package test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ELibrary_Media {
	private static FirefoxDriver driver;
	private static String baseUrl= "http://appery.io/app/mobile-frame?src=http://appery.io/app/view/6e1b60d5-b6c2-4eba-809d-9ca98083d060&type=mobile";
	

	@BeforeClass
	public static void setUp() throws Exception {
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[1]")).click();
	driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click(); // select menu

	
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[11]")).click(); // select eLibrary Media
	Wait(2000);
	
	driver.findElement(By.xpath("//div[@class='no-margin']/ion-scroll[@class='scroll-view ionic-scroll']/div/div[2]/div[1]")).click();
	driver.findElement(By.xpath("//div[@class='no-margin']/ion-scroll[@class='scroll-view ionic-scroll']/div/div[2]/div[2]")).click();
	driver.findElement(By.xpath("//div[@class='no-margin']/ion-scroll[@class='scroll-view ionic-scroll']/div/div[2]/div[3]")).click();
	driver.findElement(By.xpath("//div[@class='no-margin']/ion-scroll[@class='scroll-view ionic-scroll']/div/div[2]/div[4]")).click();
	driver.findElement(By.xpath("//div[@class='no-margin']/ion-scroll[@class='scroll-view ionic-scroll']/div/div[2]/div[5]")).click();
	
	Wait(2000);

	
		String fav =driver.findElement(By.xpath("//div[@class='no-margin']/ion-scroll[@class='scroll-view ionic-scroll']/div/div[1]/div")).getText(); 
		System.out.println(fav);
	 
	 
		List<WebElement> Other =driver.findElements(By.xpath("//div[@class='no-margin']/ion-scroll[@class='scroll-view ionic-scroll']/div/div[2]/div")); //Address, lower row
		for(WebElement el : Other) {
		System.out.print(el.getText() + " ");
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