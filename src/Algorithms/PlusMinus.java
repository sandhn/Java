package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of numbers:");
		Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		float[] a=new float[n];
		float sumneg=0, sumpos=0, sumzero=0;
		System.out.println("Enter numbers:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextFloat();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				sumneg++;
			}
			else if(a[i]>0)
			{
				sumpos++;
			}
			else if(a[i]==0)
			{
				sumzero++;
			}

		}
		float neg=sumneg/n;
		float pos=sumpos/n;
		float zero=sumzero/n;
		System.out.println(String.format("%-10s", neg).replace(' ', '0'));
		System.out.println(String.format("%-10s", pos).replace(' ', '0'));
		System.out.println(String.format("%-106s", zero).replace(' ', '0'));
}
}
