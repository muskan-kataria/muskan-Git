import java.util.*;
class EditDistance
{
	public static int ED(char X[],char Y[],int n,int m)
	{
		int ed[][]=new int[n+1][m+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
					ed[i][j]=j;
				else if(j==0)
					ed[i][j]=i;
				else if(X[i-1]==Y[i-1])
					ed[i][j]=ed[i-1][j-1];
				else
				{
					ed[i][j]=1+Math.min(Math.min(ed[i-1][j-1],ed[i-1][j]),ed[i][j-1]);
				}
			}
		}
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print(" "+ed[i][j]);
			}
			System.out.println("");
		}
		return ed[n][m];
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int n=s1.length();
	int m=s2.length();
	
	char X[]=s1.toCharArray();
	char Y[]=s2.toCharArray();
	
	int res=ED(X,Y,n,m);
	System.out.println("result:"+res);
	
}
}