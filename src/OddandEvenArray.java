
public class OddandEvenArray {

	public static void main(String[] args)
	{
		int [] a= {1,3,5,7,9,11,15};
		int[] b= {2,4,6,8,10};
		int h=a.length+b.length;
		int[] c=new int[h];
		int j=0, k=0;
		for(int i=0;i<h;i++)
		{
			if(a[j]<b[k])
			{
				c[i]=a[j];	
				j++;	
			}
			else
			{
				c[i]=b[k];
				k++;
			}	
			if(j==a.length)
			{
				for(int t=k;t<b.length;t++)
				{	i++;
					c[i]=b[t];
				}
			}
			if(k==b.length)
			{
				for(int t=j;t<a.length;t++)
				{
					i++;
					c[i]=a[t];
				}
			}
		}
		
		for(int d=0;d<c.length;d++)
		{
			System.out.println(c[d]);
		}
		
		

	}

}
