import java.util.Scanner;
class InputSwap2{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1,num2;
num1=scob.nextInt();//5
num2=scob.nextInt();//7
num1=num1+num2;num1=12
num2=num1-num2;num2=5
num1=num1-num2;num1=7
int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.println(num1 + "\n"+ num2);
}
}