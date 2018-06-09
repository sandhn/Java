package Strings;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args)
	{
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int j=arr.length;
		System.out.println(j);
		for(int i=0;i<j;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
