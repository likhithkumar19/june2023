class First implements Runnable
{
Thread t;
First()
{
t=new Thread(this,"NEW");
System.out.println("CHILD:"+t);
t.start();
}
public void run()
{
try
{
 for(int i=5;i>0;i--)
{
System.out.println("CHILD:"+i);
Thread.sleep(50);
}
}
catch(InterruptedException e)
{
}
System.out.println("ExITING CHILD");
}
}
class Second
{
public static void main(String args[])
{
new First();
try
{
for(int i=5;i>0;i--)
{
System.out.println("MAIN:" +i);
Thread.sleep(100);
}
}
catch(Exception e)
{
}
System.out.println("Exiting main");
}
}
