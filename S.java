import java.util.Scanner;
class S extends Exception
{
  String msg;
  S(String msg);
  this.msg=msg;
public String toString()
{
 return msg;
}
}
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int rollno=sc.nextInt();
        String name=sc.nextInt();
        int marks=sc.nextInt();
try
{
if(marks>0)
{
throws new S("marks should not be negative.marks=0");
}
}
catch(S ex)
{
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
