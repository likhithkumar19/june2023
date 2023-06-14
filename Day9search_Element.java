import java.util.Scanner;
class Search_Element
{
public static void main(String args[])
{
int n,x, flag=0,i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the elements you want to find:");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.println("elements found at postion"+(i+1));
}
else
{
System.out.println("Element not found");
}
}
}