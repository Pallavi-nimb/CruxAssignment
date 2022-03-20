package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Firstlogin {

	public WebDriver driver;
	By declinebutton = By.xpath("//a[@id='hs-eu-decline-button']");

	By login = By.xpath("//li[@class='d-home2022-hero-nav-login']/a");

	By userin = By.id("userInput");

	By buttonlogin = By.cssSelector("div.login-action");

	By productlinkone = By.linkText("Product");

	public Firstlogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement declinepopup() {
		return driver.findElement(declinebutton);

	}

	public WebElement getlogin() {
		return driver.findElement(login);
	}

	public WebElement userdataone() {
		// TODO Auto-generated method stub
		return driver.findElement(userin);
	}

	public WebElement logginurl() {
		// TODO Auto-generated method stub
		return driver.findElement(buttonlogin);

	}

	public WebElement detailsprod() {
		return driver.findElement(productlinkone);
	}

}
