package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	FileInputStream file;
	public static Properties prop;
	public static WebDriver driver;
	
	public Testbase() {
		prop= new Properties();
		try {
		file = new FileInputStream("./src/main/java/com/properties/Propsfile");
		}
		
	catch(FileNotFoundException b){
		b.printStackTrace();		
	}
		try {
			prop.load(file);
		}
	catch(IOException b) {
		
		b.printStackTrace();
	}
	}
	
	public void Setup() {
		
		String browsername=prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("Chrome")) {
		 driver = new ChromeDriver();
	}
	else if (browsername.equalsIgnoreCase("Firefox")) {
		 driver = new FirefoxDriver();
	}
	
	else if (browsername.equalsIgnoreCase("Edge")) {
		 driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	}



