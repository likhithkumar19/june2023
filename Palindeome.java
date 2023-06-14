import java.util.Scanner;
class Palindeome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int n1=i;
int n2=0;
while(i!=0)
{
int rem=n1%10;
n2=n2*10+rem;
n1=n1/10;
}
if(n2==n1)
System.out.println(n2+"is a palindrome ");
else
{
System.out.println(n2+" is not a palindrome");
}
}
}