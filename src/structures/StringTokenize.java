package structures;

import java.util.StringTokenizer;

public class StringTokenize {
	

	public static void main(String[] args) {
	    StringTokenizer st1 = new StringTokenizer("Java|StringTokenizer|Example 1", "|");
	   
	    while(st1.hasMoreTokens())
	      System.out.println(st1.nextToken());
	   
	    //2. Using nextToken() method. Note that the new delimiter set remains the
	    //default after this method call
	    StringTokenizer st2 = new StringTokenizer("Java|StringTokenizer|Example 2");
	   
	    //iterate through tokens
	    while(st2.hasMoreTokens())
	      System.out.println(st2.nextToken("|"));
	}

}
