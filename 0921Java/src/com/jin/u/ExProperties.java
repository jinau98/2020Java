package com.jin.u;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExProperties {
	public static void main(String[] args) throws IOException{
		Properties prop = new Properties();
		
		prop.load(new FileReader("src/com/jin/u/application.properties"));
		
		String driver=prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		
		System.out.println("driver = " + driver);
		System.out.println("url = " + url);
		System.out.println("user = " + user);
		System.out.println("password = " + password);
		
		prop.storeToXML(new FileOutputStream("dbconf.xml"), "Database Configuration");
	}
}
