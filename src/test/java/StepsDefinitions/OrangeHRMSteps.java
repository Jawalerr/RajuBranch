package StepsDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import PageLayer.OrangeHRmPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OrangeHRMSteps extends BaseClass {

	@Given("user is on orange login page")
	public void user_is_on_orange_login_page() {
		BaseClass.initialization();
	}

	@When("user validate login functionality")
	public void user_validate_login_functionality() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Given("user validate the home page url")
	public void user_validate_the_home_page_url() {
		String ActualUrl = driver.getTitle();
		Assertions.assertEquals(ActualUrl, "OrangeHRM");
	}

	@Given("user click on pim link")
	public void user_click_on_pim_link() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();

	}

	@When("user click on add employee")
	public void user_click_on_add_employee() {

	}

	@When("user enter {string} ,{string}, {string} and capture the {string}")
	public void user_enter_and_capture_the(String string, String string2, String string3, String string4) {

	}

	@When("user click on save button")
	public void user_click_on_save_button() {

	}

	@When("user enter {string} and select {string}")
	public void user_enter_and_select(String string, String string2) {

	}

	@When("user click on employee list button")
	public void user_click_on_employee_list_button() {

	}

	@When("user enter the employee id")
	public void user_enter_the_employee_id() {

	}

	@When("user click on search button")
	public void user_click_on_search_button() {

	}

	@When("user delete employee and confirm delete")
	public void user_delete_employee_and_confirm_delete() {

	}

	@Given("user logout from application")
	public void user_logout_from_application() {

	}

}
