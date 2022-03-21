import java.util.*;
class Employee
{
public static void main(String[]args)
{
String name;
int age;
float salary;
Scanner s1=new Scanner(System.in);
System.out.println("enter the name");
name=s1.nextLine();
System.out.println("enter the age ");
age=s1.nextInt();
System.out.println("enter salary");
salary=s1.nextFloat();
System.out.println("name="+name+"\nage="+age+"\nsalary="+salary);
}
}