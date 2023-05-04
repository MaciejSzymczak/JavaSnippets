/**
 * 
 */
package structures;

/**
 * @author Maciej Szymczak
 */

public class TreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Treemap is an implementation of the SortedMap interface. It presents its keys in sorted order.
		java.util.TreeMap<String, String> rows = new java.util.TreeMap<String, String>();
		rows.put("key1", "A");
		rows.put("key2", "A");
		//replace prior entry with new entry
		rows.put("key2", "B");

		for(Object row: rows.keySet()) {
		  String values = (String)rows.get(row);
		  if (rows.containsKey("key1"))
			System.out.println( row+","+values);
		}
	}

}
