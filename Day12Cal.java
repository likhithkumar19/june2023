class cal extends Thread
{
public static void main(String args[])
{
cal obj=new cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("threads inside main are very much");
} 
public void run()
{
System.out.println("Threads are from overriden run method are:");
}
}