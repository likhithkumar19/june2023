*/ write a program to print Factors of a number
INPUT
12
OUTPUT
1,2,3,4,6,12
*/
import java.util.Scanner;
class Factors
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.im);
int num=sc.nextInt();
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
System.out.println(i);
if(i<num)
System.out.println(",");
}
}
}

