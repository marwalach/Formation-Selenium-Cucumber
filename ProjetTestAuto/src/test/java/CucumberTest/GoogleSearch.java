package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {

WebDriver driver;

@Given("ouvrir navigateur")
public void ouvrir_navigateur() {
	System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Given("Saisir l'Url suivant {string}")
public void saisir_l_url_suivant(String string) {
	driver.get(string);
    
}

@When("Taper le mot a chercher {string}")
public void taper_le_mot_a_chercher(String string) {
	WebElement Search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	Search.sendKeys(string);
    
}

@When("Taper entrer")
public void taper_entrer() {
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
    
}

@Then("verifier le mot {string} dans la page affiché")
public void verifier_le_mot_dans_la_page_affiché(String string) {
	WebElement result= driver.findElement(By.xpath("//span[@class='gMZyfc']"));
	Assert.assertTrue(result.getText().contains(string));		
	System.out.println("Test Ok");
}
}
