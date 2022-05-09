package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reddiffHomePage {
	WebDriver driver;

	// Constructor to be used by test cases
	public reddiffHomePage(WebDriver driver) {
		// Represent local driver object, will now act as test case driver
		this.driver = driver;
		// Initialize the page object factory for @FindBy annotation
		PageFactory.initElements(driver, this);
	}

	/*
	 * By searchword = By.xpath("//input[@id='srchword']"); By searchbtn =
	 * By.xpath("//input[@class='newsrchbtn']");
	 */

	// Selenium page object factory @FindBy annotation
	@FindBy(xpath = "//input[@id='srchword']")
	WebElement searchword;

	@FindBy(xpath = "//input[@class='newsrchbtn']")
	WebElement searchbtn;

	public WebElement SearchBar() {
		// return driver.findElement(searchword);
		return searchword;
	}

	public WebElement SearchBtn() {
		// return driver.findElement(searchbtn);
		return searchbtn;
	}
}
