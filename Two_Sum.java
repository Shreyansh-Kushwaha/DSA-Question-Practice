import java.util.*;

public class Two_Sum
{
	public static void main(String[] args) {
		
		int arr[] = { 2,7,11,15 };
		int target = 9;
		int result[] = {0,0};
		
	    HashMap<Integer,Integer> map = new HashMap<>();
	    
	    for ( int i = 0; i < arr.length ; i++ ) {
	        
	        int temp = target - arr[i] ;
	        
	        if (map.containsKey(temp)){
	            result[1] = i;
	            result[0] = map.get(temp);
	        }
	        else {
	            map.put(arr[i],i);
	        }
	        
	    }
	    
	    System.out.println(Arrays.toString(result));
	    
	}
}
