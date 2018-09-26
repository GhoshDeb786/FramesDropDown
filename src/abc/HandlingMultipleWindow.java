package abc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		String windowhandle= driver.getWindowHandle();
		System.out.println(windowhandle);
		
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		
		Set<String> s= driver.getWindowHandles();
		System.out.println(s);
		System.out.println(s.size());
		
		Iterator iterator = s.iterator();
		String currentwindowid;
		
		while(iterator.hasNext()){
			
			currentwindowid = iterator.next().toString();
			System.out.println(currentwindowid);
			
			//if the currentwindowid!= homepage,it will switch to Popup Window
			
			if(!currentwindowid.equals(windowhandle)){
				driver.switchTo().window(currentwindowid);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("papa123@gmail.com");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).submit();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='/popup.php']")).click();
			}
				
		}
		driver.switchTo().window(windowhandle);
		driver.close();
		
	}
}	
		