class StringBuilderExample8
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());
sb.append("java");
System.out.println(sb.capacity());
sb.append("java is my favorite language");
System.out.println(sb.capacity());
sb.ensureCapacity(10);
System.out.println(sb.capacity());
sb.ensureCapacity(50);
System.out.println(sb.capacity());

}
}