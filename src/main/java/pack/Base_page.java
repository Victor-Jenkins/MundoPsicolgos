package pack;


import org.openqa.selenium.WebDriver;



//Creamos una clase padre generica para no tener que crear un constructor en cada
//Clase que se use, de esta manera heredan de esta y nos ahorramos codigo
public class Base_page {


	protected WebDriver driver;
	
	public Base_page(WebDriver driver) {

	this.driver = driver;
	
	}
	//devolver el titulo de la pagina
	public String getTitle() {
	return this.driver.getTitle();
	
}}
