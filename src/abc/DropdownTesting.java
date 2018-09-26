package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		//driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		//Select dropdown = new Select(driver.findElement(By.id("continents")));
		
		driver.get("https://www.facebook.com/");
		
	    Select object = new Select(driver.findElement(By.id("month")));
		
		//Returning Month
		
	    List <WebElement> count = object.getOptions();
	    
	    //int count_value = count.size();
	    System.out.println(count.size());
	    
	    
	    //Enhanced For loop
	    for(WebElement temp : count) {
	    	String month_name = temp.getText();
	    	System.out.print(month_name +" ");
	    }
	    
	    	
	    	
	    }
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//Selecting Date
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("13");
		Thread.sleep(2000);
		
		//Selecting Month
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("5");
		Thread.sleep(2000);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2017");
		Thread.sleep(2000);*/
		
	
		
		//can be selected if we want to select the option directly
		//dropdown.selectByVisibleText("North America");
		
		//Can be selected if we want to select the dropdown menu based on Index
		//dropdown.selectByIndex(3);
		
	
		
		
		// Can be selected only if there is a value given in the select tag
		//dropdown.selectByValue("Asia"); 
		
		/*List <WebElement> daycount = date.getOptions();	
		System.out.println("Month Count :" + daycount.size());
		
		List <WebElement> monthcount = month.getOptions();	
		System.out.println("Month Count : " + monthcount.size());
		
		List <WebElement> yearcount = year.getOptions();	
		System.out.println("Year Count : " + yearcount.size());
		*/
		
		/*int dropdownsize = count.size();
		
		for(int i=0; i<= dropdownsize; i++) {
			
			String value = count.get(i).getText();
			System.out.println(value);*/
		}
		
		//Thread.sleep(2000);
		
		