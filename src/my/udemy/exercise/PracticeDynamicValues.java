package my.udemy.exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDynamicValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("checkBoxOption2")).click();
		String strCheck = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		
		Select dropEx = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropEx.selectByVisibleText(strCheck);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(strCheck);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String alertText = driver.switchTo().alert().getText();
		
		if (alertText.contains(strCheck)) {
			System.out.println("Pass");
		}

		// driver.close();

	}

}
