import java.util.*;
public class oct14 {
    public static void main(String args[]) 
    {
        int arr [] = {0,0,1,1,1,2,3,4,5,5,5,5,5,1};
        findMostFreqElement(arr);
        int sortArr [] = {9,5,1,0,2,3,8,7,4,6};
        selectionSort(sortArr);
        bubbleSort(sortArr);
        insertionSort(sortArr);
        mergeSort(sortArr);
        quickSort(sortArr);
    }
    public static void findMostFreqElement(int arr[])
    {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int n:arr)
       {
        map.put(n,map.getOrDefault(n, 0)+1);
       }
       int maxFreq=0;
       int maxEle=-1;
       for(Map.Entry<Integer,Integer> ent : map.entrySet())
       {
        if(ent.getValue()>maxFreq)
        {
            maxFreq = ent.getValue();
            maxEle = ent.getKey();
        }
       }
       System.out.println("The Most Frequent Element is: "+maxEle+". It appears "+maxFreq+" times");
    }
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[])
    {
       for(int i=arr.length-1;i>=0;i--)
       {
        Boolean flag = false;
         for(int j=0;j<i;j++)
         {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
            }
         }
         if(flag) break;;
       }
       System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
         int j=i;
         while(j>0 && arr[j-1]>arr[j])
         {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
         }
       }
       System.out.println(Arrays.toString(arr));
}
    public static void mergeSort(int arr[])
    {
        helper(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void helper(int arr [],int low,int high)
    {
      if(low==high) return;
      int mid = low + (high - low) / 2;
      helper(arr,low,mid);
      helper(arr,mid+1,high);
      merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low, int mid, int high)
    {
        ArrayList <Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i] = temp.get(i-low);
        }
    }
    public static void quickSort(int arr[])
    {
        helper2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void helper2(int arr[],int low,int high)
    {
       if(low<high)
       {
         int index = func(arr,low,high);
         helper2(arr, low, index-1);
         helper2(arr, index+1, high);
       }
    }
    public static int func(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i=low;
        int j = high;
        while(i<j)
        {
            while(i<high && arr[i]<=pivot) i++;
            while(j>low && arr[j]>=pivot) j--;
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
