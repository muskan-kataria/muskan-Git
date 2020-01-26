import java.util.*;
class LIS
{
public static int lis(int arr[],int n)
{
	int l[]=new int[n];
	for(int i=0;i<n;i++)
		l[i]=1;
	
	for(int i=1;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
if(arr[i]>arr[j]&&l[i]<l[j]+1)
	l[i]=l[j]+1;
		}
	}
	
	int max=0;
	for(int i=0;i<n;i++)
		System.out.print(" "+l[i]);
	
	for(int i=0;i<n;i++)
		if(l[i]>max)
			max=l[i];
	
	return max;
	
	
}
	
public static void main(String args[])
{
int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
int a[]=new int[n];
	
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();

	
	int res=lis(a,n);
	
	System.out.println("\nlongest incresing subsequence is of length :"+res);
	

}
}