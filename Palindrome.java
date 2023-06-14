import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int m=i;
int sum=0;
while(i>0)
{
sum=sum*10+i*10;
i=i/10;
}
if(sum==m)
{
System.out.print(m+"is a palindrome ");
}
else
{
System.out.print(m+" is not a palindrome");
}
}
}
