package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Jobs {
	WebDriver driver;
	By skillInput = By.name("qp");
	By locality = By.name("ql");
	By searchBtn = By.id("qsbFormBtn");
	public Jobs(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSearchDetails(String skillName, String localityname) throws InterruptedException {
		driver.findElement(skillInput).sendKeys(skillName);
		driver.findElement(locality).sendKeys(localityname);
		driver.findElement(searchBtn).click();
		Thread.sleep(2000);
	}
	
	
	public void applyJob() throws InterruptedException {
		driver.navigate().to("https://www.naukri.com/job-listings-fullstack-senior-java-automotive-robotics-india-pvt-ltd-bangalore-bengaluru-0-to-1-years-220722502354");
		Thread.sleep(2000);
		driver.findElement(By.className("save-job-button")).click();
	}
	
}
