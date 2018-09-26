package abc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		
		//switching to alert
	    Alert alert = driver.switchTo().alert();
		
	   // Capturing alert message.    
        String alertMessage = driver.switchTo().alert().getText();
        
     // Displaying alert message		
        System.out.println(alertMessage);	
       
        
     // Accepting alert		
        alert.accept();;
		
	}

}