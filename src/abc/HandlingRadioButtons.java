package abc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\INFOCOM\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
		
WebElement radiobutton = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div[7]/p[2]/input[1]"));
        boolean elementstatus = radiobutton.isDisplayed();
        System.out.println(elementstatus);
        
        elementstatus = radiobutton.isEnabled();
        System.out.println(elementstatus);
        
        elementstatus = radiobutton.isSelected();
        System.out.println(elementstatus);
        
        radiobutton.click();
        System.out.println(radiobutton.isSelected());
        
        driver.close();
        
	}

}