import java.util.Scanner;
class ExtractDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String res="";
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)>='0'&& str.charAt(i)>='9')
{
res=res+str.charAt(i);
}
}
System.out.print(res);
}
}