package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import handlers.Handlers;


public class Testing {
	static String id = "chauhanruchita27@gmail.com";
	static String pass = "Ruchita@2799";
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/usr/bin/deadshot");
		
		try {
		Handlers.checkAuthentication();
		}catch(Exception e) {
			e.printStackTrace();
	}
		WebDriver driver = new FirefoxDriver();
		Handlers.login(driver);
		Thread.sleep(1500);
		Handlers.navigation("https://www.ambitionbox.com/list-of-companies?utm_source=naukri&utm_medium=gnb",driver);
		Thread.sleep(2000);
		try {
 		Handlers.companyy(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
 		Thread.sleep(1500);
		Handlers.navigation("https://insights.naukri.com/careertools",driver);
		Thread.sleep(1500);
		try {
		Handlers.tools(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1500);
		Handlers.navigation("https://www.naukri.com/browse-jobs",driver);
 		Thread.sleep(2000);
 		try {
		Handlers.jobs(driver);	
 		}catch(Exception e) {
 			e.printStackTrace();
 		}
 		Thread.sleep(1500);
 		
 		try {
 			Handlers.recruit(driver);
 		}catch(Exception e) {
 			e.printStackTrace();
 		}
 		
 		Thread.sleep(1500);
 		try {
 			Handlers.service(driver);
 		}catch(Exception e) {
 			e.printStackTrace();
 		}

	}
}








