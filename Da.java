import java.util.*;
class Da
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int n=sc.nextInt();
int space=n/2;
int i;
for(i=1;i<n;i++)
{
 for(int j=1;j<space;j++)
    System.out.print("#");
  for(int k=1;k<i;k++){
   System.out.print(ch);}
  for(int j=1;j<space;j++)
   System.out.print("#");
   space--;
    System.out.println();
}

}}
   