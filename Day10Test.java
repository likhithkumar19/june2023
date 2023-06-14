import java.util.Scanner;
class Polymorphism1
{
void print()
{
System.out.println("Welcome");
}
void print(String n)
{
System.out.println("Welcome "+n);
}
}
class Test
{
public static void main(String args[])
{
Polymorphism1 ob1=new Polymorphism1();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the your name");
String str=sc.next();
ob1.print(str);
}
}
