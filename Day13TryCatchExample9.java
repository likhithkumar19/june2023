class TryCatchExample9
{
public static void main(String args[])
{
try
{
int arr[]={1,3,5,7};//may throw exception
System.out.println(arr[10]);
}
//handling the exception
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println("rest the code");
}
}