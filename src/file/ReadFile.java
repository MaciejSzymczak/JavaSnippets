package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	private static FileReader fr;	

	public static void main(String[] args) {
		try {
			fr = new FileReader("c:\\test.csv");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while( (s = br.readLine()) != null) {
			    System.out.println(s);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
