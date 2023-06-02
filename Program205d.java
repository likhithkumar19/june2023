import java.util.*;
public class Program205d
{
public static void main(String []args)
{
System.out.print("Enter character: ");
Scanner sc =new Scanner(System.in);
char ch= sc.next().charAt(0);
System.out.println();
if(ch>='0'&& ch<='9') 
System.out.println(ch+" is an digit");
else
System.out.println(ch+" is not an digit");
}
}