//to count the factor of given number
import java.util.Scanner;
class Factorscount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0){
count++;
System.out.print(i);
if(i<num)
System.out.print(",");
}}
System.out.println(" count of factors of "+num +"is"+count);
}
}
