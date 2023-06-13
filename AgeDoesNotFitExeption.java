import java.util.*;
class AgeDoesNotFitExeption extends Exception
{
String msg;
AgeDoesNotFitExeption(String msg)
{
super(msg);
this.msg=msg;
}
public String toString()
{
return msg;
}
}
class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try
{
if(age<18)
{
throw new AgeDoesNotFitExeption("Entered age doesn't fulfill the requried age limit");
}
}
catch(AgeDoesNotFitExeption ex)
{
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}