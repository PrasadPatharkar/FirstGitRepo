package my.udemy.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//li[@aria-label='Top Cities : New Delhi, India ']")).click();
		
		
	}

}
