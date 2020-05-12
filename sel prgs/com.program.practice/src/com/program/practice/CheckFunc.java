package com.program.practice;

import java.util.Scanner;

/*public class CheckFunc 
{
	public static void main(String[] args) 
	{
		String s = "Sharath";
		int n = s.length()-1;
		char a[] = s.toCharArray();
		for(int i=0;i<=n;i++)
		{
			char b = a[i];
			char c = a[n-i];
			a[i] = c;
			a[n-i] = b;
			
		}
		System.out.println(a);
	}

}*/


/*class CheckFunc { 
    
    static int getSum(int num) 
    {     
        int sum = 0;
        if(num ==0)
        {
        	return sum;
        } 
        else
        {
        	sum = num + getSum(num-1);
        }
        return sum; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
    	//int sum = 0;
        int num = 6; 
  
        System.out.println(getSum(num)); 
    } 
} */




/*class CheckFunc { 
    
    static int function(int i, int j) 
    {   
    	
    		while(i<j)
    	{
    		i++;
    		j--;
    		if(i == j)
    			return i;
    	}
			return i;
    	
    }

  
    // Driver program 
    public static void main(String[] args) 
    { 
    	//int sum = 0;
        int i = 0;
        int j = 10;
  
        System.out.println(function(i,j)); 
    } 
} */


/*class CheckFunc { 
    
    static int function(int num) 
    {   
    	for(int i =num;i>0;i-- )
    	{
    		num = (i) * (i-1);
    	}
    	return num;
    }
  
    // Driver program 
    public static void main(String[] args) 
    { 
    	int num = 3;
    	
        System.out.println(function(num)); 
    } 
}*/


/*class CheckFunc 
{
	public static void main(String[] args) 
    { 
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		int l = s.length();
		if(l>5)
		{
			System.out.println(l*(l-1));
		}
		else
		{
			System.out.println(l*(l+1));
		}
    }
}*/


/*class CheckFunc { 
    
    static int getSum(int num) 
    {     
        int x =0;
        if (num > 0)
        {
        	num--;
        	x= getSum( num);
        			num--;
        			x = x+num;
        }
        return x; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
    	//int sum = 0;
        int num = 4; 
  
        System.out.println(getSum(num)); 
    } 
}*/

/*class CheckFunc { 
    
    static int function(int i, int j) 
    {   
    	int k=0;
    	if(i<j)
    	{
    		i++;
    		j--;
    		k = i * j;
    	}
    	else
    	{
    		i--;
    		j++;
    		k = i * j;
    	}
    	k = k + (i-j);
			
    	System.out.println("k ="+k);
    	return k;
    }

  
    // Driver program 
    public static void main(String[] args) 
    { 
    	//int sum = 0;
        int i = 4;
        int j = 2;
  
        System.out.println(function(i,j)); 
    } 
}
*/
class CheckFunc
{
	public static void main(String[] args)
	{
		int y=4;
		int x=10;
		int z=5;
		for(y=4;y<x;)
		{
			x=x-3;
			y=y-1;
			z=z+x+y;
		}
		System.out.println(z);
	}
}




