package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class TunisairSearchOutline {
	
	WebDriver driver;

	
	@Given("open chrome")
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Given("Get URL {string}")
	public void get_url(String string) {
		driver.get(string);
		

	}

	@When("choose VolsType {string}")
	public void choose_vols_type(String string) {
		System.out.println(string);
		
		if (string =="Aller-retour" ) { 
				WebElement VolsType=driver.findElement(By.id("edit-type-vol-aller-retour"));
		        VolsType.click();
		}
		
		 if (string =="Aller simple" ) { 
			    WebElement VolsType=driver.findElement(By.xpath("//label[@for='edit-type-vol-aller-simple']"));
			    VolsType.click();
	    }
		 
		 if (string =="Multi destinations" ) { 
			    WebElement VolsType=driver.findElement(By.id("edit-type-vol-multi-destinations"));
	            VolsType.click();
	    }
		
	}

	@When("choose Currency {string}")
	public void choose_currency(String string) {
		Select List = new Select(driver.findElement(By.id("edit-devise")));
		List.selectByVisibleText(string);

	}

	@When("click on DepartureVille and write {string}")
	public void click_on_departure_ville_and_write(String string) {	  
		WebElement Depart = driver.findElement(By.xpath("//fieldset[@class='js-form-item js-form-type-select form-type-select js-form-item-items-fieldset-group-0-depart form-item-items-fieldset-group-0-depart form-group']//span[@role='combobox']"));
        Depart.click();
        //Depart.clear();
        //Depart.sendKeys(string);
        
        WebElement SearchBox = driver.findElement(By.xpath("//input[@aria-label='Search']"));
        SearchBox.sendKeys(string+Keys.ENTER);
       // WebElement search = driver.findElement(By.xpath("//div[@class='box-pays']"));
        //Actions action = new Actions(driver);
		//action.moveToElement(search).perform();
        //search.click();

        //
	}

	@When("click on ArrivalVille and write {string}")
	public void click_on_arrival_ville_and_write(String string) throws InterruptedException {
		WebElement Arrival = driver.findElement(By.xpath("//fieldset[@class='js-form-item js-form-type-select form-type-select js-form-item-items-fieldset-group-0-destination form-item-items-fieldset-group-0-destination form-group']//span[@role='combobox']"));
		Arrival.click();
        WebElement SearchBox = driver.findElement(By.xpath("//input[@aria-label='Search']"));
        SearchBox.sendKeys(string+Keys.ENTER);
       // WebElement search = driver.findElement(By.xpath("//div[@class='box-pays']"));
        //search.click();
		//Arrival.clear();
		//Arrival.sendKeys(string);
        Thread.sleep(10000);
	}

	@When("click on calendar")
	public void click_on_calendar() {
		//edit-date
		WebElement Calendar=driver.findElement(By.id("edit-date"));
		Calendar.click();
	    
	}
	
	@When("choose Date début {string}")
	public void choose_date_début(String string) {
	    WebElement depart= driver.findElement(By.name("daterangepicker_start"));
	    depart.clear();
	    depart.sendKeys(string);
	    depart.sendKeys(Keys.ENTER);

	}

	@When("choose Date Retour {string}")
	public void chooset_date_retour(String string) {
		System.out.println("**********************"+ string +"********************");
		 WebElement Arrive= driver.findElement(By.name("daterangepicker_end"));
		 Arrive.clear();
		 Arrive.sendKeys(string);
		 Arrive.sendKeys(Keys.ENTER);

		

	}

	@When("click Valider la selection")
	public void click_valider_la_selection() {
		 WebElement valider= driver.findElement(By.xpath("//button[@class='applyBtn btn btn-sm btn-success']"));
		 valider.click();
	}

	@When("click on PassengerNumber")
	public void click_on_passenger_number() {
		
		 WebElement Passenger= driver.findElement(By.xpath("//label[@for='edit-passager']"));
		 Passenger.click();
	}

	@When("choose {string}")
	public void choose(String string) {
		 WebElement Passenger= driver.findElement(By.id("adulte_MP_cBdLN29i2"));
		 Passenger.clear();
		 Passenger.sendKeys(string);
		
	 
	}

	@When("click OK")
	public void click_ok() {
		WebElement Confirme= driver.findElement(By.xpath("//div[contains(@class,'modal-footer')]//button[contains(@type,'button')]"));
		Confirme.click();
	}

	@When("click SeeVol")
	public void click_see_vol() {
		WebElement SeeVol= driver.findElement(By.id("edit-actions-submit"));
		//SeeVol.click();
	}

	@Then("I verify the Search")
	public void i_verify_the_search() {
		System.out.println("Test Ok!");
	  
	}
}



/* 
 
 // And choose Currency "<currency>"
    //And click on DepartureVille and write "<Departville> "
    //And click on ArrivalVille and write "<Arrivalville> "
    //And click on calendar
    //And choose "<DeparturedateMonth>" and "<DeparturedateDay>"and "<ArrivaldateMonth>" an "<ArrivaldateDay>"
    //And click Valider la selection 
    //And click on PassengerNumber
    //And choose "<NumberPassenger>"
    //And click OK 
    /And click SeeVol      
 Examples: 
   |VolType      | currency | Departville  | Arrivalville |DeparturedateMonth | DeparturedateDay | ArrivaldateMonth | ArrivaldateDay |NumberPassenger|
   | Aller-retour |     TND  | Tunis        | Paris        |February           |       1          |       Mars       |    3           |         2      |
   | Aller simple |     EUR  | Paris        | NICE         |February           |       1          |       Mars       |    3           |         1     |


Examples: 
      | VolType      | 
      | Aller simple |    
      | Aller simple |  

      
*/
