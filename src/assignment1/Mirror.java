package assignment1;

import java.util.*;
class Mirror
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,j,k,temp;
        System.out.println("Enter Array Capacity");
        m=in.nextInt();               
        n=in.nextInt();                    
        int ar[][]=new int[m][n];      
        int br[][]=new int[m][n];       
        k=n-1;                                
        System.out.println("Enter Array Elements");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][j]=in.nextInt();    
            }
        }
        System.out.println("Original Matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]);    
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                br[i][j]=ar[i][k-j];                       
            }
        }
        System.out.println("Mirror Matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(br[i][j]+"\t");    
            }
            System.out.println();
        }
    }  
}       