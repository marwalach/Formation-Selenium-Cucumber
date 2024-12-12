package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chemin chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver=new ChromeDriver();
		// agrandir fenetre
		driver.manage().window().maximize();
		//ouvrir url
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");

		
		
	}

}
