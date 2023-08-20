package com.springjdbc.employee.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "datasource.postgres")
public class PostgresConfigurationProperties {

    private String username;
    private String url;
    private String password;
    private String drivername;

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getUrl() {
	return url;
    }

    public void setUrl(String url) {
	this.url = url;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getDrivername() {
	return drivername;
    }

    public void setDrivername(String drivername) {
	this.drivername = drivername;
    }

}
