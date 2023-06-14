// calling default constructor from parameterized  constructor
class A
{
A()
{
System.out.println("Hello a");
}
A(int x)
{
this();
System.out.println(x);
}
}
class TestThis5
{
public static void main(String[]args)
{
A a=new A(10);
}
}