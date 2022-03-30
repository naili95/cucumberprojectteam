package com.juaracoding.cucumber4.step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber4.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber4.driver.DriverSingleton;
//import com.juaracoding.cucumber4.pages.LoginPage;
import com.juaracoding.cucumber4.utils.ConfigurationProperties;
import com.juaracoding.cucumber4.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class TestLogin {
	
	private WebDriver driver;
//	private LoginPage loginP;
	
	@Autowired
	ConfigurationProperties configP;
	
	@Before
	public void initObject() {
		DriverSingleton.getInstance(configP.getBrowser());
//		loginP = new LoginPage();
	}
	
	@After
	public void tutupBrowser() {
		driver.quit();
	}
	
	@Given("Customer akses url")
	public void customer_akses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer klik login button")
	public void customer_klik_login_button() {
//		loginP.submitLogin(configP.getEmail(), configP.getPassword());
		
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		driver.navigate().refresh();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		assertEquals(configP.getTxtWelcome(), loginP.txtWelcome());
		
	}

}
