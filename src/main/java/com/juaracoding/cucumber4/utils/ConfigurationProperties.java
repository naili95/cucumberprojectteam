package com.juaracoding.cucumber4.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${txtTitleBookingPage}")
	private String txtTitleBookingPage;
	
	public String getBrowser() {
		return browser;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getTxtWelcome() {
		return txtWelcome;
	}
	
	public String getTxtTitleBookingPage() {
		return txtTitleBookingPage;
	}

}
