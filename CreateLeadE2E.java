package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadE2E {
	
	public void webElementEdit(ChromeDriver fDriverObj, String fLocators,String fLocatorValue,String fValue) {
		
		switch(fLocators) {
		case "ID": 
			fDriverObj.findElement(By.id(fLocatorValue)).sendKeys(fValue);
			break;
		case "CLASS": 
			fDriverObj.findElement(By.className(fLocatorValue)).sendKeys(fValue);
			break;
		case "LINKTEXT":
			fDriverObj.findElement(By.linkText(fLocatorValue)).sendKeys(fValue);
			break;

		default: 
		}
		
	}
	
	public void webElementClick(ChromeDriver fDriverObj, String fLocators,String fLocatorValue) {

		switch(fLocators) {
		case "ID": 
			fDriverObj.findElement(By.id(fLocatorValue)).click();
			break;
		case "CLASS": 
			fDriverObj.findElement(By.className(fLocatorValue)).click();
			break;
		case "LINKTEXT":
			fDriverObj.findElement(By.linkText(fLocatorValue)).click();
			break;

		default: 
		}
	}

	public void webElementDropDwn(ChromeDriver fDriverObj, String fLocators,String fLocatorValue, String fValue) {

		
		switch(fLocators) {
		case "ID": 
			WebElement dropDwnObj1 = fDriverObj.findElement(By.id(fLocatorValue));
			Select  dropDwn1=new Select(dropDwnObj1);
			dropDwn1.selectByVisibleText(fValue);
			break;
		case "NAME": 
			WebElement dropDwnObj2 = fDriverObj.findElement(By.id(fLocatorValue));
			Select  dropDwn2=new Select(dropDwnObj2);
			dropDwn2.selectByVisibleText(fValue);
			break;
		default: 
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Browser Title :" +driver.getTitle());
		
		CreateLeadE2E webEleEdit=new CreateLeadE2E();
		webEleEdit.webElementEdit(driver, "ID", "username", "demosalesmanager");
		webEleEdit.webElementEdit(driver, "ID", "password", "crmsfa");
		webEleEdit.webElementClick(driver, "CLASS", "decorativeSubmit");
		webEleEdit.webElementClick(driver, "LINKTEXT", "CRM/SFA");
		
		//Home Page
		String titleName="My Home | opentaps CRM";
		
		if (titleName.equals(driver.getTitle())) {
			 System.out.println("Home Page Opened");
		} else {
			System.exit(0);

		}
		webEleEdit.webElementClick(driver, "LINKTEXT", "Leads");
		
		// Leads Page
		titleName="My Leads | opentaps CRM";
		
		if (titleName.equals(driver.getTitle())) {
			 System.out.println("Leads Page Opened");
		} else {
			System.exit(0);

		}		
		webEleEdit.webElementClick(driver, "LINKTEXT", "Create Lead");

		//Create Leads
		titleName="Create Lead | opentaps CRM";
		
		if (titleName.equals(driver.getTitle())) {
			 System.out.println("Create Leads Page Opened");
		} else {
			System.exit(0);

		}		
		
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_companyName", "IIT");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_firstName", "Vijay");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_lastName", "Pandi");
		webEleEdit.webElementDropDwn(driver, "ID", "createLeadForm_dataSourceId", "Conference");
		webEleEdit.webElementDropDwn(driver, "ID", "createLeadForm_marketingCampaignId", "Catalog Generating Marketing Campaigns");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_firstNameLocal", "Vijay");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_lastNameLocal", "P");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_personalTitle", "MR");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_birthDate", "03/12/1987");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_birthDate", "03/12/1987");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalProfTitle", "Vijaii");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_departmentName", "IT");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_annualRevenue", "10000");
		webEleEdit.webElementDropDwn(driver, "ID", "createLeadForm_currencyUomId", "INR - Indian Rupee");
		webEleEdit.webElementDropDwn(driver, "ID", "createLeadForm_industryEnumId", "Aerospace");
		webEleEdit.webElementDropDwn(driver, "ID", "createLeadForm_ownershipEnumId", "Partnership");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_numberEmployees", "1000");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_sicCode", "09");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_tickerSymbol", "AB");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_description", "NA");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_importantNote", "NA");
		
		//Contact Info
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryPhoneCountryCode", "4");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryPhoneAreaCode", "09");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryPhoneAskForName", "None");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryEmail", "dmj6718@gmail.com");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryWebUrl", "facebook/vijaii87");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryWebUrl", "facebook/vijaii87");
		
		//Primary Address
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalToName", "VIJAYAKUMAR P");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalAttnName", "VIJAYAKUMARP");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryPhoneNumber", "9080669208");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_primaryPhoneExtension", "91");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalAddress1", "Jothiba Avenue");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalAddress2", "1st Floor");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalCity", "Chengelpattu");
		webEleEdit.webElementDropDwn(driver, "ID", "createLeadForm_generalCountryGeoId", "India");
		webEleEdit.webElementDropDwn(driver, "ID", "createLeadForm_generalStateProvinceGeoId", "TAMILNADU");
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalPostalCode", "603");
		
		webEleEdit.webElementEdit(driver, "ID", "createLeadForm_generalPostalCodeExt", "3");
//	driver.findElement(By.className("smallSubmit")).click();		
		
		webEleEdit.webElementClick(driver, "CLASS", "smallSubmit");
		//TimeUnit.SECONDS.sleep(5);
		//View Lead | opentaps CRM
		titleName="My Leads | opentaps CRM";
		
		if (titleName.equals(driver.getTitle())) {
			 System.out.println("Leads Created successfully");
		} else {
			System.out.println("Leads is not Created");

		}			
		 
		
	}

}

