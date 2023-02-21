package projetoClaro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomeMovelPO extends BasePO {
	public HomeMovelPO(WebDriver driver) {
		super(driver);
		
	}


	public void buttonModal() {
			driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[1]/div/nav/ul[1]/li[1]/button")).click();
}
	public void inputCidade() {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/input")).sendKeys("sao paulo");
	}
	public void buttonSaoPaulo() {
			driver.findElement(By.cssSelector("#__next > div.mdn-Modal.mdn-Modal--lg.cms-modal.mdn-isOpen.mdn-isInitialized > div > div > div.mdn-Modal-body > div > div.cms-Input.cms-Form-geolocation.cms-Input--activatedField > div.cms-show.mdn-Menu-Modal-content.target-results.cms-marginTop--xs > div > ul > li:nth-child(4) > button")).click();
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[1]/div/button")).click();
			driver.findElement(By.cssSelector("#background1 > div > div.cms-Title.cms-spacing-bottom--sm > h2")).getText();

	}
	
	public void buttonCombos() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[1]/div[1]/button")).click();
	}
	public void inputCEP() {
		driver.findElement(By.id("cmsFormZipCode")).sendKeys("07154050" + Keys.TAB);
	}
	public void inputNumero() {
		driver.findElement(By.id("cmsFormNumber")).sendKeys("69" + Keys.TAB);
	}
	public void buttonConsulta() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[1]/div[2]/div/div/div/div/div/form/button")).click();
	}
	
	public void buttonMovel() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div/button")).click();
	}
	/* ELEMENTOS MÓVEL PÓS.*/
	public void buttonEscolhaPlanoPos() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[1]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/main/div[4]/div/section/header/div/div/div[1]/div/h2")).getText();

	}
	public void buttonConhecaPlanoPos() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[1]/div[2]/ul/li[2]")).click();
		

	}
	public void buttonPacoteAdicionalPos() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[1]/div[2]/ul/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[1]/div/div[1]/h2")).getText();
	}

	/* ELEMENTOS MÓVEL CONTROLE.*/

	public void buttonEscolhaPlanoControle() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[2]/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/main/div[4]/div/section/header/div/div/div[1]/div/h1")).getText();
	}
	public void buttonConhecaPlanoControle() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[2]/div[2]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"A psar\"]/div/div[1]/h2")).getText();
	}
	public void buttonPacoteAdicionalControle() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[2]/div[2]/ul/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[1]/div/div[1]/h2")).getText();
	}

	/*ELEMENTOS MOVEL FLEX */

	public void buttonEscolhaPlanoFlex() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[3]/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[1]/div/div/div[1]/ul/li/div")).getText();
	}
	public void buttonConhecaPlanoFlex() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[3]/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("#cms-MainContent > section.sectionComponent.cms-SalesCard.has-title > div > div.cms-Title.cms-spacing-bottom--sm > h2")).getText();
	}

	/*ELEMENTOS MOVEL PRÉ */

	public void buttonPromocoesPre(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[4]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText(); 
	}

	public void buttonPrezao(){
		driver.findElement(By.cssSelector("#cms-Header > div.cms-Menu-Main.mdn-Menu-container > div > nav > div.mdn-Menu-content-left > ul > li.cms-subMenu--open.mdn-Menu-list-item.cms-Menu-list-item > div.cms-Menu-subMenu > div > div > ul > li:nth-child(4) > div.cms-Menu-subMenu > ul > li:nth-child(2) > a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText();
		}

	public void buttonRecarga(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[4]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/main/div[1]/div[1]/div/h1")).getText(); 
	}

	public void buttonPacoteAdicionalPre() {
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[4]/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/div/div/h1")).getText();
	}

	/*ELEMENTOS MÓVEL MAIS PRA VOCÊ */

	public void buttonTodosPlanos(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[5]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText();
	} 

	public void buttonPortabilidade(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[5]/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/div/div/h1")).getText();  
	}

	public void buttonSmartohones(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[5]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/main/div[4]/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/h1")).getText(); 
	}

	public void buttonUsoNoExterior(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[5]/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/div/div/div[2]/div/div[1]/h2")).getText(); 
	}

	public void buttonCobertura(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[5]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[1]/div/div[1]/h2")).getText(); 
	}

	public void buttonClaro5G(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[5]/div[2]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/h2")).getText();
	}

	public void buttonClientesOiMovel(){
		driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[2]/div/nav/div[1]/ul/li[2]/div[2]/div/div/ul/li[5]/div[2]/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-MainContent\"]/section[2]/div/div[1]/div/div/div/div/div[1]/h2")).getText();
	}


	


























}
