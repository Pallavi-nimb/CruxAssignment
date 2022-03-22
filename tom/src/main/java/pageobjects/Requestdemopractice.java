package pageobjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Requestdemopractice {

	public WebDriver driver;
	
	By Requestdemo = By.xpath("//a[@href='https://www.cruxintelligence.com/request-demo/'][1]");

	By scheduledemo = By.linkText("This team specializes in CPG & Retail demo & use cases.");

	By Dateselection = By.xpath("//button[@aria-label='Wednesday, March 30']");

	By Date = By.xpath("//button[@data-container='time-button']");

	By Time = By.xpath("//button[@data-container='time-button']");

	By Spectime = By.xpath("//button[@data-start-time='11:30pm']");

	By selectbutton = By.xpath("//button[@data-start-time='11:30pm']");

	By Nameenter = By.xpath("//input[@name='full_name']");

	By emailenter = By.xpath("//input[@id='email_input']");

	By textenter = By
			.xpath("//*[@id='page-region']/div/div/div/div[2]/div/div/form/div/fieldset[2]/div/div/label/div/textarea");

	
	public Requestdemopractice(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By confirmbutt = By.xpath("//button[@data-container='time-button']");

	By confirmatten = By.xpath("//div[@data-container='selected-spot']/button[2]");

	
	public WebElement uscgp() {
		return driver.findElement(scheduledemo);
	}

	public List<WebElement> demo() {
		return driver.findElements(Requestdemo);
	}


	public WebElement datecal() {
		return driver.findElement(Dateselection);
	}

	public List<WebElement> timecal() {
		return driver.findElements(Time);
	}

	public WebElement td() {
		return driver.findElement(Spectime);
	}

	public List<WebElement> confirmtime() {
		return driver.findElements(confirmbutt);
	}

	public WebElement confirmtime2() {
		return driver.findElement(confirmatten);
	}

	public WebElement email() {
		return driver.findElement(emailenter);
	}

	public WebElement name() {
		return driver.findElement(Nameenter);
	}

	public WebElement textadd() {
		return driver.findElement(textenter);
	}

}
