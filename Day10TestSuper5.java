class Person
{
int id;
String name;
Person(int id,String name)
{
this.id=id;
this.name=name;
}
}
class Earth extends Person
{
float salary;
Earth(int id,String name,float salary)
{
super(id,name);//resuing parent constructor
this.salary=salary;
}
void display()
{
System.out.println(id+" "+name+""+salary);
}
}
class TestSuper5
{
public static void main(String args[])
{
Earth ob=new Earth(11,'likji',4544);
ob.display();
}
}