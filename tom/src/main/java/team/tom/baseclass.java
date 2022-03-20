package team.tom;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.webdriverwait;

public class baseclass {

		                public WebDriver driver;

		public WebDriver initialize()

		{

		             

		                System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Pranali\\Desktop\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		                driver=new ChromeDriver();

		                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		                driver.manage().window().maximize();
		                driver.manage().deleteAllCookies();
		               
		           
		                return driver;

		                }

		}             
			

	


