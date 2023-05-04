package customException;

public class Example {

	public static void main(String[] args) throws MyException {
		throw new MyException("example");
	}

}
