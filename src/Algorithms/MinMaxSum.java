package Algorithms;

import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) 
	{
		int max=0,sum=0;
		int min= Integer.MAX_VALUE;
				
		System.out.println("Enter the size");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter "+n+" numbers:");
		
		for(int i=0;i<n;i++)
		{
			int num=scan.nextInt();
			
			if(max<num)
				max=num; 
			
		    if(min>num)
				min=num;
		    
			sum+=num;
			
		}
	System.out.println(max+" "+min);
	int minsum=sum-max;
	int maxsum=sum-min;
	System.out.println(minsum+" "+maxsum);
	}

}
