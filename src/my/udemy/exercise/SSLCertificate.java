package my.udemy.exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions ch = new ChromeOptions();
		//ch.merge     <-------merge function is not shown for object of ChromeOptions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver(ch);
		driver.get("https://expired.badssl.com/");
		
		// driver.close();

	}

}
