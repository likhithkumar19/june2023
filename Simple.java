import java.util.StringTokenizer;
class Simple
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my name is likhith");
while(st.hasMoreTokens())
{
System.out.print(st.nextToken());
}
}
}
