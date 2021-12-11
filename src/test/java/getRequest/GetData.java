package getRequest;

import actions.GetActions;
import components.Pojo;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class GetData {

	Pojo pojo;

	@Dado("que ao acessar o link {string}")
	public void que_ao_acessar_o_link(String url) {
	}

	@Quando("que no Json possui um campo {string}")
	public void que_no_Json_possui_um_campo(String campo) {
		GetActions.BDDGetCampo(campo);
	}

	@Entao("deve ser verificado se o endereco do link {string} esta correto")
	public void deve_ser_verificado_se_o_endereco_do_link_esta_correto(String texto) {
	}

	
	@Entao("deve ser verificado se o campo esta correto")
	public void deve_ser_verificado_se_o_campo_esta_correto() {
		GetActions.BDDGetCampoEx1();
	}

}