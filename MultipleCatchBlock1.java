public class MultipleCatchBlock1
{
public static void main(String[]args)
{
try
{
int a[]=new int[5];
a[5]=30/0;
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Excepation occur");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOFBounds Excepation occur");
}
catch(Exception e)
{
System.out.println("parent Exception occur");
}
System.out.println("rest the code");
}
}
