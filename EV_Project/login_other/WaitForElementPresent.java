
package login_other;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementPresent {
	
	WebDriver driver;

public void waitForElementPresent(final WebElement in_element, int timeout){ 
    WebDriverWait wait = (WebDriverWait)new WebDriverWait(driver,timeout)
                    .ignoring(StaleElementReferenceException.class); 
    wait.until(new ExpectedCondition<Boolean>(){ 
      public Boolean apply(WebDriver webDriver) { 
        WebElement element = in_element;
        return element != null && element.isDisplayed(); 
        } 
    }); 
 }
}