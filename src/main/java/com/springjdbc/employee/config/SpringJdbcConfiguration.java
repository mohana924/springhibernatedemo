package com.springjdbc.employee.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJdbcConfiguration {

    @Autowired
    private PostgresConfigurationProperties postgresConfigurationProperties;

    private JdbcTemplate jdbcTemplate;

    @Bean
    public DataSource postgresDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName(postgresConfigurationProperties.getDrivername());
	dataSource.setUrl(postgresConfigurationProperties.getUrl());
	dataSource.setUsername(postgresConfigurationProperties.getUsername());
	dataSource.setPassword(postgresConfigurationProperties.getPassword());

	return dataSource;
    }

    @Bean
    public JdbcTemplate postgresJdbcTemplate(@Qualifier("postgresDataSource") DataSource postgresDataSource) {
	jdbcTemplate = new JdbcTemplate(postgresDataSource);
	return jdbcTemplate;
    }
}
