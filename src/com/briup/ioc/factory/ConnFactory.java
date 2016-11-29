package com.briup.ioc.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnFactory implements FactoryBean<Connection>{
	private String driver;
	private String url;
	private String user;
	private String pwd;
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public ConnFactory(){}
	
	/**
	 * spring 知道是该工厂需要返回什么产品（对象）
	 */
	@Override
	public Connection getObject() throws Exception {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,user,pwd);
		return conn;
	}
	
	@Override
	public Class<Connection> getObjectType() {
		// TODO Auto-generated method stub
		return Connection.class;
	}
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
