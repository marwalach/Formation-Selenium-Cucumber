package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.junit.Assert;
public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				//chemin chromedriver
						System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
						//ouvrir chrome
						WebDriver navigateur=new ChromeDriver();
						// agrandir fenetre
						navigateur.manage().window().maximize();
						//ouvrir url
						//driver.get("https://www.google.com/");
						navigateur.navigate().to("https://demoqa.com/buttons");
						//sleep 5s
						Thread.sleep(5000);
						//declaration
						WebElement BT_Right;
						//identification
						BT_Right= navigateur.findElement(By.id("rightClickBtn"));
						//action
						Actions action= new Actions(navigateur);
						action.contextClick(BT_Right).perform();
						//resultat
						String resultat_attendue="You have done a right click";
						String resultat_obtenue;
						resultat_obtenue=navigateur.findElement(By.id("rightClickMessage")).getText();
						Assert.assertEquals(resultat_obtenue, resultat_attendue);				
						System.out.println("Test OK");			
						//close
						//navigateur.close();
	}

}
