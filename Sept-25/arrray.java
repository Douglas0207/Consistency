     
public class arrray 
{

    public static void main(String[] args) 
    {
        int arr[] = {2, 6, 5, 8, 11, 10,4};
        int tar = 1;
        int c = 0;
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) 
        {
            int complement = tar - arr[i];
            if (map.containsKey(complement)) 
            {
                System.out.println("Pair found: (" + complement + ", " + arr[i] + ")");
                c++;
            }        
            map.put(arr[i], i);
        }
        if(c==0)
        {
        System.out.println("No valid pair found.");
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {2, 6, 5, 8, 11, 10};
        int n = arr.length;
        Arrays.sort(arr);
        int c=0;
        int target = 15;
        int left = 0;
        int right = n-1;
        while(left<right)
        {
           int sum = arr[left]+arr[right];
           if(sum==target)
           {
            System.out.println("Yes");
            c++;
            break;
           }
           if(sum<target)
           {
            left++;
           }
           if(sum>target)
           {
            right--;
           }
        }
        if(c==0)
        {
        System.out.println("No");
        }
    }

    public static void main(String[] args) 
    {
        int arr [] = {2,0,2,1,1,0,1,0,2,2,0,1};
        int n = arr.length;
        int low =0;
        int mid = 0;
        int high = n-1;
        for(int i=0;i<n;i++)
        {
          if(arr[mid]==0)
          {
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
          }
          else if(arr[mid]==1)
          {
            mid++;
          }
          else if(arr[mid]==2)
          {
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
          }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) 
    {
        int arr [] = {7,7,5,7,5,5,7,5,5,7,7,5,5,5,5,5};
        int n = arr.length;
        int count = 0;
        int element = 0;

        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count++;
                element = arr[i];
            }
            else if(arr[i]==element)
            {
               count++;
            }
            else{
                count--;
            }
        }
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==element)
            {
                count2++;
            }
        }
        if(count2>n/2)
        {
            System.out.println("The Majority Element is "+element);
        }
        else{
            System.out.println("NO Majority Element");
        }
    }
}

