package structures;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		java.util.List<String> pickListValues= new ArrayList<String>();
		pickListValues.clear();
		pickListValues.add("benefits of DD");
		pickListValues.add("comfort & Dual Technology");
		pickListValues.add("ASD: vision clear & stable");
		pickListValues.add("quick & easy to fit");
		pickListValues.add("the most extensive range");
		pickListValues.add("astig.correction from >0,75DC");
		pickListValues.add("competitive msg vs DACP Toric");
		pickListValues.add("competitive msg vs Clariti Tor");
		
		for(int i=0;i < pickListValues.size(); i++) {
			System.out.println( pickListValues.get(i) );
		}
	}

}
