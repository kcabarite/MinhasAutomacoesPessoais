package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import actions.HomeActions;

public class HomeComponents extends HomeActions {
	

	public HomeComponents(WebDriver driver) {
		super(driver);
	}

			
	@FindBy (xpath = "//a[contains(text(),'Sign in')]")
	public WebElement bt_SignIn;
	
	@FindBy (xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]")
	public WebElement produtoFadedShortSleeveTshirts;
	
	@FindBy (xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]")
	public WebElement bt_Proccedtocheckout;
		
	@FindBy (xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]\r\n")
	public WebElement bt_Addtocart;
	
	@FindBy (xpath ="//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]")
	public WebElement bt_cart;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tfoot[1]/tr[7]/td[2]/span[1]")
	public WebElement precoprodutoSummary;
	
	@FindBy (className = "ajax_block_cart_total")
	public WebElement precoprodutoHome;
	
	@FindBy (className = "price cart_block_total ajax_block_cart_total")
	public WebElement precoprodutoCart;
	
	
}


