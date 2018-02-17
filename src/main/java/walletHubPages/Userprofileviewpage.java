package walletHubPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Userprofileviewpage extends Welcomepage {
	public Userprofileviewpage openingurl() throws FileNotFoundException, IOException  {
		loadObjects();
		driver.navigate().to("https://wallethub.com/profile/test_insurance_company/");
		return this;
	}
	
	public Userprofileviewpage Userloginchk() throws FileNotFoundException, IOException, InterruptedException {
		
		try {
			if (driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed()) {
				clickByXpath(prop.getProperty("notification.cross"));
			}
		} catch (Exception e) {

		}
		
		clickbyActions(prop.getProperty("loginbut.xpath"));
		Thread.sleep(800);
		enterbyXPath(prop.getProperty("email.add"), prop.getProperty("email.value"));
		enterbyXPath(prop.getProperty("password"), prop.getProperty("pwd.value"));
		clickByXpath(prop.getProperty("login.button3"));		
		return this;
	}
	public WriteReviewpage clickonFourthStar() throws FileNotFoundException, IOException, InterruptedException {
		

		try {
			if (driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed()) {
				clickByXpath(prop.getProperty("notification.cross"));
			}
		} catch (Exception e) {

		}
		WebElement element1 = driver.findElement(By.xpath(prop.getProperty("enable.review")));
		mousehoverByxpath(prop.getProperty("enable.review"));
		mousehoverByxpath(prop.getProperty("star1.xpath"));
		 mousehoverByxpath(prop.getProperty("star2.xpath"));
		mousehoverByxpath(prop.getProperty("star3.xpath"));
		mousehoverByxpath(prop.getProperty("star4.xpath"));
		mousehoverByxpath(prop.getProperty("star5.xpath"));
		clickbyActions(prop.getProperty("star5.xpath"));		
		return new WriteReviewpage();
	}

	public WriteReviewpage clickonlink() {
		driver.navigate().back();
		clickByXpath(prop.getProperty("review.button"));
		return new WriteReviewpage();
	}
}
