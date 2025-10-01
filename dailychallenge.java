      
import java.util.Arrays;


public class dailychallenge 
{
    public static void main(String[] args)
    {
        int arr [] = {2,1,1};
        int queries [][] = {
            {0,1},{1,2}
        };
        zeroArray(arr,queries);
    }
    public static void zeroArray(int arr[], int queries [] [])
    {
        int n = arr.length;
         int[] maxOps = new int[n]; 
        
            for (int[] q : queries) {
                int left = q[0];
                int right = q[1];
        
                for (int i = left; i <= right; i++) {
                    maxOps[i]++;
            }
        }
    System.out.println(Arrays.toString(maxOps));
    boolean possible = true;
    for (int i = 0; i < n; i++) {
        if (arr[i] > maxOps[i]) {
            possible = false;
            break;
        }
    }
    if (possible) {
        System.out.println("✅ Zero array can be created.");
    } else {
        System.out.println("❌ Zero array cannot be created.");
    }
    }
}
