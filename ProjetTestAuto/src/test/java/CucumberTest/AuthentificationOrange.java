package CucumberTest;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationOrange {
	WebDriver driver;

	@Given("ouvrir navigateur chrome")
	public void ouvrir_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("ouvrir URL")
	public void ouvrir_url() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	   
	}

	@When("Saisir Login")
	public void saisir_login() {
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
	}

	@When("Saisir mot de passe")
	public void saisir_mot_de_passe() {
		WebElement pass = driver.findElement(By.name("passwrd"));
		pass.sendKeys("admin123");


	    
	}

	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
		WebElement BT_Log=driver.findElement(By.xpath("//button[@type='submit']"));
		BT_Log.click();

	}

	@Then("verifier ouverture de page d'acceuil")
	public void verifier_ouverture_de_page_d_acceuil() {
		String Resultat_Attendue = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" ;
		String Resultat_Obtenue=driver.getCurrentUrl();
		Assert.assertEquals(Resultat_Attendue, Resultat_Obtenue);
	}

	@Then("verifier nom de profil")
	public void verifier_nom_de_profil() {
		String Resultat_Attendue = "manda user" ;
		String Resultat_Obtenue= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		Assert.assertEquals(Resultat_Attendue, Resultat_Obtenue);  
	}

}
