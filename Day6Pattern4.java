import java.util.Scanner;
class Day6Pattern4
{

  public static void printLine(char c,int col)
  {
	System.out.println();
	for(int j=0;j<col;j++)
	System.out.print(c+" ");
   }
public static void printingNumber(char c,int n)
	{
	for(int i=0;i<=(n/2);i++)
	{
		printLine(c,i);
	}
}


public static void printingReverse(char c,int n)
	{
	for(int i=(n-(n/2));i>=0;i--)
	{
		printLine(c,i);
	}
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	int n1=sc.nextInt();
        int x,y;
       if(n1%2==0)
        x=y=n1%2;
       else{
        x=n1%2;
         y=n1/2+1;
        }
        printingNumber(ch,n1);
	printingReverse(ch,n1);

}
}