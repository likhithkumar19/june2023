public class MultipleCatchBlock4
{
public static void main(String[]args)
{
try
{
String s=null;
System.out.println(s.length());
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