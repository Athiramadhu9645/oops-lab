import java.util.*;
class calculator
{
public static void main(String[]args)
{
int a,b,c,ch;
Scanner s1=new Scanner(System.in);
System.out.println("enter two numbers");
a=s1.nextInt();
b=s1.nextInt();
System.out.println("1.add \t 2.sub \t 3.mul \t 4.div");
System.out.println("enterchoice");
ch=s1.nextInt();
switch(ch)
{
case 1:c=a+b;
System.out.println(c);
break;
case 2:c=a-b;
System.out.println(c);
break;
case 3:c=a*b;
System.out.println(c);
break;
case 4:c=a/b;
System.out.println(c);
break;
default:System.out.println("invalid choice");
}
}
}


