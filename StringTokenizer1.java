import java.util.StringTokenizer;
public class StringTokenizer1
{
public static  void main(String args[])
{
StringTokenizer st=new StringTokenizer("demonstrating methods fromm StringTokenizer class","");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}