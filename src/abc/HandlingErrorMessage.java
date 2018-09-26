package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElement(By.partialLinkText("Gmail")).click();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("*");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getAttribute("Value"));
		
		driver.close();
		
	}

}