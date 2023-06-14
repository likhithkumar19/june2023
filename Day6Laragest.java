import java.util.Scanner;
class Day6Laragest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.print(a+" is laragest");
}
else if((b>a)&&(b>c))
{
System.out.print(b+"is laragest");
}
else
{
System.out.print(c+"is laragest");
}
}
}