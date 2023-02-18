package projetoClaro;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseTest {
	
	protected static WebDriver driver;
	
	
	

	@BeforeEach
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver", "D:/Alura Programas/projetoClaro/src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.claro.com.br/");
		
		
		PageFactory.initElements(driver, this);
	}

	
	@AfterEach
	public void finaliza() {
		driver.quit();
	}
	
}
