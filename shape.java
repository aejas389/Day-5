import java.util.*;
class shape
{
	public static void main (String[] args) 
	{
	    Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
	    {
		    for(int j=i;j<=n;j++)
		    {
			    System.out.println((char)(64+j)+" ");
		    }
		    System.out.println();
        }
    }
}            
   
