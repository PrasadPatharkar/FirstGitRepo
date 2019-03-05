package my.udemy.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRegularExpressionxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@class,'LoginButton')]")).click();
		
	}

}
