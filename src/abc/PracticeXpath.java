package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INFOCOM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("denghosh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Walmart$1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
	}

}
