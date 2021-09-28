package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import actions.AuthenticationActions;

public class AuthenticationComponents extends AuthenticationActions {

	public AuthenticationComponents(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "SubmitLogin")
	public WebElement bt_SubmitLogin;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]")
	public WebElement bt_home;

	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	public WebElement usuario;
	
	@FindBy (id="passwd")
	public WebElement senha;
}
