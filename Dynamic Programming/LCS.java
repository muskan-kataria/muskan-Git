import java.util.*;
class LCS
{
	
public static int lcs(char[] X,char[] Y,int m,int n)
{
	int L[][]=new int[m+1][n+1];
	for(int i=0;i<=m;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(i==0||j==0)
				L[i][j]=0;
			else if(X[i-1]==Y[j-1])
				L[i][j]=1+L[i-1][j-1];
			else
				L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
		}
	}
	for(int i=0;i<=m;i++)
	{
		for(int j=0;j<=n;j++)
			System.out.print(" "+L[i][j]);
		System.out.println("");
	}
	
	
	int in=L[m][n];
	
	char lcs[]=new char[in+1];
	lcs[in]=' ';
	{
		int i=m;
		int j=n;
		
		while(i>0&&j>0)
		{
		
			if(X[i-1]==Y[j-1])
			{
				lcs[in-1]=X[i-1];
				i--;
				j--;
				in--;
			}
			else if(L[i-1][j]>L[i][j-1])
				i--;
			else
				j--;
		}
	}
	
	
	System.out.println("\n sequence");
	
	for(int i=0;i<=L[m][n];i++)
	{
		System.out.print(lcs[i]);
	}
	return L[m][n];
}
public static void main(String args[])
{
 String s1 = "AAB"; 
    String s2 = "ACA"; 
  
    char[] X=s1.toCharArray(); 
    char[] Y=s2.toCharArray(); 
    int m = X.length; 
    int n = Y.length; 
  
    System.out.println("\nLength of LCS is" + " " + 
                                  lcs( X, Y, m, n ) ); 
}
}