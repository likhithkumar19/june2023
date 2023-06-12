class TestThread extends Thread
{
public static void main(String args[])
{
TestThread tob=new TestThread();
tob.start();
System.out.println("this code is outside of the thread");
}
public void run()
{
System.out.println("this code is running in a thread");
}
}