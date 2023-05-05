package structures;

import java.util.*;

public class List {

	private static Object object;

	public static void main(String[] args) {
		ArrayList<String> pickListValues= new ArrayList<String>();
		pickListValues.clear();
		pickListValues.add("benefits of DD");
		pickListValues.add("comfort & Dual Technology");
		pickListValues.add("ASD: vision clear & stable");
		pickListValues.add("quick & easy to fit");
		pickListValues.add("the most extensive range");
		pickListValues.add("astig.correction from >0,75DC");
		pickListValues.add("competitive msg vs DACP Toric");
		pickListValues.add("competitive msg vs Clariti Tor");		
		
		//sort!
		Collections.sort(pickListValues); 
		
		for(String x : pickListValues) {
			System.out.println( x );
		}
		
		System.out.println("=== obsolete, works as well ===");
		for(int i=0;i < pickListValues.size(); i++) {
			System.out.println( pickListValues.get(i) );
		}
	}

}
