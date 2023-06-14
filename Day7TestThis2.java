//by using this keyword
class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+""+name+""+fee);
}
}
class TestThis2
{
public static void main(String args[])
{
Student s1=new Student(1111,"ankit",45544f);
Student s2=new Student(0000,"likith",00000f);
s1.display();
s2.display();
}
}
