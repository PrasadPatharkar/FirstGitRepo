package my.udemy.exercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTabsoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerLink = driver.findElement(By.xpath("//footer[@id='alaska-footer']/div[3]"));
		
		System.out.println(footerLink.findElements(By.tagName("a")).size());
		for(int i=0; i<footerLink.findElements(By.tagName("a")).size();i++)
		{
			String openTab = Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);
			footerLink.findElements(By.tagName("a")).get(i).sendKeys(openTab);
		}
		
		Set<String> wSet = driver.getWindowHandles();
		Iterator<String> it=wSet.iterator();
		
		while(it.hasNext())
		{
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			
		}
		
		//driver.close();
		
	}

}
