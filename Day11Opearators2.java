class Add
{
public static void main(String args[])
{
double num1=Double.parseDouble(args[0]);
double num2=Double.parseDouble(args[1]);
double num3=Double.parseDouble(args[2]);
System.out.println("addition :"+(num1+num2+num3));
System.out.println("Multipulication:"+(num1*num2+num3));
System.out.println("Moduls:"+((num1/num2)/num3));
System.out.println("Divison:"+((num1%num2)%num3));
}
}