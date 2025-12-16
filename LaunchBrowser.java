package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		// Instantiative the browser driver
		ChromeDriver driver=new ChromeDriver() ;
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//get the tilte
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		// Enter login credentials
		driver.findElement(By.id("username")).sendKeys("democsr2");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//Open CRMSFA

		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhan");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jeg");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("cts");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Create_Lead_Assignment");
		driver.findElement(By.className("smallSubmit")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.close();
	}





}
