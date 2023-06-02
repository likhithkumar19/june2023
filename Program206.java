import java.util.*;
public class Program206
{
public static void main(String []args)
{
char ch;
System.out.println("Enter character");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
int ascii;
ascii=(int)ch;//type costing from to int
System.out.println("ASCII value " +ch+ " is "+ascii);
}
}
