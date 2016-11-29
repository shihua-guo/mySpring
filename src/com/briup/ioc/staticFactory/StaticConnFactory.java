package com.briup.ioc.staticFactory;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class StaticConnFactory {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url= "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="woss";
	private static String pwd="root";
	
	/**
	 * 获取连接的方法
	 */
	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,user,pwd);
		return conn;
	}
}
