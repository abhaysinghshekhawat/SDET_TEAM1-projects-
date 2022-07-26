package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	By userInput = By.id("usernameField");
	By passInput = By.id("passwordField");
	By loginBtn = By.className("blue-btn");
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUser(String usrName) {
		driver.findElement(userInput).sendKeys(usrName);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(passInput).sendKeys(pass);
	}
	
	public void loginClick() {
		driver.findElement(loginBtn).click();
	}
	
	public void clearUser() {
		driver.findElement(userInput).clear();
	}
	
	public void clearpass() {
		driver.findElement(passInput).clear();
	}
	

}
