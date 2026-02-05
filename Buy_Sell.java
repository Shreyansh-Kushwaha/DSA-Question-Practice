import java.util.*;

public class Buy_Sell
{
	public static void main(String[] args) {
		
		int arr[] = { 7,1,5,3,6,4};
		int min = arr[0];
		int profit = 0;
		
		for ( int i =0 ; i < arr.length ; i++){
		    
		    if ( arr[i] < min ) {
		        min = arr[i];
		    }
		    else if ( arr[i] - min > profit) {
		        profit = arr[i] - min;
		    }
		}
	    
	    System.out.println(profit);
	}
}
