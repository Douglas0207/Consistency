/*
 * 1. fibonacci series 
 * 2. frequency of Characters
 * 3. frequency of Characters using Character Hashing
 * 4. Most Frequent Element in an Array 
 * 5. Maximum Frequency of Words
 */
import java.util.*;
public class Day5 {
    public static void main(String [] args)
    {
        int fib = 10;
        int fibo = findfib(fib);
        System.out.println(fibo);
        int fiboo = findFibNormal(fib);
        System.out.println(fiboo);
        String freq = "Robinson";
        findFreqOfChar(freq);
        findFreqUsingCharHashing(freq);
        String words = "hey hey hey , I'm Robinson ha ha ha ha, he he";
        maxFreqOfWords(words);
    }
    public static int findfib(int n)
    {
       if(n==0) return 0;
       if(n==1) return 1;
       return findfib(n-1)+findfib(n-2);
    }
    public static int findFibNormal(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++)
        {
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void findFreqOfChar(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        int maxFreq =0;
        char maxChar = ' ';
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
          if(entry.getValue()>maxFreq)
          {
            maxFreq = entry.getValue();
            maxChar = entry.getKey();
          }
        }
        System.out.println("Character with highest Frequency: "+maxChar+" and its frequency is:"+maxFreq);
    }
    public static void findFreqUsingCharHashing(String s)
    {
        int n = s.length();
        int hashSize = 26;
        int hash[] = new int[hashSize];
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            ch = Character.toLowerCase(ch);
            hash[ch-'a']++;
        }
        int maxFreq = 0;
        char maxChar = ' ';

    for (int i = 0; i < hashSize; i++) {
        if (hash[i] > maxFreq) 
        {
            maxFreq = hash[i];
            maxChar = (char) (i + 'a');
        }
    }
    System.out.println("Character with highest frequency: " + maxChar);
    System.out.println("Frequency: " + maxFreq);
}
    public static void maxFreqOfWords(String s)
    {
        String [] words = s.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words)
        {
            map.put(word,map.getOrDefault(word, 0)+1);
        }
        String maxWord = " ";
        int maxFreq=0;
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
           if(entry.getValue()>maxFreq)
           {
            maxFreq = entry.getValue();
            maxWord = entry.getKey();
           }
        }
        System.out.println("Max word is "+maxWord+" freq is "+maxFreq);
    }
}
