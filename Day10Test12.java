public class point
{
double x;
double y;
public void setX(double x_value)
{
x=x_value;
}
public void setY(double y_value)
{
y=y_value;
}
public double getX()
{
return x;
}
public double getY()
{
return y;
}
public double Square_distance_from_origin()
{
return x*x+y*y;
}
}
class Test12
{
public static void main(String args[])
{
 P=new Point();
P.setX(5);
P.setY(7);
System.out.println(P.Square_distance_from_origin);
}
}

