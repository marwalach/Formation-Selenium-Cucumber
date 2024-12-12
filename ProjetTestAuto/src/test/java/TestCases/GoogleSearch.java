package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //CHEMIN E WEBDRIVER
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//agrandir fenetre
		driver.manage().window().maximize();
		//ouvrir URL
		driver.navigate().to("https://www.google.com/");

		//declarations 		//identification
		WebElement Search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		
		//action
		Search.sendKeys("tunis",Keys.ENTER);
		String URLAttendue = "https://www.google.com/search?q=tunis";
		//String ResultatObtenue = PermanentAdress.getText();
		//WebElement AffichageObtenue=driver.findElement(By.xpath("//p[@id='permanentAddress']"));
		Assert.assertTrue(driver.getCurrentUrl().contains(URLAttendue));		
	
		WebElement result= driver.findElement(By.xpath("//span[@class='gMZyfc']"));
		Assert.assertTrue(result.getText().contains("résultats "));		
		//Result
		
		
		
		System.out.println("Test Ok");
	}

}
