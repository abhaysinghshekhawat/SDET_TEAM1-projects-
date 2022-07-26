package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Jobs;
import pages.Login;
import pages.Recruiters;
import pages.Services;
import pages.Tools;
import pages.company;
import utilities.ExcelUtil;

public class Handlers {
	static String id = "chauhanruchita27@gmail.com";
	static String pass = "Ruchita@2799";
	
public static void navigation(String url,WebDriver d) {
		d.navigate().to(url);
	}
	
public static void  login(WebDriver driver) throws InterruptedException {
		
		Login loginpage = new Login(driver);
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		loginpage.enterUser(id);
		loginpage.enterPassword(pass);
		loginpage.loginClick();
		Thread.sleep(2000);
	}

public static void checkAuthentication() throws Exception {
	WebDriver driver = new FirefoxDriver();
	Login loginpage = new Login(driver);
	driver.get("https://www.naukri.com/nlogin/login");
	Thread.sleep(2000);
	ExcelUtil xl = new ExcelUtil();
	xl.setUp("src/utilities/data.xlsx", "data");
	int rc = xl.rowCount();
	for(int i=1; i<=rc; i++) {
		loginpage.clearUser();
		loginpage.clearpass();
		String userName = xl.getCell(i, 0);
		String password = xl.getCell(i, 1);
		loginpage.enterUser(userName);
		loginpage.enterPassword(password);
		Thread.sleep(1500);
		driver.findElement(By.id("loginForm")).submit();
		Thread.sleep(1000);
		
		String currUrl = driver.getCurrentUrl();
		if(currUrl.equalsIgnoreCase("https://www.naukri.com/mnjuser/homepage")) {
			System.out.println(userName + "with password " + password + " is a valid User");
		}else {
			System.out.println(userName + "with password " + password + " is not a valid User");
		}
		Thread.sleep(2000);
		driver.close();
			
	}	
}

public static void companyy(WebDriver driver) throws InterruptedException {
	company companies=new company(driver);
	companies.entercompany("Amazon","Flipkart");
	companies.reviewwrite("Zomato","Software Developer","Customer Assurance");
}

public static void jobs(WebDriver driver) throws InterruptedException {
	Jobs j = new Jobs(driver);
	j.enterSearchDetails("Java", "Banglore");
	j.applyJob();
	driver.navigate().back();
	
}

public static void tools(WebDriver driver)throws InterruptedException {
	Tools toolsPage=new Tools(driver);
	Thread.sleep(4000);
	driver.findElement(By.partialLinkText("Check More")).click();
	Thread.sleep(2000);
	toolsPage.exploreDemand("java");
	Thread.sleep(4000);
	navigation("https://insights.naukri.com/career-tools",driver);
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Check More")).click();
	Thread.sleep(2000);
	toolsPage.skillByRoll("Javascript Developer");
	toolsPage.naukriLabs();
	Thread.sleep(1000);
	navigation("https://insights.naukri.com/career-tools",driver);
	Thread.sleep(1000);
	toolsPage.careerTrajectory("btech","cse","iit roorkee","mba","management","iim bangalore","business analyst","flipkart","product manager","adobe");
}
public static void recruit(WebDriver driver) throws InterruptedException {
	Thread.sleep(4000);
	driver.navigate().to("https://www.naukri.com/recruiters");
	Recruiters rec=new Recruiters(driver);
	rec.follow();
	Thread.sleep(1000);
	rec.searchrec();
	rec.clicksrh();
	Thread.sleep(1000);
	rec.filter();
	Thread.sleep(1000);
	rec.refine();
	Thread.sleep(1000);
	rec.sndp();
}
public static void service(WebDriver driver)throws InterruptedException{
	Services ser=new Services(driver);
	driver.navigate().to("https://resume.naukri.com/resume-services?fftid=100001&id=");
	ser.nav();
}

}
