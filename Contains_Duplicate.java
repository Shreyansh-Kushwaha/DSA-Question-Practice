import java.util.*;

public class Contains_Duplicate
{
	public static void main(String[] args) {
		
		int arr[] = { 1,2,3,1};
		
		HashSet <Integer> map = new HashSet<>();
		
		for (int i =0; i < arr.length ; i++ ) {
		    
		    if (map.contains(arr[i])) {
		        System.out.println(true);
		        return;
		    }
		    
		    map.add(arr[i]);
		}
		
		System.out.println(false);
	}
}
