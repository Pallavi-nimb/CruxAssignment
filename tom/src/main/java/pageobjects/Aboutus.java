package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Aboutus {

	public WebDriver driver;

	By aboutlink = By.xpath("//ul[@class='d-home2022-hero-nav']/li[3]");

	By Imagelink = By.cssSelector("img.d-footer-app-store-g");

	By Googleplay = By.xpath("//img[@class='gb_wc']");

	By Navigatehome = By.xpath("//ul[@class='d-home2022-hero-nav']/li[1]/a");

	public Aboutus(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement Aboutr() {
		return driver.findElement(aboutlink);
	}

	public WebElement imageslinkages() {
		return driver.findElement(Imagelink);

	}

	public String playstoreapp() {
		String lk = driver.findElement(Googleplay).getText();
		System.out.println(lk);
		return lk;

	}

	public WebElement Navigatehome() {
		return driver.findElement(Navigatehome);
	}

}
