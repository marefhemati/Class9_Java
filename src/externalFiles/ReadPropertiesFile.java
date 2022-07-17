package externalFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
//Interview Question: What does throw and throws do?
//Throw allows a programmer to throw an error in any where in program on .
//Throws is handle with checked exception and it goes next to method name.
	public static void main(String[] args) throws IOException {
 	
		//String path = "C:\\WorkSpace\\Class9\\data\\info.properties";// it's called absolute path, in order that we share it 
		//we should make it easy and we can take away the desktop location just leave the eclips location like below.
		
		String path = "data\\info.properties";
		FileInputStream fi = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fi);
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("username"));

	}

}
