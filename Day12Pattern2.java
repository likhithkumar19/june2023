import java.util.Scanner;
class Pattern2
{
public static void printLine(int n)
{
 for(int i=1;i<=n;i++)
{
 System.out.print(i);
 }
}
public static void printPattern(int n)
{
  for(int i=n;i>=1;i--)
  {
System.out.print("\n");
  printLine(i);
  }
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPattern(n);
}
}
/*
Input :5
Output:
12345
1234
123
12
1
*/