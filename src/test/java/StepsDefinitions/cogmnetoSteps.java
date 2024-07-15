package StepsDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cogmnetoSteps {
	public static WebDriver driver;

	@Given("User open Url in {string} broswer")
	public void user_open_url_in_broswer(String browserName) {

		driver = new ChromeDriver();
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("incognito")) {
			driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
		} else if (browserName.equalsIgnoreCase("headless")) {
			driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
		} else {
			System.out.println("please enter the valid browser");
		}
		// implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// pageload timeouts
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// maximize window
		driver.manage().window().maximize();

		// Delete All cookies
		driver.manage().deleteAllCookies();

		// open Url
		driver.get("https://ui.cogmento.com/");

	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists();
		String username = list.get(0).get(0);
		String password = list.get(0).get(1);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@When("user is on home page and validate title")
	public void user_is_on_home_page_and_validate_title() {
		String actualTitle = driver.getTitle();
		Assertions.assertEquals(actualTitle, "Cogmento CRM");

	}

	@When("user validate url")
	public void user_validate_url() {

		String actualUrl = driver.getCurrentUrl();
		Assertions.assertTrue(actualUrl.contains("cogmento"));
	}

	@When("user click on contact link")
	public void user_click_on_contact_link() {
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();

	}

	@When("user click on create button")
	public void user_click_on_create_button() {
		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();

	}

	@Then("user enter firstname , last name and select status")
	public void user_enter_firstname_last_name_and_select_status() {
	/*
	 * List<List<String>> list = dataTable.cells(); String Fname =
	 * list.get(0).get(0); String LName = list.get(0).get(1); String status =
	 * list.get(0).get(2);
	 * 
	 * driver.findElement(By.name("first_name")).sendKeys(Fname);
	 * driver.findElement(By.name("last_name")).sendKeys(LName);
	 * 
	 * driver.findElement(By.name("status")).click();
	 * 
	 * List<WebElement> statusList =
	 * driver.findElements(By.xpath("//div[@name='status']/child::span"));
	 * 
	 * for (WebElement value : statusList) { String statusValue = value.getText();
	 * 
	 * if (statusValue.equalsIgnoreCase(status)) { value.click(); break; } } 
	 */
	}
	@When("user click on company link")
	public void user_click_on_company_link() {
		driver.findElement(By.xpath("//a[@href='/companies']")).click();
	}

	@When("user click on company page create button")
	public void user_click_on_company_page_create_button() {
		driver.findElement(By.xpath("//a[@href='/companies/new']")).click();
	}

	@Then("user enter name, website,  address and email")
	public void user_enter_name_website_address_and_email(DataTable dataTable) {
		List<Map<String, String>> listMap = dataTable.asMaps();

		String name = listMap.get(0).get("name");
		String website = listMap.get(0).get("website");
		String address = listMap.get(0).get("address");
		String email = listMap.get(0).get("email");

		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("url")).sendKeys(website);
		driver.findElement(By.name("address")).sendKeys(address);
		driver.findElement(By.name("value")).sendKeys(email);

	}

	@When("user click on deals link")
	public void user_click_on_deals_link() {
		
	}

	@When("user click on deals page create button")
	public void user_click_on_deals_page_create_button() {
	
	}

	@Then("user enter title and user select date as {int} and month and year as {string} and time as {string}")
	public void user_enter_title_and_user_select_date_as_and_month_and_year_as_and_time_as(Integer int1, String string) {
		
	}
}
