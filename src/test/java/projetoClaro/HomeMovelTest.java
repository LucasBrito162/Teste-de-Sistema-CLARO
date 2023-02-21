package projetoClaro;



import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class HomeMovelTest extends BaseTest {

	
	
	/*** Inicio dos Teste de Localização!*/
@Test
public void TC_001_DeveSelecionarALocalidadeDesejavel() {
		HomeMovelPO pageHome = new HomeMovelPO(driver);
		pageHome.buttonModal();
		pageHome.inputCidade();
		pageHome.buttonSaoPaulo();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assertions.assertEquals("Escolha seu plano com ultravelocidade e oferta", driver.findElement(By.cssSelector("#background1 > div > div.cms-Title.cms-spacing-bottom--sm > h2")).getText());
		
}

@Test
public void TC_002_DeveEntrarNaPaginaDeCombosDisponiveisEmMinhaLocalidade() {
	
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonCombos();
	pageHome.inputCEP();
	pageHome.inputNumero();
	pageHome.buttonConsulta();
	
}



	/* Inicio dos teste dos Plano MÓVEl PÓS. */
@Test
public void TC_003_DeveEntrarParaEscolherOPlanoPosMovel() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonEscolhaPlanoPos();
	Assertions.assertEquals("O plano para quem é ultra conectado!", driver.findElement(By.xpath("/html/body/main/div[4]/div/section/header/div/div/div[1]/div/h2")).getText());
}

@Test
public void TC_004_DeveEntrarParaConhecerOPlanoPosMovel() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonConhecaPlanoPos();
	Assertions.assertEquals("Escolha seu plano com ultravelocidade e oferta", "Escolha seu plano com ultravelocidade e oferta");
}

@Test
public void TC_005_DeveEntrarParaAdicionarPacoteExtraPlanoPosMovel() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPacoteAdicionalPos();
	Assertions.assertEquals("Pacotes adicionais Claro pós", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[1]/div/div[1]/h2")).getText());

}

	/* Inicio dos teste dos Plano MÓVEl CONTROLE. */
	
@Test
public void TC_006_DeveEntrarParaEscolherOPlanoControleMovel() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonEscolhaPlanoControle();
	Assertions.assertEquals("Claro Controle.", driver.findElement(By.xpath("/html/body/main/div[4]/div/section/header/div/div/div[1]/div/h1")).getText());
}

@Test
public void TC_007_DeveEntrarParaConhecerOPlanoControleMovel() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonConhecaPlanoControle();
	Assertions.assertEquals("Planos de celular Controle da Claro", driver.findElement(By.xpath("//*[@id=\"A psar\"]/div/div[1]/h2")).getText());
}

@Test
public void TC_008_DeveEntrarParaAdicionarPacoteExtraPlanoControleMovel() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPacoteAdicionalControle();
	Assertions.assertEquals("Pacotes adicionais Claro controle", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[1]/div/div[1]/h2")).getText());

}

	/* Inicio dos teste de Plano Flex */
@Test
public void TC_009_DeveEntrarParaEscolherOPlanoFlex() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonEscolhaPlanoFlex();
	Assertions.assertEquals("Mensal", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[1]/div/div/div[1]/ul/li/div")).getText());
}

@Test
public void TC_010_DeveEntrarParaConhecerOPlanFlexMovel() {
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonConhecaPlanoFlex();
	Assertions.assertEquals("Planos Claro flex", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText());
}

	/* Inicio dos testes do Plano Pré */
@Test
public void TC_011_DeveEntraNaPaginaPromocoesPre()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPromocoesPre();
	Assertions.assertEquals("Benefícios exclusivos que só o Prezão tem", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText());
}

@Test
public void TC_012_DeveEntraNaPaginaPrezao()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPrezao();
	Assertions.assertEquals("Escolha seu Prezão", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText());
}

@Test
public void TC_013_DeveEntraNaPaginaDeRecarga()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonRecarga();
	Assertions.assertEquals("Claro Recarga Móvel", driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/main/div[1]/div[1]/div/h1")).getText());
}

@Test
public void TC_014_DeveEntrarParaAdicionarPacoteExtraPlanoPreMovel()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPacoteAdicionalPre();
	Assertions.assertEquals("Pacotes adicionais Claro pré", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/div/div/h1")).getText());
}

	/* Inicio dos teste dos Plano Mais para você  */
@Test
public void TC_015_DeveEntrarEMostrarTodosOsPlanosMovel()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonTodosPlanos();
	Assertions.assertEquals("Planos Claro móvel", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText());
}

@Test
public void TC_016_DeveEntrarNaPaginaDePortabilidade()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonPortabilidade();
	Assertions.assertEquals("Faça portabilidade para a Claro e ganhe bônus exclusivos", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/div/div/h1")).getText());
}

@Test
public void TC_017_DeveEntrarNaPaginaDeSmartphones()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonSmartohones();
	Assertions.assertEquals("Smartphone", driver.findElement(By.xpath("/html/body/main/div[4]/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/h1")).getText());
}

@Test
public void TC_018_DeveEntrarNaPaginaDeUsoParaExterior()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonUsoNoExterior();
	Assertions.assertEquals("Passaporte Mundo", driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/div/div/div[2]/div/div[1]/h2")).getText());
}

@Test
public void TC_019_DeveEntrarNaPaginaDeCoberturaDeSinal()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonUsoNoExterior();
	driver.getCurrentUrl().equals("https://www.claro.com.br/mapa-de-cobertura");
}

@Test
public void TC_020_DeveEntrarNaPaginaOndeMostraVantagem5G()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonClaro5G();
	driver.getCurrentUrl().equals("https://www.claro.com.br/internet/5g-mais");
}

@Test
public void TC_021_DeveEntrarNaPaginaDeMigracaoOIParaClaro()	{
	HomeMovelPO pageHome = new HomeMovelPO(driver);
	pageHome.buttonMovel();
	pageHome.buttonClientesOiMovel();
	driver.getCurrentUrl().equals("https://www.claro.com.br/clientes-oi-movel");
}





}
