package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Tools {
	WebDriver driver;
	JavascriptExecutor js;
	
	public Tools(WebDriver driver) {
		this.driver=driver;
		JavascriptExecutor js=(JavascriptExecutor) driver;
	}
	
	
	public void exploreDemand(String str) throws InterruptedException{
		driver.findElement(By.xpath("//input[@class='Search_input__20OGL']")).sendKeys(str);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='Search_submitButton__1Azjz']")).click();
		Thread.sleep(2000);
	}
	
//	public void checkDemandForUrSkill(String skill) {
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(skill);
//		js.executeScript("document.querySelector('.know-demand').children[2].click();");
//		
//	}
	
	public void skillByRoll(String str)throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/career-tools/tech-careers']")).click();
		Thread.sleep(2000);
		WebElement wb=driver.findElement(By.cssSelector("input[type='text']"));
		wb.sendKeys(str);
		Thread.sleep(2000);
		driver.navigate().to("https://insights.naukri.com/career-tools/tech-careers/how-to-become-javascript-developer");
		Thread.sleep(2000);
//		js.executeScript("document.querySelector('.input-container').childern[2].click();");
	}
	
	public void naukriLabs() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/career-tools/naukriLab']")).click();
		driver.navigate().to("http://insights.naukri.com/salarytrend/");
		Thread.sleep(2000);
	}
	public void careerTrajectory(String ug_course,String branch,String institute,String pg_course,String pg_spec,String pg_ins,String last2,String company2,String last,String company) throws InterruptedException {
		driver.navigate().to("http://insights.naukri.com/naukri-trajectory/");
		driver.findElement(By.id("ug_course")).sendKeys(ug_course);
		Thread.sleep(1000);
		driver.findElement(By.id("ug_specialization")).sendKeys(branch);
		Thread.sleep(1000);
		driver.findElement(By.id("ug_institute")).sendKeys(institute);
		Thread.sleep(1000);
		driver.findElement(By.id("pg_course")).sendKeys(pg_course);
		Thread.sleep(1000);
		driver.findElement(By.id("pg_specialization")).sendKeys(pg_spec);
		Thread.sleep(1000);
		driver.findElement(By.id("pg_institute")).sendKeys(pg_ins);
		Thread.sleep(1000);
		driver.findElement(By.id("second_designation")).sendKeys(last2);
		Thread.sleep(1000);
		driver.findElement(By.id("second_org")).sendKeys(company2);
		Thread.sleep(1000);
		driver.findElement(By.id("last_designation")).sendKeys(last);
		Thread.sleep(1000);
		driver.findElement(By.id("last_org")).sendKeys(company);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("end");
	}

}