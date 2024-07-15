package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class OrangeHRmPage extends BaseClass {

	// page object model with page factory

	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;

	// invoke the object by using pageFactory .initElement method by passing driver
	// and this keyword in constructor
	public OrangeHRmPage() {
		PageFactory.initElements(driver, this);
	}

	// Associate method for object object repository
	public void loginFunction() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
	loginButton.click();
	}

}
