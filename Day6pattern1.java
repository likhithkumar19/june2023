import java.util.Scanner;
class Day6Pattern1
{
public static void printingPatterns(int n,char c)
{
for(int i=0;i<=n;i++)
{
System.out.println();
for(int j=0;j<=i;j++)
System.out.print(c);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int n=sc.nextInt();
printingPatterns(n,c);
}
}
