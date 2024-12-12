package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_fb_Account {

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
				driver.navigate().to("https://www.facebook.com/r.php");

				//declarations 		//identification
				WebElement Prenom=driver.findElement(By.name("firstname"));
				WebElement Nom=driver.findElement(By.name("lastname"));
				WebElement day=driver.findElement(By.id("day"));
				WebElement month=driver.findElement(By.id("month"));
				WebElement year=driver.findElement(By.id("year"));
			    WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
				WebElement mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
				WebElement Password=driver.findElement(By.id("password_step_input"));
				WebElement Submit=driver.findElement(By.xpath("//button[@name='websubmit']"));
				//action
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
				Submit.click();

				//resultat
				System.out.println("test ok");


	}

}
