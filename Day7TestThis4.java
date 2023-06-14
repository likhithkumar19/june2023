class A
{
void m()
{
System.out.println("Hello m");
}
void n()
{
System.out.println(" hello n");
this.m();
}
}
class TestThis4
{
public  static void main(String[] args)
{
A a=new A();
a.n();
}
}