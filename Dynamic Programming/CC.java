import java.util.*;
class CoinChange
{
public static int CC(int arr[],int m,int n)
{
int table[]=new int[n+1];
	int i,j;
	table[0]=1;
	
	for(i=0;i<m;i++)
		for(j=arr[i];j<=n;j++)
			table[j]+=table[j-arr[i]];
	
	return table[n];
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
	
	int res=CC(a,n,sum);
	
	System.out.println("\nresult :"+res);
	s

}
}