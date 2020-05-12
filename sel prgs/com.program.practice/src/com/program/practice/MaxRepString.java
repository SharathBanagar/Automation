package com.program.practice;

import java.util.Scanner;

public class MaxRepString {

	static char maxRepeating(String str) 
    { 
        int len = str.length(); 
        int count = 0; 
  
        // Find the maximum repeating character 
        // starting from str[i] 
        char res = str.charAt(0); 
        for (int i=0; i<len; i++) 
        { 
            int cur_count = 1; 
            for (int j=i+1; j<len; j++) 
            { 
                if (str.charAt(i) != str.charAt(j)) 
                    break; 
                cur_count++; 
            } 
  
            // Update result if required 
            if (cur_count > count ) 
            { 
                count = cur_count;
                if(cur_count>=3)
                res = str.charAt(i); 
            } 
        } 
        return res; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
    	Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); 
        System.out.println(maxRepeating(str)); 
    } 
} 