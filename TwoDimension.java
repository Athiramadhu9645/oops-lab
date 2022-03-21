import java.util.*;
class TwoDimension
{
public static void main(String[]args)
{
int a[][]=new int[2][3];
Scanner s1=new Scanner(System.in);
System.out.println("enter the numbers");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=s1.nextInt();
}
}
System.out.println("the array is");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(a[i][j]);
}
}
}
}