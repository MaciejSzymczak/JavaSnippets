package file;

import java.io.File;
import java.util.Scanner;

public class FileExists {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the absolute path(File / Directory)");
 
        String filePath = scanner.next();
        File file = new File(filePath);
        if (file.exists())
            System.out.println("File Exists");
        else
            System.out.println("File doesn't exists");
        System.out.println("");
	}

}
