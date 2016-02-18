package test;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import login_other.LoginPage;



public class SearchWithinFirms {
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
	
	
	driver.findElement(By.xpath("//div[@class='col col-50 col-top']/label/input")).sendKeys("M" + Keys.ENTER);
	
	
	
	Wait(2000);
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[2]/div/button[3]")).click(); // click on Firms tab
	 
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[1]")).click(); //click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[1]")).click(); //click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[2]")).click();//click 2 nd sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[2]")).click();//click 2 nd sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[3]")).click();//click 3rd sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[3]")).click();///click 3rd sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[4]")).click();//click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[4]")).click();//click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[5]")).click();//click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[5]")).click();//click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[6]")).click();//click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[6]")).click();//click 1-st sorting tab
	driver.findElement(By.xpath("//div[@class='g-search-grid']/div[5]/div/div[1]/div/div[7]")).click();//click 1-st sorting tab
	
	Wait(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source,new File("./ScreenShots/SearchWithinFirms/searchwithinfirms.png"));
	
	System.out.println("Screenshot captured!");
	
	String firms = driver.findElement(By.xpath("//div[@class='row no-padding list-table-container']/div/div[2]/ion-scroll/div[1]/div[1]/div[1]")).getText(); // сохраняем первую строку Firms
	
	String text = driver.findElement(By.xpath("//div[@class='col g-search-tabs-container']")).getText(); // сохраняем Reps, Branches, Firms, Activities, Library
	//String branches = driver.findElement(By.xpath("//div[@class='scroll']/div[@class='my-list-item'][1]/div")).getText(); // сохраняем первую строку Branches 
	System.out.println(text + "\n"+"\n" + firms + "\n"+"\n"); //выводим все 3 поля в консоли
	
	
	String firm_searching_result = driver.findElement(By.xpath("//div[@class='row no-padding list-table-container']/div/div[2]/ion-scroll/div[1]/div[1]/div[1]/div[1]/span")).getText();
	
	Assert.assertEquals(firm_searching_result, "Morgan Stanley");
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
	