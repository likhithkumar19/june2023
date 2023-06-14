import java.util.*;
public class Test
{
public static void main(String args[])
{
StringTokenizer st= new StringTokenizer("my,name,is,likhiht");
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
}
}