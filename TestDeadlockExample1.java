class TestDeadlockExample1
{
public static void main(String args[])
{
final String resource1="likhith";
final String resource2="kumar";
Thread t1=new Thread()
{
public void run()
{
synchronized(resource1)
{
System.out.println("Thread 1:locked resource 1");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
synchronized(resource2)
{
System.out.println("Thread 2:locked resource 2");
}
}
}
};
Thread t2=new Thread()
{
public void run()
{
synchronized(resource2)
{
System.out.println("Thread 2:locked resource 2");
try 
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
synchronized(resource1)
{
System.out.println("Thread 2:locked resource 2");
}
}
}
};
t1.start();
t2.start();
}
}


