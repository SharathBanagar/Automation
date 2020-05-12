package com.program.practice;

import java.util.Scanner;

public class LastCharCount {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = s.length();
		s.toCharArray();
		int num = 0;
		for(int i = 0;i<n;i++)
		{
			if(s.charAt(i)==s.charAt(n-1))
			{
				num++;
			}
		}
		System.out.println(num);
		scan.close();

	}

}
