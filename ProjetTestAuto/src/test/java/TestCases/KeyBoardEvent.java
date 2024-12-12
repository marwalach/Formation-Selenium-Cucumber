package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyBoardEvent {

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
		driver.navigate().to("https://demoqa.com/text-box");

		//declarations 		//identification
		WebElement FullName=driver.findElement(By.id("userName"));
		WebElement Email=driver.findElement(By.id("userEmail"));
		WebElement CurrentAdress=driver.findElement(By.id("currentAddress"));
		WebElement PermanentAdress=driver.findElement(By.id("permanentAddress"));
		WebElement Submit=driver.findElement(By.id("submit"));

		
		//action
		FullName.sendKeys("Lachiheb Marwa");
		Email.sendKeys("marwa.lachiheb@gmail.com");
		CurrentAdress.sendKeys("ezzahra Ben-arous Tunis Bengardenne 4160");
		
		Actions action = new Actions(driver);
		action.keyDown(CurrentAdress,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(PermanentAdress,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();	
		Submit.click();
		String ResultatAttendue = "Tunis";
		//String ResultatObtenue = PermanentAdress.getText();
		WebElement AffichageObtenue=driver.findElement(By.xpath("//p[@id='permanentAddress']"));
		
		Assert.assertTrue(AffichageObtenue.getText().contains(ResultatAttendue));		
		//Result
		System.out.println(AffichageObtenue.getText());

		System.out.println("Test Ok");
	}

}
