package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
		

		WebDriver driver;
	
		private static String Email = new String("bigfishx@icloud.com");
		private static String pass = new String("NaiaMishu1");
		
		public String getTitle() {
			return driver.findElement(By.xpath("//*[@id=\"profile_login\"]/main/div[1]/section/div[1]/h2")).getText();
			}

		
		
		public static String getPass() {
			return pass;
		}

		public static void setPass(String pass) {
			Elements.pass = pass;
		}

		public static String getEmail() {
			return Email;
		}

		public static void setEmail(String email) {
			Email = email;
		}
		
		
		@FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")
		public static WebElement Mundo;

		@FindBy(xpath = "//*[@id=\\\"cf-root\\\"]/div/div/div/div[2]/div[2]/div[2]/button")
		public static WebElement cookies;
		
		
		@FindBy(xpath = "//*[@id=\\\"homeServices\\\"]/div/div/a")
		public static WebElement button;

		@FindBy(xpath = "//*[@id=\\\"otherapy\\\"]/main/div[3]/div[3]/div/div[3]/button")
		public static WebElement button1;
		
		@FindBy(xpath = "//*[@id=\\\"sev_nav\\\"]")
		public static WebElement Servicio;
		
		@FindBy(xpath = "//*[@id=\\\"services-list\\\"]/ul/li[29]")
		public static WebElement Estres;
		
		@FindBy(xpath = "//*[@id=\\\"geo_nav\\\"]")
		public static WebElement localidad;
		
		@FindBy(xpath = "/html/body/main/aside/div/div[2]/div[2]/div[2]/form/div[3]/ul/li[1]")
		public static WebElement localidad1;
		
		@FindBy(xpath = "//*[@id=\\\"os-slider\\\"]")
		public static WebElement buscar;
		
		@FindBy(xpath = "//*[@id=\\\"nav_bottom\\\"]/a")
		public static WebElement paginar;
		
		@FindBy(xpath = "//*[@id=\\\"5423\\\"]/div/div[1]/div[2]/h3/a")
		public static WebElement centro;
		
		@FindBy(xpath = "//*[@id=\\\"user_login\\\"]/li[2]/a/span[2]")
		public static WebElement Login;
		
		@FindBy(xpath = "//*[@id=\\\"loginEmail\\\"]")
		public static WebElement email;
		
		@FindBy(xpath = "//*[@id=\\\"loginPwd\\\"]")
		public static WebElement pwd;

		@FindBy(xpath = "//*[@id=\\\"profile_login_form\\\"]/input[1]")
		public static WebElement input;
		
		@FindBy(xpath = "//*[@id=\\\"callToForum\\\"]")
		public static WebElement forum;
		
		@FindBy(xpath = "//*[@id=\\\"Content\\\"]/div/ul[1]/li[12]/div[1]/a/span")
		public static WebElement TerapiaBreve;
		
		@FindBy(xpath = "//*[@id=\\\"side_nav_container\\\"]/div/a/img")
		public static WebElement Home;
		
		@FindBy(xpath = "//*[@id=\\\"current-view-component\\\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div/button[3]/div")
		public static WebElement popupOption2;
		@FindBy(xpath = "//*[@id=\\'current-view-component\\']/div/div/div[2]/div/div[1]/div/div/div[5]/div/div/div[2]/div/button[3]/div")
		public static WebElement popupOption3;
		@FindBy(xpath = "//*[@id=\\'current-view-component\\']/div/div/div[2]/div/div[1]/div/div[1]/div[8]/div/div/div[1]/div/div/div/div/div/div/div/a")
		public static WebElement popupOption4;
		
		
		
		
		
	}


