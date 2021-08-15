package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Create New Account
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vijay");
		driver.findElement(By.name("lastname")).sendKeys("Pandi");
		driver.findElement(By.name("reg_email__")).sendKeys("dmj6718@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("dmj6718@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Vijay@1987");
		
		
		WebElement bDay = driver.findElement(By.id("day"));
		Select bDaySel=new Select(bDay);
		bDaySel.selectByValue("3");
		
		WebElement bMonth = driver.findElement(By.id("month"));
		Select bMonthSel=new Select(bMonth);
		bMonthSel.selectByValue("12");
		
		WebElement bYear = driver.findElement(By.id("year"));
		Select bYearSel=new Select(bYear);
		bYearSel.selectByValue("1987");
		
		driver.findElement(By.name("sex")).click();

	}

}
