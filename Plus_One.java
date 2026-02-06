import java.util.*;

public class Plus_One
{
	public static void main(String[] args) {
		
		int arr[] = {1,2,9};
		
		int carry = 0;
		
		for (int i = arr.length - 1 ; i >= 0 ; i-- ) {
		    
		    if (carry == 1 && arr[i] != 9) {
		        arr[i] = arr[i] + 1 ;
		        break;
		    }
		    
		    if ( arr[i] == 9 ) {
		        carry = 1;
		        arr[i] = 0;
		        continue;
		    }
		    else {
		        arr[i] = arr[i] + 1;
		        break;
		    }
		    
		}
		
		System.out.print( Arrays.toString(arr) );
		
	}
}
