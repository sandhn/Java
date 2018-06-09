package Algorithms;

public class ComparetheTriplets {

	public static void main(String[] args) 
	{
		int [] a= {1,3,5};
		int [] b= {2,6,5};
		int [] c=new int[3];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<b[i] || a[i]>b[i])
				c[i]=1;
			else
				c[i]=0;
		}
for(int i=0;i<c.length;i++)
{
	System.out.println(c[i]);
	
}
	}

}
