/* fibonacci series
Input;
10
output
0 1 1 2 3 5 8
*/
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.println("Enter the nth value");
n=sc.nextInt();
System.out.println("Fibonacci series:");
while(sum<=n)
{
System.out.print(sum +" ");
a=b;
b=sum;
sum=a+b;
}
}
}

