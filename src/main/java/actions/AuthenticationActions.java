package actions;

import org.openqa.selenium.WebDriver;
import components.AuthenticationComponents;
import components.PageObject;

public class AuthenticationActions extends PageObject {

	public AuthenticationActions(WebDriver driver) {
		super(driver);
	}

	AuthenticationComponents authenticationComponents;

	public void NavegacaoPageAuthentication(String usuario, String senha) {
		authenticationComponents = new AuthenticationComponents(driver);
		authenticationComponents.usuario.click();
		authenticationComponents.usuario.sendKeys(usuario);
		authenticationComponents.senha.click();
		authenticationComponents.senha.sendKeys(senha);
		authenticationComponents.bt_SubmitLogin.click();
		authenticationComponents.bt_home.click();
	}

}
