import java.util.*;
class CuttingRoad
{
	public static int CR(int price[],int n)
	{
		int cr[]=new int[n+1];
		cr[0]=0;
		
		
		for(int i=1;i<=n;i++)
		{
			int max_val=-1;
			for(int j=0;j<i;j++)
				max_val=Math.max(max_val,price[j]+cr[i-j-1]);
			cr[i]=max_val;
		}
	
		
		for(int i=0;i<=n;i++)
		{
			
				System.out.print(" "+cr[i]);
		
		}
		return cr[n];
	}
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();

	int price[]=new int[n];

	for(int i=0;i<n;i++)
	price[i]=sc.nextInt();


	
	int res=CR(price,n);
	System.out.println("\nresult:"+res);
	
}
}