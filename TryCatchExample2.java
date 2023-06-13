class TryCatchExample2
{
public static void main(String args[])
{
try
{
int data=50/0;
System.out.println("rest the code");
}
catch(ArithematicException e)
{
System.out.println(e);
}
}
}