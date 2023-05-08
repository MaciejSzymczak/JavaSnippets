package structures;

import java.util.*;

public class SetExamples {

	public static void main(String[] args) {

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.println(hash_Set);
  
        //ITERATING
        for (String value : hash_Set)
           System.out.print(value + ", ");
        System.out.println("");
        
        
        //CONTAINS
        System.out.println("Contains 'For'?"  + " " + hash_Set.contains("For"));
        
        //REMOVE
        hash_Set.remove("For");
        System.out.println("Contains 'For'?"  + " " + hash_Set.contains("For"));
        
        Set<Integer> a = new HashSet<Integer>();
        
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        
        Set<Integer> b = new HashSet<Integer>();
          
        b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
            
        // UNION
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("UNION");
        System.out.println(union);
  
        // INTERSECTION
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("INTERSECTION");
        System.out.println(intersection);
  
        // DIFFERENCE
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("DIFFERENCE");
        System.out.println(difference);
        
	}

}
