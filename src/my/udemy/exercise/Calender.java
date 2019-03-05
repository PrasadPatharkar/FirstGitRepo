package my.udemy.exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		
		
		while(!driver.findElement(By.xpath("//*[@class='datepicker-days']/table/thead/tr[1]/th[2]")).getText().contains("April"))
		{
			driver.findElement(By.xpath("//*[@class='datepicker-days']/table/thead/tr[1]/th[3]")).click();
		}
		List<WebElement> dates=driver.findElements(By.xpath("//*[@class='day']"));
		System.out.println(dates.size());
		for(int i=0; i<dates.size();i++)
		{
			if(dates.get(i).getText().equalsIgnoreCase("21")){
				dates.get(i).click();
				break;  
			}
		}
		
		
		//driver.close();
		
	}

}
