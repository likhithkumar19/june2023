class palindrome
{
public static void main(String args[])
{
int result,remainder=0,temp;
int num=1980908;
temp=num;
while(num>0)
{
result=num%10;
remainder +=(Math.pow(result,3));
num=num/10;
}
if(temp==remainder)
System.out.print("YES");
else
System.out.print("NO");
}
}