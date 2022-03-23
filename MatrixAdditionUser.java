import java.util.*;
class MatrixAdditionUser
{  
public static void main(String args[])
{      
int a[][]=new int[3][3]; 
Scanner s1=new Scanner(System.in);
System.out.println("enter the 1st matrix");
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{   
a[i][j]=s1.nextInt();
}
}
int b[][]=new int[3][3];
System.out.println("enter the 2nd matrix");
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{   
b[i][j]=s1.nextInt();
}
}
System.out.print("result is: \n");
int c[][]=new int[3][3];
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{ 
c[i][j]=a[i][j]+b[i][j]; 
System.out.print(c[i][j]+" ");  
}  
System.out.println();
}  
}
}
