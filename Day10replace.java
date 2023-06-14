//replace the string
/* input
today is my day
is 
was
output:
today was my day
*/
import java.util.Scanner;
class Replace
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String c=sc.next();
String r=sc.next();
String res=str.replaceAll(c,r);
System.out.print(res);
}
}

