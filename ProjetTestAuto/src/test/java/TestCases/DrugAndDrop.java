package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class DrugAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//chemin de webdriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouvrir chrome
		WebDriver driver=new ChromeDriver(); 
		
		//agrandir fenetre
		driver.manage().window().maximize();
		
		//ouvrir url
		driver.navigate().to("https://demoqa.com/droppable/");
		Thread.sleep(5000);
		
		//declarations
		WebElement BT_Drag;
		WebElement BT_Drop;
		
		//identification
		BT_Drag= driver.findElement(By.id("draggable"));
		BT_Drop= driver.findElement(By.id("droppable"));
		
		//action
		Actions action= new Actions(driver);
		action.dragAndDrop(BT_Drag, BT_Drop).build().perform();
		
		//résultat
		String resultat_attendue="Dropped!";
		String resultat_obtenue;
		resultat_obtenue=driver.findElement(By.id("droppable")).getText();
		Assert.assertEquals(resultat_obtenue, resultat_attendue);				
		System.out.println("Message OK");
		
		
		String Couleur_Attendue ="#4682b4";
		//String Couleur_Obtenue_rgb = BT_Drop.getCssValue("background-color");
		String Couleur_Obtenue_Hex= Color.fromString(BT_Drop.getCssValue("background-color")).asHex();
		Assert.assertEquals(Couleur_Attendue, Couleur_Obtenue_Hex);	
		System.out.println("Couleur OK");
	}

}
