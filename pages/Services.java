package pages;

import org.openqa.selenium.WebDriver;

public class Services {
	WebDriver driver;
	public Services(WebDriver driver) {
		this.driver=driver;
	}
	public void nav() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.className("Services")).click();
		driver.navigate().to("https://resume.naukri.com/visual-resume-writing-services?fftid=101002");
		Thread.sleep(1000);
		driver.navigate().back();
	    driver.navigate().to("https://resume.naukri.com/resume-quality-score?fftid=101003");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().to("https://resume.naukri.com/subscription-product?fftid=101025");
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().to("https://www.naukri.com/learning/data-science-courses-certification-training-ct123?utm_source=naukri&utm_medium=naukri_gnb&utm_content=naukri_gnb&utm_campaign=naukri_gnb_top&fftid=naukri_gnb");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().to("https://www.naukri.com/learning/what-is-data-science-ct123#description");
		Thread.sleep(2000);		
	}
}