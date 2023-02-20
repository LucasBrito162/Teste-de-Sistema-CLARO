package projetoClaro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pageHomePO extends BasePO {
	public pageHomePO(WebDriver driver) {
		super(driver);
		
	}

	
	public void buttonModal() {
			driver.findElement(By.xpath("//*[@id=\"cms-Header\"]/div[1]/div/nav/ul[1]/li[1]/button")).click();
}
	public void inputCidade() {
			driver.findElement(By.cssSelector("#__next > div.mdn-Modal.mdn-Modal--lg.cms-modal.mdn-isOpen.mdn-isInitialized > div > div > div.mdn-Modal-body > div > div.cms-Input.cms-Form-geolocation.cms-Input--activatedField > div.mdn-Input > input")).sendKeys("sao paulo");
	}
	public void buttonSaoPaulo() {
			driver.findElement(By.cssSelector("#__next > div.mdn-Modal.mdn-Modal--lg.cms-modal.mdn-isOpen.mdn-isInitialized > div > div > div.mdn-Modal-body > div > div.cms-Input.cms-Form-geolocation.cms-Input--activatedField > div.cms-show.mdn-Menu-Modal-content.target-results.cms-marginTop--xs > div > ul > li:nth-child(4) > button")).click();
			driver.findElement(By.cssSelector("#cms-Header > div.mdn-Menu-top > div > nav > ul.mdn-Menu-top-list.mdn-Menu-top-list-left > li:nth-child(1) > button > span.cms-Event-text")).getText();

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




}
