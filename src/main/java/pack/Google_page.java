package pack;


import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Google_page extends Base_page {
	
	
	//Buscamos la barra del buscador en google con su name
	//Localizadores
	By search_bar = By.name("q");
	//By search_bar1 = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a");
	//le damos un nombre al boton, buscamos el xpath
	By accept_cookies_button = By.xpath("//*[@id=\"L2AGLb\"]/div");
	
	//Creamos el constructor
	public Google_page(WebDriver driver) {
	
	//le decimos que nuestro driver es igual al driver que le pasamos
	super(driver);
	
	
	}	
	//Busca este string
	public void SearchForSomething(String text_To_Search) {
		//Accederemos a la web y buscaremos 
		//declaramos variable search localizador/elemento
		WebElement search_bar_Element = this.driver.findElement(search_bar);//Escribiremos en text
		//Pulsaremos ENTER
		search_bar_Element.sendKeys(text_To_Search);
		search_bar_Element.sendKeys(Keys.ENTER);
	}
		
		public void accept_cookies (){
			this.driver.findElement(accept_cookies_button).click();
		}
		public void sendKeys(String string) {
			// TODO Auto-generated method stub
			
		}
	}

