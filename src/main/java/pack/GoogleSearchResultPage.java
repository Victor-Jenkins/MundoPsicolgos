package pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResultPage extends Base_page{

	public GoogleSearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
		
	//Declaramos una variable con un localizador/Elemento
	//Analizamos la web con F12 y vemos que el titulo depende de un div y una class antes de llegar al titulo,
			//de manera que crearemos nuestro propio xpath con la ruta para llegar hasta el titulo
	By First_Result  = By.xpath("//*[@id=\\\"rso\\\"]/div[1]/div/div/div/div/div/div[1]/a/h3");
	
	

	public void click_On_First_Result() {
		//Accederemos a la web y buscaremos 
		
		//Buscaremos un elemento y lo pulsaremos
		this.driver.findElement(First_Result).click();
		
	}



	

	

}
