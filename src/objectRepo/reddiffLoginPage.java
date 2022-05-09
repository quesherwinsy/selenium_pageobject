package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reddiffLoginPage {
	WebDriver driver;

	// Constructor to be used by test cases
	public reddiffLoginPage(WebDriver driver) {
		// Represent local driver object, will now act as test case driver
		this.driver = driver;
	}

	// Use of page object model
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signin = By.xpath("//input[@class='signinbtn']");
	By homePage = By.xpath("//div[@class='cell logo']/a");

	public WebElement EmailId() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement SignIn() {
		return driver.findElement(signin);
	}

	public WebElement HomePage() {
		return driver.findElement(homePage);
	}
}
