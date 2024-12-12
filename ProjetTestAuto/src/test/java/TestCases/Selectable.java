package TestCases;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //CHEMIN E WEBDRIVER
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver=new ChromeDriver();
		//agrandir fenetre
		driver.manage().window().maximize();
		//ouvrir URL
		driver.navigate().to("https://demoqa.com/menu");
		Thread.sleep(5000);

		//declarations 		//identification
		WebElement item2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		WebElement Subitem2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));

		//action
		Actions action = new Actions(driver);
		action.moveToElement(item2).perform();
		action.moveToElement(Subitem2).perform();
		//resultat
		System.out.println("test ok");

		
	}

}
