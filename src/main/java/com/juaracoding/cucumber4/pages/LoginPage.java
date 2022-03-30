package com.juaracoding.cucumber4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement inEmail;
	
	@FindBy(name = "password")
	WebElement inPass;
	
	@FindBy(css = "#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button")
	WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[1]/div/div[2]/div/div[2]/span")
	WebElement txtWelcome;
	
	public void submitLogin(String email, String password) {
		inEmail.sendKeys(email);
		inPass.sendKeys(password);
		btnLogin.click();
	}
	
	public String txtWelcome() {
		return txtWelcome.getText();
	}

}

