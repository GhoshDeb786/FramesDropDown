package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumhq.org/download/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[1]/td[6]/a")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(2000);
	
		//driver.navigate().back();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(3000);
		
		
		driver.close();
	}

}