package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectMenu {

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
		driver.navigate().to("https://demoqa.com/select-menu");

		//declarations 		//identification
		WebElement OldMenu=driver.findElement(By.id("oldSelectMenu"));

		//action
		Select List = new Select(OldMenu);
		//List.selectByValue("6");
		List.selectByVisibleText("Green");
		//resultat
		System.out.println("test ok");


	}

}
