package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reddiffLoginPageFactory {
	WebDriver driver;

	// Constructor to be used by test cases
	public reddiffLoginPageFactory(WebDriver driver) {
		// Represent local driver object, will now act as test case driver
		this.driver = driver;
		// Initialize the page object factory for @FindBy annotation
		PageFactory.initElements(driver, this);
	}

	/*
	 * By username = By.xpath("//input[@id='login1']"); By password =
	 * By.xpath("//input[@id='password']"); By signin =
	 * By.xpath("//input[@class='signinbtn']"); By homePage =
	 * By.xpath("//div[@class='cell logo']/a");
	 */

	// Selenium page object factory @FindBy annotation
	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@class='signinbtn']")
	WebElement signin;

	@FindBy(xpath = "//div[@class='cell logo']/a")
	WebElement homePage;

	public WebElement EmailId() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement SignIn() {
		return signin;
	}

	public WebElement HomePage() {
		return homePage;
	}
}
