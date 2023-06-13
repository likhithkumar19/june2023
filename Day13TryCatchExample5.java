class TryCatchExample5
{
public static void main(String args[])
{
try
{
int data=50/0;//may throw exception
}
//handling the exception
catch(Exception e)
{
System.out.println("can't divide by zero");
}
}
}