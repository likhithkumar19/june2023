import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int ornum=num;
int revs=0;
while(num!=0)
{
int rem=ornum%10;
revs=(revs*10)+rem;
ornum=ornum/10;
}
if(ornum==revs)
System.out.println(ornum+"is a palindrome ");
else
{
System.out.println(ornum+" is not a palindrome");
}
}
}