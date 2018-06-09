package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfChar {

	public static void main(String[] args) 
	{	
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//int val=0;
		HashMap<Character, Integer> map=new HashMap<>();
		char[] arr = str.toCharArray();
		for(char ch: arr)
		{
			if(map.containsKey(ch))
			{
			map.put(ch, map.get(ch)+1);
			}
			else
			{
			map.put(ch,1);
			}
		}
		System.out.println(map);

	}

	/*public static void main(String[] args) {
		String str = "Programming";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}*/
}
