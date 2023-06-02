class A
{
public void funA1()
{
System.out.print("funA1 called form classA");
}
public void funA2()
{
System.out.print("funA2 called form classA");
}
}
class B
{
public static void main(String args[])
{
A ob = new A();
ob.funA1();
ob.funA2();
}
}

