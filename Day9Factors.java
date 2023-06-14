// to check the factors of the give number
import java.util.Scanner;
class Factors
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0){
System.out.print(i);
if(i<num)
System.out.print(",");
}}
}
}

