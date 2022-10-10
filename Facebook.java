package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		
		search.click();
		
		Thread.sleep(5000);
		
		WebElement fname=driver.findElement(By.name("firstname"));
		
		fname.sendKeys("Prateek");
		
		WebElement lname=driver.findElement(By.name("lastname"));
		
		lname.sendKeys("Meti");
		
		WebElement phoneno=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
		
		phoneno.sendKeys("7892508374");
		
		WebElement password=driver.findElement(By.id("password_step_input"));
		
		password.sendKeys("Pratheekm@9923");
		
		WebElement date=driver.findElement(By.id("day"));
		
		Select sel1=new Select(date);
		
	    sel1.selectByIndex(2);
	    
        WebElement month=driver.findElement(By.id("month"));
		
		Select sel2=new Select(month);
		
	    sel2.selectByValue("2");
	    
	    WebElement year=driver.findElement(By.id("year"));
	    
	    Select sel3=new Select(year);
	    
	    sel3.selectByVisibleText("1999");
	    
	    WebElement male=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
	    
	    male.click();
	}
}
