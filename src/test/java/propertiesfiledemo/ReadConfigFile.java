package propertiesfiledemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties properties;
	
	String path = "C:\\Users\\Tech Bazaar\\eclipse-workspace\\Zerodha\\src\\test\\java\\PropertiesFileDemo\\configText.txt";
	
	public ReadConfigFile() throws IOException  {
		
		properties = new Properties();
		
		FileInputStream file = new FileInputStream(path);
		
		properties.load(file);
		
		}
		
     public String getUrl() {
	   String url = properties.getProperty("url");
	   if(url!=null)
		   return url;
	   else
		   throw new RuntimeException("url not specified  in confing file.");
	   
     }
     public String getUserName() {
  	   String username = properties.getProperty("username");
  	 if(username!=null)
  		return username; 
	   else
		   throw new RuntimeException("username not specified  in confing file.");
	   
	  }
     public String getPassword() {
    	   String password = properties.getProperty("password");
    	   if(password!=null)
    	  		return password;
    		   else
    			   throw new RuntimeException("password not specified  in confing file.");
    	   }		  
     }
