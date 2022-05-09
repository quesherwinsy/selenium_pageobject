package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.reddiffHomePage;
import objectRepo.reddiffLoginPage;

public class loginApplication {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\home\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe");
		// webdriver.chrome.driver invoking browser, chrome browser
		WebDriver driver = new ChromeDriver();
		// implicit wait 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// maximize the window screen
		driver.manage().window().maximize();
		// webdriver go to URL
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		reddiffLoginPage rd = new reddiffLoginPage(driver);
		rd.EmailId().sendKeys("Hello");
		rd.Password().sendKeys("Password");
		// rd.SignIn().click();
		rd.HomePage().click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		reddiffHomePage rh = new reddiffHomePage(driver);
		rh.SearchBar().sendKeys("reddiff");
		rh.SearchBtn().click();
	}
}
