import java.util.Scanner;
class Input2
{
public static int add(int a,int b)
{
int c=a+b;
return c;
}
public static int sub(int a,int b)
{
int c=a-b;
return c;
}
public static int mul(int a,int b)
{
int c=a*b;
return c;
}
public static double div(int a,int b)
{
int c=a/b;
return c;
}
public static float modl(int a,int b)
{
int c=a%b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter number;");//5
double num1;
num1=scob.nextDouble();
System.out.println("Enter a number;");//7
double num2;
num2=scob.nextDouble();
//5+7=12
System.out.println(num1 +"+"+ num2 + "="+add(num1,num2));
System.out.println(num1 +"-"+ num2 + "="+sub(num1,num2));
System.out.println(num1 +"*"+ num2 + "="+mul(num1,num2));;
System.out.println(num1 +"%"+num2 + "="+div(num1,num2));
System.out.println(num1 +"/"+num2 +"="+modl(num1,num2));


}//main()
}//Input1