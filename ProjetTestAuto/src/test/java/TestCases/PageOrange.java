package TestCases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageOrange {
	public static void main(String[] args) throws InterruptedException {
		//chemin chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver=new ChromeDriver();
		// agrandir fenetre
		driver.manage().window().maximize();
		//ouvrir url
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//sleep 5s
		Thread.sleep(5000);
		//declaration
		WebElement user; 
		WebElement pass;
		WebElement BT_Log;
		//identification
		user = driver.findElement(By.name("username"));
		pass = driver.findElement(By.name("password"));
		BT_Log=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		//Action 		
		user.sendKeys("Admin");
		pass.sendKeys("admin123");
		BT_Log.click();
		Thread.sleep(5000);
		//Résultat
		String Resultat_Attendue = "Diego Pereira" ;
		String Resultat_Obtenue;
		//
		WebElement profil=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
		Resultat_Obtenue= profil.getText();
		
		Assert.assertEquals(Resultat_Attendue, Resultat_Obtenue);
		System.out.println("Test Ok");

		
		
	}

}

