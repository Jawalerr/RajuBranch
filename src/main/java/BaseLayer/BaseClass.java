package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void initialization() {

		// connect with actual browser

		// Up casting
		driver = new ChromeDriver();

		// implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// pageload timeouts
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// maximize window
		driver.manage().window().maximize();

		// Delete All cookies
		driver.manage().deleteAllCookies();

		// open Url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
}