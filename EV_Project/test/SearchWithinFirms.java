package test;


import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SearchWithinFirms {
	private static FirefoxDriver driver;
	private static String baseUrl= "http://appery.io/app/mobile-frame?src=http://appery.io/app/view/6e1b60d5-b6c2-4eba-809d-9ca98083d060&type=mobile";
	//private static String baseUrl= "https://idp.appery.io/idp/";
	

	@BeforeClass
	public static void setUp() throws Exception {
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
	String firms = driver.findElement(By.xpath("//div[@class='row no-padding list-table-container']/div/div[2]/ion-scroll/div[1]/div[1]/div[1]")).getText(); // сохраняем первую строку Firms
	
	String text = driver.findElement(By.xpath("//div[@class='col g-search-tabs-container']")).getText(); // сохраняем Reps, Branches, Firms, Activities, Library
	//String branches = driver.findElement(By.xpath("//div[@class='scroll']/div[@class='my-list-item'][1]/div")).getText(); // сохраняем первую строку Branches 
	System.out.println(text + "\n"+"\n" + firms + "\n"+"\n"); //выводим все 3 поля в консоли
	
	}
	 
	public void Wait(int time){
		   try {
		    Thread.sleep(time);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		 }
	
}
	