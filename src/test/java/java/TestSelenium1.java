package java;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pack.Elements;
import pack.GoogleSearchResultPage;
import pack.Google_page;



public class TestSelenium1 {
	
	private static final String Mundo = null;

	WebDriver driver;
	
	By First_Result  = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3");
	
	
	@BeforeEach
	public void starting() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\eclipse-workspace\\SeleniumMaven\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get("https://Google.com");
		
	}
		

	@Test//Durante el test se ejecutara esto
	public void duranteTest() throws InterruptedException {
		
		
		Google_page google_page = new Google_page(driver);
		
		google_page.accept_cookies();
		
		google_page.SearchForSomething ("Mundo Psicologos");
		
		assertEquals("Mundo Psicologos - Buscar con Google", google_page.getTitle());
		
		
		new GoogleSearchResultPage(driver);
		
		JavascriptExecutor i= (JavascriptExecutor)driver;
		//i.executeScript("window.scrollBy(0,200)");
		
				scrollIntoView(Mundo);
				Elements.Mundo.click();
				
				Elements.cookies.click();
				Elements.button.click();
				Thread.sleep(2000);
				
				i.executeScript("window.scrollBy(0,300)");
				Elements.button1.click();
				Thread.sleep(1000);
				Elements.Servicio.click();
				Elements.Estres.click();
				Elements.localidad.click();
				Elements.localidad.sendKeys("Terrassa");
				Elements.localidad1.click();
				Thread.sleep(4000);
				Elements.buscar.click();	
				Thread.sleep(6000);
				
				i.executeScript("window.scrollBy(0,4000)");
				Elements.paginar.click();	
				Thread.sleep(6000);
				Elements.centro.click();
				Thread.sleep(6000);
				
				
				Elements.Login.click();
				assertEquals("Acceso usuarios", driver.getTitle());
				
				Elements.email.click();
				Elements.email.sendKeys(Elements.getEmail());
				Thread.sleep(1000);
				
				Elements.pwd.click();
				Elements.pwd.sendKeys(Elements.getPass());
				
				Thread.sleep(2000);
				
				Elements.input.click();
				Elements.forum.click();
				i.executeScript("window.scrollBy(0,1000)");
				
				
				Elements.TerapiaBreve.click();
				
				String tagName = driver.findElement(By.xpath("//*[@id=\"hubspot-messages-iframe-container\"]/iframe")).getTagName();
				System.out.println(tagName);
				Thread.sleep(6000);
				
				Elements.Home.click();
				Thread.sleep(6000);
				
				driver.switchTo().frame(1);
				
				Elements.popupOption2.click();
				Elements.popupOption3.click();
				Elements.popupOption4.click();
				
				driver.findElement (By.cssSelector (" body ")). sendKeys (Keys.CONTROL +" w ");
				driver.quit();	
	
				}


	private void scrollIntoView(String mundo) {
		// TODO Auto-generated method stub
		
	}

					
		}




					

