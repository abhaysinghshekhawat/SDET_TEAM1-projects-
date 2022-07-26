package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recruiters {
	WebDriver driver;
	public Recruiters(WebDriver driver) {
		this.driver=driver;
	}
	
	public void follow() throws InterruptedException{
		driver.navigate().to("https://www.naukri.com/recruiters/santhoshkumaresan?xz=1_0_12&xid=165866292521582200&xp=1");
		driver.findElement(By.xpath("//button[@id='flwUnflw_1547612']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.naukri.com/recruiters");
	}
	public void searchrec() {
		driver.findElement(By.xpath("//input[@name='qp']")).sendKeys("Delhi");
	}
	public void clicksrh() {
		driver.findElement(By.xpath("//button[@id='qsbFormBtn']")).click();
	}
	public void filter() {
		driver.findElement(By.xpath("//em[@class='elip']")).click();
	}
	public void refine() {
		driver.findElement(By.xpath("//button[@id='clstr_btn']")).click();
	}
	public void sndp() {
		driver.findElement(By.xpath("//button[@id='srp_1422522']")).click();
	}
}