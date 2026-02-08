import java.util.*;

public class Merge_Two_List
{
	public static void main(String[] args) {
		
		int a[] = {1,2,7,9};
		int b[] = {3,4,5,81};
		
		ArrayList<Integer> lost  = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while ( i < a.length || j < b.length) {
		    
		    if ( i >= a.length ) {
		        
		        for ( ; j < b.length  ; j++ ) {
		            
		            lost.add( b[j] );
		        }
		        break;
		    }
		    
		    if ( j >= b.length) {
		        for ( ; i < a.length  ; i++ ) {
		            
		            lost.add( a[i] );
		        }
		        break;
		    }
		    
		    if ( a[i] <= b[j] ) {
		    
    		    lost.add( a[i] );
    		    i++;
    		}
    		else{
    		    
    		    lost.add(b[j]);
    		    j++;
    		}
    		
		}
		
		
		System.out.println( lost );
		
	}
}
