//half right angle traingle
import java.util.Scanner;
class Day6Pattern2
{
  public static void printLine(char c,int col)
  {
	System.out.println();
	for(int j=0;j<=col;j++)
	System.out.print(c+" ");
   }
public static void printingPatterns(char c,int n)
{
for(int i=0;i<n;i++)
{
printLine(c,i);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int n=sc.nextInt();
printingPatterns(c,n);
}
}