import java.util.*;
class College
{
static class Student
{
int rollno;
String name;
String address;
String department;
Student(int no,String na,String add,String dept)
{
rollno=no;
name=na;
address=add;
department=dept;
}
void display()
{
System.out.println("***STUDENT INFORMATIOM***"+" \n");
System.out.println("Rollno:"+ rollno+"\n");
System.out.println("Name:"+name+"\n");
System.out.println("Address:"+address+"\n");
System.out.println("Department:"+department+"\n");
}
}
class Staff
{
int staffid;
String name;
String address;
String department;
Staff(int id,String nan,String addd,String deptt)
{
staffid=id;
name=nan;
address=addd;
department=deptt;
}
void display()
{
System.out.println("***STAFF INFORMATION*** "+" \n");
System.out.println("Staff ID:"+ staffid+"\n");
System.out.println("Name:"+name+"\n");
System.out.println("Address:"+address+"\n");
System.out.println("Department:"+department+"\n");
}
}
public static void main(String[] args)
{
College.Student obj1=new College.Student(1,"athira","tvpm","mca");
College obj2=new College();
College.Staff obj3=obj2.new Staff(101,"priya","kollam","bca");
obj1.display();
obj3.display();
}
}