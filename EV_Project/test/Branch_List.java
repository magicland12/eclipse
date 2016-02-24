package test;

import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import login_other.LoginPage;
import login_other.MainMenuSelect;

public class Branch_List {
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
	
	driver.findElement(By.xpath("//ion-side-menu/div/ion-scroll/div[1]/div/a[3]")).click(); //branch_list is opened
	
	Wait(1000);
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[1]/span")).click(); //click on Firm Name
	/*driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[2]/span")).click(); //click on City
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[3]/span")).click(); //click on State
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[4]/span")).click(); //click on Address,Phone
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[5]/span")).click(); //click on YTD Sales
	Wait(1000);
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[6]/span")).click(); //click on Prior YR Sales
	

	
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[1]/i")).click(); //click on First Name searching icon
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[2]/div[1]/label/input")).sendKeys("Morgan" + Keys.ENTER); // set
	//String firmname = driver.findElement(By.xpath("//ion-content/div/div[3]/div/div/div[2]/ion-scroll/div[1]/div[1]/div[1]/div[1]/span")).getText();
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[2]/div[2]/i")).click(); //close search field
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[1]/div[2]/i")).click();
	
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[2]/div[1]/label/input")).sendKeys("Ki" + Keys.ENTER);
	
	String city = driver.findElement(By.xpath("//ion-scroll/div[1]/div/div/div[2]/span")).getText(); //записали в память Город
	driver.findElement(By.xpath("//div[@class='list-table-header']/div[2]/div[2]/i")).click(); // close search field.
	
	System.out.println(firmname + " " + city);
	driver.quit();
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