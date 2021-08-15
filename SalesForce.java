package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//UserFirstName-n34t
		driver.findElement(By.name("UserFirstName")).sendKeys("Vijay");
		driver.findElement(By.name("UserLastName")).sendKeys("Pandi");
		driver.findElement(By.name("UserEmail")).sendKeys("Vijay@ymail.com");
		
		WebElement bJobTitle = driver.findElement(By.name("UserTitle"));
		Select bJobTitleSel=new Select(bJobTitle);
		bJobTitleSel.selectByVisibleText("Customer Service Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("stc");
		driver.findElement(By.name("UserPhone")).sendKeys("9874563213");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		WebElement bEmployees = driver.findElement(By.name("CompanyEmployees"));
		Select bEmployeesSel=new Select(bEmployees);
		bEmployeesSel.selectByVisibleText("101 - 500 employees");
	
		WebElement bCountry = driver.findElement(By.name("CompanyCountry"));
		Select bCountrySel=new Select(bCountry);
		bCountrySel.selectByVisibleText("Albania");
		
		
		
		driver.close();
	}

}
