package everis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.AuthenticationActions;
import actions.HomeActions;
import components.HomeComponents;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Validar_Preco_Produto {

	String url;
	WebDriver driver;

	HomeActions homeActions;
	HomeComponents homeComponents;
	AuthenticationActions authenticationActions;

	@Before
	public void iniciar() {
		url = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kcabarit\\OneDrive - everis\\Escritorio\\Treinamentos\\teste-everis-automacao\\drivers\\93\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, "0"));

		homeActions = new HomeActions(driver);
		homeComponents = new HomeComponents(driver);
		authenticationActions = new AuthenticationActions(driver);
	}

	@After
	public void finalizar() {
//		driver.quit();
	}
	
	@Dado("que Maria entra com {string} e {string} na tela inicial do YourLogo")
	public void que_Maria_entra_com_e_na_tela_inicial_do_YourLogo(String usuario, String senha) {
		driver.get(url);
		homeActions.NavegacaoPageHome();
		authenticationActions.NavegacaoPageAuthentication(usuario, senha);

	}

	@SuppressWarnings("static-access")
	@Quando("ela escolhe um produto no site")
	public void ela_escolhe_um_produto_no_site() throws Exception {
		homeActions.NavegacaoPageHome2();
		this.takeSnapShot(driver, "C://Users//kcabarit//OneDrive - everis//Escritorio//Treinamentos//teste-everis-automacao//target//Screenshot//produtoHome.png") ;

	}

	@SuppressWarnings("static-access")
	@Entao("ela deve finalizar a compra e ir na tela Summary para conferir se o preco total da compra esta correto")
	public void ela_deve_finalizar_a_compra_e_ir_na_tela_Summary_para_conferir_se_o_preco_total_da_compra_esta_correto()
			throws Exception {
		Thread.sleep(2000);
		homeActions.NavegacaoPageHome3();
		assertEquals("Os textos são diferentes! ",homeActions.precoHome, homeActions.precoSummary);
	   	assertTrue("Verification Failed: Element1 and Element2 are not same.",homeActions.precoHome.equals(homeActions.precoSummary));
		this.takeSnapShot(driver, "C://Users//kcabarit//OneDrive - everis//Escritorio//Treinamentos//teste-everis-automacao//target//Screenshot//produtoSummary.png") ;

	}

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}