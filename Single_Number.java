import java.util.*;

public class Single_Number
{
	public static void main(String[] args) {
		
		int arr[] = {4,1,2,1,2};
		
		HashSet<Integer> sot = new HashSet<>();
		
		for (int i =0; i< arr.length ;i++) {
		    
		    if (sot.contains(arr[i])) {
		        
		        sot.remove(arr[i]);
		    }
		    else {
		        sot.add(arr[i]);
		    }
		    
		}
		
		if (sot.isEmpty()) {
		    System.out.println("Every elemets appears twice");
		}
		else{
		    System.out.println(sot.iterator().next());
		}
		
		
	}
}
