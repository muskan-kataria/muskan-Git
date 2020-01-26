import java.util.*;
class KnapSack
{
static int p[]=new int[3];
static int w[]=new int[3];
	public static int KS(int i,int c)
	{
		int s[][]=new int[i+1][c+1];
		

		
		for(int j=0;j<=i;j++)
		{
			for(int k=0;k<=c;k++)
			{
				if(k==0||j==0)
					s[j][k]=0;
				else if(w[j-1]<=k)
				s[j][k]=Math.max(s[j-1][k-w[j-1]]+p[j-1],s[j-1][k]);
				else
					s[j][k]=s[j-1][k];

			}
		}
		
		for(int j=0;j<=i;j++)
		{
			for(int k=0;k<=c;k++)
				System.out.print(s[j][k]+" ");
			System.out.println("");
		}
		return s[i][c];
	}
public static void main(String args[])
{
	
p[0]=10;
	p[1]=12;
	p[2]=28;
	
	w[0]=1;
	w[1]=2;
	w[2]=4;
	
int res=KS(3,6);
	System.out.println("result:"+res);
}
}