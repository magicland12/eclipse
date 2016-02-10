package test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import login_other.ActivitySortSearchIcons;
import login_other.LoginPage;
import login_other.MainMenuSelect;

public class Activities {
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
	ActivitySortSearchIcons navisearch=new ActivitySortSearchIcons(driver);
	//Wait(2000);
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[6]")).click(); // activities page is opened
	
	navisearch.clickStartingTime();
	navisearch.clickStartingTime();
	navisearch.clickPriority();
	navisearch.clickPriority();
	navisearch.clickSubject();
	navisearch.clickSubject();
	navisearch.clickLOBs();
	navisearch.clickLOBs();
	navisearch.clickProducts();
	navisearch.clickProducts();
	navisearch.clickMeetingTopics();
	Wait(2000);
	navisearch.clickStartTimeSearchIcon();
	navisearch.setkStartTimeSearchInput();
	navisearch.clickCloseSearchField();
	navisearch.clickSubjectSearchIcon();
	navisearch.setSubjectSearchInput();
	navisearch.clickCloseSearchField();
	navisearch.clickMeetingTopicsSearchIcon();
	navisearch.setkMeetingTopicsSearchInput();
	navisearch.clickCloseSearchField();

	
	driver.findElement(By.xpath("//div[@class='col center-vertical-container list-table-title']/i")).click(); //click on List icon
	driver.findElement(By.xpath("//body/div[3]/div/ion-popover-view/ion-content/div[1]/div/span[3]")).click(); // select This Week
	
	navisearch.clickStartingTime();
	navisearch.clickStartingTime();
	navisearch.clickPriority();
	navisearch.clickPriority();
	navisearch.clickSubject();
	navisearch.clickSubject();
	navisearch.clickLOBs();
	navisearch.clickLOBs();
	navisearch.clickProducts();
	navisearch.clickProducts();
	navisearch.clickMeetingTopics();
	
	Wait(2000);
	navisearch.clickStartTimeSearchIcon();
	navisearch.setkStartTimeSearchInput();
	navisearch.clickCloseSearchField();
	navisearch.clickSubjectSearchIcon();
	navisearch.setSubjectSearchInput();
	navisearch.clickCloseSearchField();
	navisearch.clickMeetingTopicsSearchIcon();
	navisearch.setkMeetingTopicsSearchInput();
	navisearch.clickCloseSearchField();
	
	
	driver.findElement(By.xpath("//div[@class='col center-vertical-container list-table-title']/i")).click(); //click on List icon
	driver.findElement(By.xpath("//body/div[3]/div/ion-popover-view/ion-content/div[1]/div/span[4]")).click(); // Today
	
	navisearch.clickStartingTime();
	navisearch.clickStartingTime();
	navisearch.clickPriority();
	navisearch.clickPriority();
	navisearch.clickSubject();
	navisearch.clickSubject();
	navisearch.clickLOBs();
	navisearch.clickLOBs();
	navisearch.clickProducts();
	navisearch.clickProducts();
	navisearch.clickMeetingTopics();
	
	Wait(2000);
	navisearch.clickStartTimeSearchIcon();
	navisearch.setkStartTimeSearchInput();
	navisearch.clickCloseSearchField();
	navisearch.clickSubjectSearchIcon();
	navisearch.setSubjectSearchInput();
	navisearch.clickCloseSearchField();
	navisearch.clickMeetingTopicsSearchIcon();
	navisearch.setkMeetingTopicsSearchInput();
	navisearch.clickCloseSearchField();
	Wait(2000);
	
	driver.findElement(By.xpath("//div[@class='col center-vertical-container list-table-title']/i")).click(); //click on List icon
	List<WebElement> List =driver.findElements(By.xpath("//body/div[4]/div/ion-popover-view/ion-content/div[1]/div/span")); //All elements on List.
	
	for(WebElement el : List) {
	  System.out.print(el.getText()+ " ");
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