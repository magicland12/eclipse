package test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dashboard {
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
	
	Wait(2000);
/*	boolean title = driver.getTitle().equals("Mobile Preview");
		if(title)
			System.out.println("I am working correctly");
		else if(!title)
			System.out.println("I am broken!");
	*/	
	
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[2]/div[1]/div/div[1]/div/div/div/span")).getText().contains("Goal Groups");
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[1]/div/div[1]/div/div/div/span")).getText().contains("Key Indicators");
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[2]/div[2]/div/div[1]/div/div/div[1]/span")).getText().contains("Activities");
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/span[1]")).getText().contains("Reports:");

	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[2]/div/div[1]/div/div/div[3]/span")).click(); //click on SortBy
	
	driver.findElement(By.xpath("//ion-content[@class='scroll-content ionic-scroll']/div[1]/div/span[1]")).click(); //select Dollar icon
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[2]/div/div[1]/div/div/div[3]/span")).click(); //click on SortBy

	driver.findElement(By.xpath("//ion-content[@class='scroll-content ionic-scroll']/div[1]/div/span[2]")).click(); //select Rep Name icon
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[2]/div/div[1]/div/div/div[3]/span")).click(); //click on SortBy

	driver.findElement(By.xpath("//ion-content[@class='scroll-content ionic-scroll']/div[1]/div/span[3]")).click(); //select Firm Name icon
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[2]/div/div[1]/div/div/div[3]/span")).click(); //click on SortBy
	Wait(2000);
	driver.findElement(By.xpath("//ion-content[@class='scroll-content ionic-scroll']/div[1]/div/span[4]")).click(); //select Fund Name icon
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[2]/div/div[1]/div/div/div[3]/span")).click(); //click on SortBy

	driver.findElement(By.xpath("//ion-content[@class='scroll-content ionic-scroll']/div[1]/div/span[5]")).click(); //select City icon
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[3]/div[2]/div/div[1]/div/div/div[3]/span")).click(); //click on SortBy
	
	List<WebElement> SortBy =driver.findElements(By.xpath("//ion-content[@class='scroll-content ionic-scroll']/div[1]/div/span")); //The list of Sort By
	for(WebElement el : SortBy) {
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