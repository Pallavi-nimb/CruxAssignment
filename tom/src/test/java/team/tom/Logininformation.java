package team.tom;

import java.io.IOException;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageobjects.Aboutus;
import pageobjects.Firstlogin;
import pageobjects.Requestdemopractice;

public class Logininformation extends baseclass {

	@Test

	public void basepagenavigation() throws IOException, InterruptedException

	{

		driver = initialize();

		driver.get("https://cruxintelligence.com/about-us/");

		Firstlogin s = new Firstlogin(driver);
		s.declinepopup().click();
		s.getlogin().click();
		s.userdataone().sendKeys("www");
		s.logginurl().click();
		s.detailsprod().click();

		Aboutus tq = new Aboutus(driver);
		tq.Aboutr().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(1000);
		tq.imageslinkages().click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentId = it.next();
		String Childid = it.next();
		driver.switchTo().window(Childid);
		tq.playstoreapp();
		driver.switchTo().window(ParentId);

		tq.Navigatehome().click();

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		Requestdemopractice rs = new Requestdemopractice(driver);

		driver.get("https://cruxintelligence.com/request-demo/");
		Thread.sleep(6000);

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		driver.get(
				"https://calendly.com/crux-intelligence-team/us-energy-oil-gas-services-retail?embed_domain=www.cruxintelligence.com&embed_type=Inline&text_color=333333&primary_color=ff84db&back=1");

		rs.datecal().click();
		Thread.sleep(2000);
//       JavascriptExecutor js1=(JavascriptExecutor)driver;
//       WebElement xyz= (WebElement) js1.executeScript("document.querySelector('div.elementor-button-wrapper')");
//       ((JavascriptExecutor)driver).executeScript("arguments[0].click();",xyz);   

		for (WebElement ti : rs.timecal()) {
			if (ti.equals(rs.td())) {
				rs.td().click();

			}
		}

		Thread.sleep(2000);

		rs.confirmtime2().click();
		rs.name().sendKeys("pallavi");
		rs.email().sendKeys("Pallavi@gmail.com");
		rs.textadd().sendKeys("Agenda to get detail demo about crux");
		
	}
}
