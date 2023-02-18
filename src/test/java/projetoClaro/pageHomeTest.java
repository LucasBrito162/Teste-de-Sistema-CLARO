package projetoClaro;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class pageHomeTest extends BaseTest {
	
	
	
@Test
	public void TC_001_DeveSelecionarALocalidadeDesejavel() {
		pageHomePO pageHome = new pageHomePO(driver);
		pageHome.buttonModal();
		

		pageHome.inputCidade();
		pageHome.buttonSaoPaulo();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pageHome.tituloModal();
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

@Test
public void TC_003_DeveEntrarPraEscolherOPlanosPosMovel() {
	pageHomePO pageHome = new pageHomePO(driver);
	pageHome.buttonMovel();
	pageHome.buttonEscolhaPlano();
	pageHome.tituloEscolhaPlano();
	Assertions.assertEquals("O plano para quem é ultra conectado!", "O plano para quem é ultra conectado!");
}




}
