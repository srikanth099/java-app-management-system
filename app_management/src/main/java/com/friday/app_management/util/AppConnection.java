package com.friday.app_management.util;

import java.util.Properties;

public class AppConnection {

	public static Properties TakeDbProperties() {
		
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/app_management");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "root");
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}
}
