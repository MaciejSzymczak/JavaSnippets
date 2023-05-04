package file;

import java.io.File;
import java.util.Scanner;

public class FileSize {
	
	public static void main(String[] args) {
        System.out.println("Enter the path of file");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.next();
        File fileToTest = new File(filePath);
 
        if (!fileToTest.isDirectory()) {
            System.out.println("Size of the File(In Bytes) is : "
                    + fileToTest.length());
        } else
        System.out.println("File with given path is a Directory");		
	}

}
