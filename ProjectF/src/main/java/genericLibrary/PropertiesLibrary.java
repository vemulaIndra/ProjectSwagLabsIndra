package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLibrary implements FrameworkConstant {
	static FileInputStream fis;
	static FileOutputStream fos;
	static Properties property;
	public static String readdata(String Key) 
	{
		//Convert external file into java Readable
	    try {
			fis=new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Create an object for Properties class
	    property=new Properties();
		//Load the Properties
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Read the Data
		return property.getProperty(Key);
		
	}
	public static void writedata(String newkey,String newvalue) 
	{
		//Convert external file into java Readable
		 try {
			fis=new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Create an object for Properties class
		 property=new Properties();
		//Load the Properties
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Put the new data inside Properties file
		property.put(newkey, newvalue);
		//Convert java Readable into external file
		try {
			fos=new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Store the New data
		try {
			property.store(fos, "Updated New key And value....!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Writedata Successfull");
	}

}
