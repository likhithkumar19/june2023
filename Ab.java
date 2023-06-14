import java.util.Scanner;
class Ab
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch=sc.next().charAt(0);
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)>='a'&& str.charAt(i)<='z')
{
if(ch!=str.charAt(i))
{
System.out.print(str.charAt(i));
}
}
}
}
}
