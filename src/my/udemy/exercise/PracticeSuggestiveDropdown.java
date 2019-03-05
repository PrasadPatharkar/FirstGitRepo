package my.udemy.exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSuggestiveDropdown {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("IND");
		List<WebElement> suggestList = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li/div"));
		for(int i=0; i<suggestList.size();i++)
		{
			if(suggestList.get(i).getText().equalsIgnoreCase("India"))
			{
				suggestList.get(i).click();
				break;
			}
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String country = js.executeScript("return document.getElementById('autocomplete').value").toString();
		System.out.println("Selected option is: "+country);
		
		
		//driver.close();
		
	}

}
