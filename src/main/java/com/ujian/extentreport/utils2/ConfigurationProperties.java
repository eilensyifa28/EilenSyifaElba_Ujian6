package com.ujian.extentreport.utils2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${username}")
	private String userName;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${displayname}")
	private String displayName;
	
	@Value("${displaynamedashboard}")
	private String displayNameDashboard;
	

	@Value("${displaynamepost}")
	private String displayNamePost;

	@Value("${search}")
	private String search;
	
	@Value("${searchshoes}")
	private String searchshoes;
	
	public String getBrowser() {
		return browser;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public String getDisplayNameDashboard() {
		return displayNameDashboard;
	}
	
	public String getDisplayNamePost() {
		return displayNamePost;
	}
	
	public String getSearchshoes() {
		return searchshoes;
	}

	public String getSearch() {
		return search;
	}
}
