import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Read properties file.
		Properties properties = new Properties();
		try {
		    properties.load(new FileInputStream("filename.properties"));
		} catch (IOException e) {
		}
		
		properties.setProperty("ExampleParamName1", "ExampleParamValue1");

		// Write properties file.
		try {
		    properties.store(new FileOutputStream("filename.properties"), null);
		} catch (IOException e) {
		}
		
		System.out.println( properties.getProperty("ExampleParamName1") );
		
		//@@@todo
		//System.out.println( ResourceBundle.getBundle("ResourceBundle").getString("REPORT.URL").trim()  );

	}

}
