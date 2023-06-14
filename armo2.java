class armo2
{
public static void main(String args[])
{
int num=153;
int result=0,remainder,temp=number;
while (num>0)
{
result=num%10;
remainder+=Math.pow((result,3));
num=num/10;
}
if(remainder==num)
System.out.print("armostrong");
else
System.out.print("NOTARMstrong");
}
}