package oranageHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmHome {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/");
		Thread.sleep(5000);
		
		
		// 1 Locating the Elements with Element name and its attribute value
		WebElement Bookbutton = driver.findElement(By.xpath("//a[@class='btn-orange trial-btn pulse ']"));
		Bookbutton.click();
		
		// 2 Locating the Web Element by Attribute value and not knowing the attribute value
		WebElement Firstname= driver.findElement(By.xpath("//*[@name='FirstName']"));
		Firstname.sendKeys("Jegan");
		
		// 3 Locating the Elements with Contains method
		WebElement Book= driver.findElement(By.xpath("//*[contains(text(),'Book Your Free Demo')]"));
		Book.click();
		
		// 4 Locating the Web Element with the Text Exact match
		WebElement Contact = driver.findElement(By.xpath("//*[text()='Contact Sales']"));
		Contact.click();
		
		// 5 Locating the Elements with the Starts-With
		WebElement EN= driver.findElement(By.xpath("//*[starts-with(text(),'EN')]"));
		EN.click();
		
		//6 Locating the Elements with multiple Attributes
		WebElement Fullname =driver.findElement(By.xpath("//input[@id='Form_submitForm_FullName'][@placeholder='Full Name'][@required='required']"));
		Fullname.sendKeys("Jagan Singh");
		
		// 7 Locating the Elements with multiple attributes using contains 
		WebElement Company= driver.findElement(By.xpath("//input[contains(@name,'CompanyName')]"));
		Company.sendKeys("Honeywell");
		
		// 8 Locating the Elements with Starts with attribute using starts-with
		WebElement Jobtitle=driver.findElement(By.xpath("//input[starts-with(@name,'JobTitle')]"));
		Jobtitle.sendKeys("QA");
		
		// Locating the attributes with its Relationship
		
		// Locating the Element using parent keyword
		WebElement Emailadd = driver.findElement(By.xpath("//input[@placeholder='Email Address']/parent::form"));
		
		
		// Locating the Element with the child keyword
		 WebElement Emailtext= driver.findElement(By.xpath("//form[contains(@action,'orangehrm-30-day-trial/')]/child::input"));
		 Emailtext.sendKeys("Singh");
		 
		
		
		
		
		
		
		
		

	}

}
