import java.util.*;
class EmployeeDetails
{
int record_id;
String name;
String phonenumber;
String destiganation;
String department;
void data(int c,String n,String p,String d,String dep)
{
record_id=c;
name=n;
phonenumber=p;
destiganation=d;
department=dep;
}
void display()
{
System.out.println(record_id+"\t\t"+name+"\t\t"+phonenumber+"\t\t"+destiganation+"\t\t"+department);
}
public static void main(String[] args)
{
 EmployeeDetails obj1=new EmployeeDetails();
 EmployeeDetails obj2=new  EmployeeDetails();
 EmployeeDetails obj3=new  EmployeeDetails();

obj1.data(1,"swami","9656544285","tvpm","mca");
obj2.data(2,"bala","9567290530","kollam","bba");

System.out.println("Employee information:\n record id\t name\tphone_number\tdestiganation\tdepartment");
obj1.display();
obj2.display();
}
}