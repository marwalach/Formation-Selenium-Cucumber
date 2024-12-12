package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbAccount {
WebDriver driver;
@Given("ouvrir chrome")
public void ouvrir_chrome() {
	
	System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@Given("ouvrir URL FB")
public void ouvrir_url_fb() {
	
	driver.navigate().to("https://www.facebook.com/r.php");

}

@When("Saisir Prenom, Nom, day, month,year, gender, mail, password")
public void saisir_prenom_nom_day_month_year_gender_mail_password() {
	WebElement Prenom=driver.findElement(By.name("firstname"));
	WebElement Nom=driver.findElement(By.name("lastname"));
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
    WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
	WebElement mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	WebElement Password=driver.findElement(By.id("password_step_input"));
	Select dayList = new Select(day);
	Select monthList = new Select(month);
	Select yearList = new Select(year);
	Prenom.sendKeys("Marwa");
	Nom.sendKeys("Lachiheb");
	dayList.selectByVisibleText("10");
	monthList.selectByVisibleText("nov");
	yearList.selectByVisibleText("1990");
	gender.click();
	mail.sendKeys("marwa.lachiheb@gmail.com");
	Password.sendKeys("lachiheb");
}

@When("cliquer sur le bouton Submit")
public void cliquer_sur_le_bouton_submit() {
	WebElement Submit=driver.findElement(By.xpath("//button[@name='websubmit']"));
	//Submit.click();
	System.out.println("test ok");

}

@Then("verifier ouverture de page acceuil")
public void verifier_ouverture_de_page_acceuil() {
	System.out.println("test ok");

}



}
