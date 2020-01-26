import java.util.*;
class SubsetSum
{
	
	public static boolean SS(int n,int a[],int s)
	{
		boolean ss[][]=new boolean[n+1][s+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=s;j++)
			{
				if(i==0&&j!=0)
					ss[i][j]=false;
				else if(j==0)
					ss[i][j]=true;
				else if(a[i-1]>j)
					ss[i][j]=ss[i-1][j];
				else
					ss[i][j]=ss[i-1][j-a[i-1]]||ss[i-1][j];
			} 
		}
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=s;j++)
			{
				System.out.print(ss[i][j]+" ");
			}
			System.out.println("");
		}
		return ss[n][s];
	}
public static void main(String args[])
{
int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
int a[]=new int[n];
	
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	int sum;
	System.out.println("enter sum");
	sum=sc.nextInt();
	
	boolean res=SS(n,a,sum);
	
	System.out.println("\nIs Subset possible :"+res);
	

}
}