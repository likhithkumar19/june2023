class TryCatchExample7
{
public static void main(String args[])
{
try
{
int data1=50/0;//may throw exception
}
//handling the exception
catch(Exception e)
{
int data2=50/0;
}
System.out.println("rest the code");
}
}
