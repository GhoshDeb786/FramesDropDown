package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		System.out.println(driver.getTitle() + " :This is the Title");
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl() + " :This is the Current URL");
		System.out.println(driver.getWindowHandle() + " :This is the Index of Window handle");
		System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']")).getAttribute("title"));
		System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']")).getText());
		
		driver.navigate().to("https://blog.mozilla.org/internetcitizen/2017/07/31/net-positive-internet-health-film-shorts/?sample_rate=0.01&snippet_name=7002#utm_source=desktop-snippet&utm_medium=snippet&utm_campaign=indie_films&utm_term=7002&utm_content=REL");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("papa9830@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345iamdeb");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		driver.navigate().back();
		
		driver.close();
		
		//driver.quit();
		
	}

}