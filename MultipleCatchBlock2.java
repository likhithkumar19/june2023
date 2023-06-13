public class MultipleCatchBlock2
{
public static void main(String[]args)
{
int a[]=new int[5];
a[0]=11;a[1]=0;a[3]=33;a[4]=44;
int i;
try
{
for( i=0;i<=5;i++);
System.out.println(100/a[i]);
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
