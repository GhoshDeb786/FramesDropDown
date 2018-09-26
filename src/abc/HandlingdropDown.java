package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingdropDown {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Select dropDown = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		dropDown.selectByIndex(12);
		
		WebElement button  = driver.findElement(By.xpath(".//*[@id='year']"));
		
		boolean status = button.isDisplayed();
		System.out.println(status);
	    System.out.println(button.isEnabled());
	    
	    List<WebElement> e = dropDown.getOptions();
		int itemscount = e.size();
		System.out.println(itemscount);
		
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		month.selectByVisibleText("Nov");
		
		List<WebElement> display = month.getOptions();
		int displayitems = display.size();
		System.out.println(displayitems);
		
		
		//dropDown.selectByVisibleText("Nov");
		
		
		
		/*List<WebElement> emonth = month.getOptions();
		int monthcount = e.size();
		System.out.println(monthcount);*/
		
		Thread.sleep(2000);
		driver.close();

	}

}