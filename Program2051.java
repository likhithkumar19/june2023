//to check whether the character is a special char or not
import java.util.*;
public class Program2051
{
public static void main(String []args)
{
System.out.print("Enter character: ");
Scanner sc =new Scanner(System.in);
char ch= sc.next().charAt(0);
System.out.println();
if((ch>='a'&& ch<='z') ||(ch>='A'&& ch<='Z'))
System.out.println(ch+" is an alphabet");
else if(ch>='0'&& ch<='9') 
System.out.println(ch+" is an digit");
else 
System.out.println(ch+" is an special character");
}
}