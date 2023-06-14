//undoxing example of integer to int
public class Day6Wrapper1
{
public static void main(String args[])
{
//converting integer to int
Integer a=new Integer(746);
int i=a.intValue();//converting integer to int explicitly
int j=a;//unboxing
System.out.print(a+" "+i+" "+j);
}
}