public class javaExcepationExample
{
public static void main(String args[])
{
try
{
//code that may rasie exception
//int data=100/10;
int p=20;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
//rest code of the program
System.out.println("rest of the code");
}
}