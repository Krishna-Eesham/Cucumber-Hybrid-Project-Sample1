package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties init_pr() throws IOException {
		
		Properties Prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/test/resources/config/config.properties");
		Prop.load(fis);
		return Prop;
	
		
	}

}
