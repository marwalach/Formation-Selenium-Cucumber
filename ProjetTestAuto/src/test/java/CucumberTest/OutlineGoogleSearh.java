package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OutlineGoogleSearh {
	WebDriver driver;

@Given("open le navigateur chrome")
	public void open_le_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

@Given("saisir lurl  {string}")
public void saisir_lurl(String string) {
	driver.get(string);

}

@When("Taper le mot a chercher {string} in step")
public void taper_le_mot_a_chercher_in_step(String string) {
	WebElement Search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	Search.sendKeys(string);
    
}

@When("Taper enter")
public void taper_entrer() {
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
    
}

@Then("verifier le mot {string} in step")
public void verifier_le_mot_in_step(String string) {
	WebElement result= driver.findElement(By.xpath("//div[@class='TzHB6b j8lBAb p7kDMc Hwkikb WY0eLb LMRCfc EqrSYc']//span[@class='mgAbYb OSrXXb RES9jf pb3iw']"));
	Assert.assertTrue(result.getText().contains(string));		
	System.out.println("Test Ok");
}



}