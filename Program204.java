import java.util.*;
public class Program204
{
static int diff(int a,int b)
{
return a-b;
}
static int product(int a,int b)
{
return a*b;
}
static int smallest(int a,int b){
if(a<b)return a;
else return b;
}
static int largest(int a,int b)
{
if(a<b)return b;
else return a;
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n,m,result;
System.out.println("Enter a number");
n=sc.nextInt();
System.out.println("Enter a number");
m=sc.nextInt();
result=diff(n,m);
System.out.println("difference is"+result);
result=product(n,m);
System.out.println("product is"+result);
result=smallest(n,m);
System.out.println("smallest is"+result);

result=largest(n,m);
System.out.println("largest is"+result);

}
}
