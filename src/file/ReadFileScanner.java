package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileScanner {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the File path");
        String filePath = scanner.next();
 
        /*
         * Creates a new File instance by converting the given pathname string
         * into an abstract pathname.
         */
        File file = new File(filePath);
 
        Scanner scannerFile = null;
 
        try {
            /*
             * Constructs a new Scanner that produces values scanned from the
             * specified file. Bytes from the file are converted into characters
             * using the underlying platform's default charset.
             */
            scannerFile = new Scanner(file);
 
            /*
             * Returns true if this scanner has another token in its input.
             */
            while (scannerFile.hasNext())
                /*
                 * Finds and returns the next complete token from this scanner.
                 * A complete token is preceded and followed by input that
                 * matches the delimiter pattern.
                 */
                System.out.println(scannerFile.next());
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
	}

}
