package login_other;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ActivitySortSearchIcons {
	
	WebDriver driver;
	
	//navigation icons
	By StartingTime=By.xpath("//div[@class='list-table-header']/div[1]/div[1]/span");
	By Priority=By.xpath("//div[@class='list-table-header']/div[1]/div[2]/span");
	By Subject=By.xpath("//div[@class='list-table-header']/div[1]/div[3]/span");
	By LOBs=By.xpath("//div[@class='list-table-header']/div[1]/div[4]/span");
	By Products=By.xpath("//div[@class='list-table-header']/div[1]/div[5]/span");
	By MeetingTopics=By.xpath("//div[@class='list-table-header']/div[1]/div[6]/span");
	
	//searching icons
	By StartTimeSearchIcon=By.xpath("//div[@class='list-table-header']/div[1]/div[1]/i");
	By SubjectSearchIcon=By.xpath("//div[@class='list-table-header']/div[1]/div[3]/i");
	By MeetingTopicsSearchIcon=By.xpath("//div[@class='list-table-header']/div[1]/div[6]/i");
	
	//searching inputs
	By StartTimeSearchInput=By.xpath("//div[@class='list-table-header']/div[2]/div[1]/label/input");
	By SubjectSearchInput=By.xpath("//div[@class='list-table-header']/div[2]/div[1]/label/input");
	By MeetingTopicsSearchInput=By.xpath("//div[@class='list-table-header']/div[2]/div[1]/label/input");
	
	
	//close searching input icon
	By CloseSearchField=By.xpath("//div[@class='list-table-header']/div[2]/div[2]/i");
	
	public ActivitySortSearchIcons(WebDriver driver)
	{
		this.driver=driver;
	}
	
		public void clickStartingTime()
			{
			driver.findElement(StartingTime).click();
			}
		public void clickPriority()
			{
			driver.findElement(Priority).click();
			}
		public void clickSubject()
			{
			driver.findElement(Subject).click();
			}
		public void clickLOBs()
			{
			driver.findElement(LOBs).click();
			}
		public void clickProducts()
			{
			driver.findElement(Products).click();
			}
		public void clickMeetingTopics()
			{
			driver.findElement(MeetingTopics).click();
			}
///////Navigation Icons -> End
	// Searching Begins
	
		public void clickStartTimeSearchIcon()
			{
			driver.findElement(StartTimeSearchIcon).click();
			}
		public void setkStartTimeSearchInput()
			{
			driver.findElement(StartTimeSearchInput).sendKeys("En" + Keys.ENTER);
			}
			
		
		public void clickSubjectSearchIcon()
			{
			driver.findElement(SubjectSearchIcon).click();
			}
		public void setSubjectSearchInput()
			{
			driver.findElement(SubjectSearchInput).sendKeys("Keegan" + Keys.ENTER);
			}
		
		
		public void clickMeetingTopicsSearchIcon()
			{
			driver.findElement(MeetingTopicsSearchIcon).click();
			}
		public void setkMeetingTopicsSearchInput()
			{
			driver.findElement(MeetingTopicsSearchInput).sendKeys("meeting" + Keys.ENTER);
			}
	/////Close Search Icon
	
		public void clickCloseSearchField()
			{
			driver.findElement(CloseSearchField).click();
			}
}
