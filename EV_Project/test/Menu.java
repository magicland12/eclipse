package test;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import login_other.LoginPage;
import login_other.MainMenuSelect;

public class Menu {
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
	
	
	Wait(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source,new File("./ScreenShots/Menu/menu.png"));
	
	System.out.println("Screenshot captured!");
	
	
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[1]")).click();
	menu.MainMenu();
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[2]")).click(); //// select Rep List
	menu.MainMenu();
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[3]")).click(); // select Branchas List
	menu.MainMenu();
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[4]")).click(); // select Firm List
	menu.MainMenu();
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[5]")).click(); // select Fund Datf
	menu.MainMenu();
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[6]")).click(); // select Activities
	menu.MainMenu();
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[11]")).click(); // select eLibrary Media
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