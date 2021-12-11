package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import components.HomeComponents;
import components.PageObject;

public class HomeActions extends PageObject {

	public HomeActions(WebDriver driver) {
		super(driver);
	}
	
	public static String precoSummary;
	public static String precoHome;
	
	HomeComponents homeComponents;

	public void NavegacaoPageHome() {
		homeComponents = new HomeComponents(driver);
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		homeComponents.bt_SignIn.click();
	}

	public void NavegacaoPageHome2() throws InterruptedException {
		homeComponents = new HomeComponents(driver);
		homeComponents.produtoFadedShortSleeveTshirts.click();
		homeComponents.bt_Addtocart.click();
		Thread.sleep(10000);
		precoHome = homeComponents.precoprodutoHome.getAttribute("innerHTML");
		System.out.println(precoHome);
		
	}

	public void NavegacaoPageHome3() throws InterruptedException {
		homeComponents = new HomeComponents(driver);
		homeComponents.bt_Proccedtocheckout.click();
		homeComponents.bt_cart.click();
		precoSummary = homeComponents.precoprodutoSummary.getText();
		System.out.println(precoSummary);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom = '60%'");
		Thread.sleep(5000);
	}

}
