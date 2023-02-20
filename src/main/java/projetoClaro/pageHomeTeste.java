package projetoClaro;



import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class pageHomeTeste extends BaseTest {

	
	
	/*** Inicio dos Teste de Localização!*/
@Test
public void TC_001_DeveSelecionarALocalidadeDesejavel() {
		pageHomePO pageHome = new pageHomePO(driver);
		pageHome.buttonModal();
		pageHome.inputCidade();
		pageHome.buttonSaoPaulo();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assertions.assertEquals("São Paulo", "São Paulo");
		
}

@Test
public void TC_002_DeveEntrarNaPaginaDeCombosDisponiveisEmMinhaLocalidade() {
	
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonCombos();
	pageHome.inputCEP();
	pageHome.inputNumero();
	pageHome.buttonConsulta();
	
}



	/* Inicio dos teste dos Planos MÓVEIS PÓS. */
@Test
public void TC_003_DeveEntrarParaEscolherOPlanoPosMovel() {
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonMovel();
	pageHome.buttonEscolhaPlanoPos();
	Assertions.assertEquals("O plano para quem é ultra conectado!", "O plano para quem é ultra conectado!");
}

@Test
public void TC_004_DeveEntrarParaConhecerOPlanoPosMovel() {
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonMovel();
	pageHome.buttonConhecaPlanoPos();
	Assertions.assertEquals("Escolha seu plano com ultravelocidade e oferta", "Escolha seu plano com ultravelocidade e oferta");
}

@Test
public void TC_005_DeveEntrarParaAdicionarPacoteExtraPlanoPosMovel() {
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPacoteAdicionalPos();
	Assertions.assertEquals("Pacotes adicionais Claro pós", "Pacotes adicionais Claro pós");

}

	/* Inicio dos teste dos Planos MÓVEIS CONTROLE. */
	
@Test
public void TC_006_DeveEntrarParaEscolherOPlanoControleMovel() {
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonMovel();
	pageHome.buttonEscolhaPlanoControle();
	Assertions.assertEquals("Claro Controle.", "Claro Controle.");
}

@Test

public void TC_007_DeveEntrarParaConhecerOPlanoControleMovel() {
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonMovel();
	pageHome.buttonConhecaPlanoControle();
	Assertions.assertEquals("Planos de celular Controle da Claro", "Planos de celular Controle da Claro");
}

@Test
public void TC_008_DeveEntrarParaAdicionarPacoteExtraPlanoControleMovel() {
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPacoteAdicionalControle();
	Assertions.assertEquals("Pacotes adicionais Claro controle", "Pacotes adicionais Claro controle");

}

}
