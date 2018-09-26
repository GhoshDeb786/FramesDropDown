package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseOver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.carmax.com/");
		
		//Create Action builder instance by passing WebDriver instance 
		
		Actions builder = new Actions(driver);// Create instance in Actions(Built in-class)by passing driver instance to the class
		//Here we have created Two Instances 'driver' & 'builder'
		
		WebElement menuElement = driver.findElement(By.xpath("html/body/div[1]/header/div/nav[2]/ul/li[2]/a"));
		System.out.println(driver.findElement(By.xpath("html/body/div[1]/header/div/nav[2]/ul/li[2]/a")).getText());
		builder.moveToElement(menuElement).build().perform();
		driver.findElement(By.xpath("html/body/div[1]/header/div/nav[2]/ul/li[2]/div/ul/li[3]/a")).click();
		//System.out.println(driver.findElement(By.xpath("html/body/div[1]/header/div/nav[2]/ul/li[2]/div/ul/li[3]/a")).getText());
		
      driver.close();
	}

}
