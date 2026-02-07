import java.util.*;

public class Move_zeroes
{
	public static void main(String[] args) {
        
        int arr[] = {0,1,0,3,12};
        int temp[] = new int[arr.length];
        int j=0;
        
        for (int i = 0; i<arr.length ; i++) {
            
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        
        for ( ; j < arr.length ; j++) {
            temp[j] = 0;
        }
        
        System.out.println( Arrays.toString(temp));
	}
}
