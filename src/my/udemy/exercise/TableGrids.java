package my.udemy.exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrids {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20754/ban-vs-wi-2nd-test-windies-tour-of-bangladesh-2018");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int totRun=0;
		List<WebElement> runsList = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
		for(int i=0; i<runsList.size();i++)
		{
			if(i<=10)
			{
				System.out.println("Score is: "+runsList.get(i).getText());
				totRun=totRun + Integer.parseInt(runsList.get(i).getText());
			}
		}
		
		List<WebElement> runsExtra = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[2]"));
		
		int extras = Integer.parseInt(runsExtra.get(11).getText());
		totRun=totRun+extras;
		
		int total = Integer.parseInt(runsExtra.get(12).getText());
		
		if(total==totRun)
		{
			System.out.println("Tally");
		}
		
		
		//driver.close();
		
	}

}
