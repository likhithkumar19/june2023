class Day6print_Stars
{
public static void print_multi_chars(int i,char c)
{
int k=1;
for(;k<=i;k++)
System.out.print(c);
}
public static void main(String args[])
{
int j=5;
print_multi_chars(j,'*');
print_multi_chars(j+1,'+');
print_multi_chars(j+2,'-');
}
}