package my.udemy.exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");
		List<WebElement> fromList = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for(int i=0; i<fromList.size();i++)
		{
			if(fromList.get(i).getText().equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
			{
				fromList.get(i).click();
				break;
			}
		}
		
		
		
		//driver.close();
		
	}

}
