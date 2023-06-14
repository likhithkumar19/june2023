import java.util.*;
class Day7PalindromeString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name=sc.next();
String name_c=name;
String reverse="";
int len=sc.length()-1;
for(int i=0;i<=len;--i);
{
reverse=reverse+name.charAt(i);
}
if(reverse.equals(name)
System.out.print("Yes");
else
System.out.print("NO');
}
}