package javaPackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	
private static Properties prop=new Properties();
private static final String FILE_NAME="Test.properties";

public Config() {
	InputStream input=Config.class.getClassLoader().getResourceAsStream(FILE_NAME);
	
	try {
		prop.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Error readding testproperty"+e.getMessage());
	}
	
}

public static String getProperty(String propertyname) {
	
	return prop.getProperty(propertyname);
	
	
	
}

public static String getAppurl(String sAppname) {
	String sUrlvalue=null;
	
	if(sAppname.equals("parabank")) {
		
		sUrlvalue=getProperty("parabankappUrl");
		
	}
  if(sAppname.equals("google")) {
		
		sUrlvalue=getProperty("googleurl");
		
	}
  return sUrlvalue;
}

}
