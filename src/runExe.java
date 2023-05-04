import java.io.IOException;

public class runExe {
	
	public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
 
            e.printStackTrace();
        }
	}

}
