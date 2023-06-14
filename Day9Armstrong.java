/*check  the armstrong number
1634
8208
153
*/
import java.util.Scanner;
class Armstrong
{
public static int lenDigit(int n)
{
int len=0;
while(n>0)
{
len++;
n=n/10;
}
return len;
}
public static boolean checkArmstrong(final int n)
{
int sum=0;
int exp=lenDigit(n);
int num=n;
while(num>0)
{
sum+=Math.pow((num%10),exp);
num=num/10;
}
return n==sum;
}
public static void main(String args[])
{

int inputNum=153;
if(checkArmstrong(inputNum))
System.out.println("YES");
else
System.out.println("NO");
}
}
