
public class CommandLineParams {

	public static void main(String[] args) {
		System.out.println("Start");
        for (String s: args) {
            System.out.println(s);
        }
		System.out.println("Stop");
	}

}
