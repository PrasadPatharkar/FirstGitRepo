package my.udemy.exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExercise {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		if(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected())
		{
			System.out.println("First checkbox is selected");
		}
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		if(!driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected())
		{
			System.out.println("First checkbox is deselected");
		}
		
		System.out.println("Total number of checkboxes on the page are: "+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		//driver.close();
		
	}

}
