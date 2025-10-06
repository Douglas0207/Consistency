/*
 * Arrays – Easy
Given an array of integers, return the indices of the two numbers such that they add up to a target.
(Classic: Two Sum)

Arrays – Medium
Given a sorted array, remove duplicates in-place and return the new length.
(Memory check: Two pointer technique)

Strings – Easy
Check if a given string is a palindrome (ignore cases and non-alphanumeric characters).

Strings – Medium
Find the longest common prefix among an array of strings.

Stack – Easy
Given a string of parentheses ()[]{}, check if it is valid (properly closed & nested).

Stack – Medium
Implement a stack that supports getMin() in O(1) time.

Queue – Medium
Implement a circular queue (array-based).

Searching – Easy
Implement binary search on a sorted array.

Sorting – Medium
Implement quicksort on an array of integers.

Bonus: Classic Problem – Medium/Hard
Given an array prices[] where prices[i] is the price of a stock on day i, find the max profit by choosing a single day to buy and a single day to sell.
 */

public class oct3 
{
    public static void main(String[] args) 
    {
        int sumArr [] = {6,3,1,5,9,2,7,1};
        int sum = 14;
        twoSum(sumArr,sum);
        twoSumOpt(sumArr,sum);
        int dub[] = {1,2,2,3,4,4,5,5,5,6,7,8,9,9};
        removeDub(dub);
        String arr[] = {"hello","helicopter","hell"};
        String ans = longestCommonPrefix(arr);
        System.out.println(ans);
    }
    public static void twoSum(int arr[], int n)
    {
        for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
          {
            if(arr[i]+arr[j]==n)
            {
              System.out.println("indeces are "+i+" "+j);
            }
          }
        }
    }
    public static void twoSumOpt(int arr[], int n)
    {
        
    }
    public static void removeDub(int arr[])
    {
      int n = arr.length;
      int c=1;
      for(int i=0;i<n-1;i++)
      {
        if(arr[i]!=arr[i+1]) c++;
      }
      System.out.println(c);
    }
    public static String longestCommonPrefix(String arr[])
    {
        if(arr ==null || arr.length==0) return " ";
        String first = arr[0];
        for(int i=0;i<first.length();i++)
        {
           char ch = first.charAt(i);
           for(int j=1;j<arr.length;j++)
           {
            if(i>=arr[j].length() || arr[j].charAt(i)!=ch)
            {
              return first.substring(0,i);
            }
           }
        }
        return first;
    }
}
