package my.udemy.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTraversexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='gstl_0 sbib_a']/div[2]/div/input")).sendKeys("Radhanath Swami");
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//div[@id='gbw']/div/div/div[1]/div[2]/a")).click();
	}

}
