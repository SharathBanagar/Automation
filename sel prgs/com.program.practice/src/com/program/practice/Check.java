package com.program.practice;

public class Check
{

	public static void main(String[] args) 
	{
		/*int num = 0;
		for(int i=5;i>=1;i--)
		{
			for(int j=0;j<i;j++)
				num = num+i;
			System.out.println(num);
		}
		System.out.println(num);*/
	
	
	String s = new String ("Testing");
	String s2 = "";
	{
	for(int i =0;i<s.length()-1;i=i+2)
	{
		 s2 = s.charAt(i) +  s2;
		System.out.println(s2);
	}
	System.out.println(s2);
	} 
		
		/*String s = new String ("Trial");	
		{
			int j=0;
			for(int i =0; i < s.length();i++)
			{
				if(s.charAt(i)=='a')
					j++;
			}
			System.out.println(j);
		}*/
		
		
		/*int i = 4,j = 2;
		{
			int k=0;
			if(i<j)
			{
				i++;
				j++;
				k = i*j;
			}
			else
			{
				i--;
				j++;
				k = i*j;
			}
			k = k + (i-j);
			System.out.println(k);
		}*/
		
		
}
}

