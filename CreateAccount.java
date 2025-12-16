package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/main");
		dr.manage().window().maximize();
		dr.findElement(By.id("username")).sendKeys("democsr2");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.partialLinkText("CRM")).click();
		dr.findElement(By.linkText("Accounts")).click();
		dr.findElement(By.linkText("Create Account")).click();
		dr.findElement(By.id("accountName")).sendKeys("nandhini");
		dr.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		dr.findElement(By.name("numberEmployees")).sendKeys("20");
		dr.findElement(By.name("officeSiteName")).sendKeys("leafTaps");
		dr.findElement(By.className("smallSubmit")).click();
		dr.close();
	}

}
