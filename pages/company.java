package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class company {
WebDriver driver;
JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By srchcompany = By.name("CompanyName");
	By srchbtn=By.className("component-search-btn");
	By compare=By.className("compare-btn__text");
	By opponent=By.id("company");
	By flipkart=By.xpath("//img[@src='https://static.ambitionbox.com/alpha/company/photos/logos/flipkart-28.jpg\']");
	
	//review ones
	By toggle=By.className("togglebtn");
	By cmpname=By.id("CompanyName");
	By position=By.id("JobProfileName");
	By rating=By.xpath("//label[@for='OverallCompanyRating-stars-3']");
	By wrbal=By.xpath("//label[@for='WorkSatisfactionRating-stars-4']");
	By salary=By.xpath("//label[@for='CompensationBenefitsRating-stars-5']");
	By growth=By.xpath("//label[@for='CareerGrowthRating-stars-2']");
	By security=By.xpath("//label[@for='JobSecurityRating-stars-3']");
	By skill=By.xpath("//label[@for='SkillDevelopmentRating-stars-5']");
	By satisfaction=By.xpath("//label[@for='WorkLifeRating-stars-4']");
	By culture=By.xpath("//label[@for='CompanyCultureRating-stars-5']");
	
	By textarea=By.className("textarea-el");
	By txtarea2=By.name("DisLikesText");
	
//	By dept=By.id("Division");
	By policy=By.xpath("//label[@for='TravelTags1']");   //travelling for work
	By wrkday=By.xpath("//label[@for='WorkDays0']"); //working days
	By hour=By.xpath("//label[@for='WorkTimeMonitor0']"); //working hours
	By timings=By.id("WorkTimeStart");
	
	By curr=By.xpath("//label[@for='CurrentJob0']"); // ,currently workhere
	By mode=By.partialLinkText("Hybrid");
	By dept=By.id("Division");
//	By submit=By.className("ctas-btn-medium largeText");
	
	
	
	
	public company(WebDriver driver) {
		this.driver = driver;
	}
	
	public void entercompany(String compname,String oppcomp) throws InterruptedException {
		driver.findElement(srchcompany).sendKeys(compname);
		driver.findElement(srchbtn).click();
		Thread.sleep(2500);
		driver.findElement(compare).click();	
		Thread.sleep(2500);
		driver.findElement(opponent).sendKeys(oppcomp);	
		Thread.sleep(2500);
		driver.findElement(flipkart).click();
//		Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	public void reviewwrite(String comp,String pos,String dpt) throws InterruptedException {
		driver.navigate().to("https://www.ambitionbox.com/contribute/company-review-v2?utm_source=naukri&utm_medium=gnb");
		driver.findElement(toggle).click();
		Thread.sleep(1500);
		driver.findElement(cmpname).sendKeys(comp);
		Thread.sleep(1500);
		driver.findElement(position).sendKeys(pos);
		driver.findElement(wrbal).click();
		Thread.sleep(1500);
		driver.findElement(rating).click();
		Thread.sleep(1500);
		driver.findElement(salary).click();
		Thread.sleep(1500);
		driver.findElement(growth).click();
		Thread.sleep(1500);
		driver.findElement(security).click();
		Thread.sleep(1500);
		driver.findElement(skill).click();
		Thread.sleep(1500);
		driver.findElement(satisfaction).click();
		Thread.sleep(1500);
		driver.findElement(culture).click();
		Thread.sleep(1500);
		
		driver.findElement(textarea).sendKeys("Overall Good Company, Implements Great Work culture,Work life balance and salary are also satisfactory.");
		Thread.sleep(2000);
		driver.findElement(txtarea2).sendKeys("Delayed Appraisals and slow increments");
		Thread.sleep(2000);
//		driver.findElement(radio).click();
		driver.findElement(policy).click();
		Thread.sleep(2000);
		driver.findElement(wrkday).click();
		Thread.sleep(2000);
		driver.findElement(hour).click();
		Thread.sleep(2000);
	}
}
		
//		Select unit=new Select(dri…