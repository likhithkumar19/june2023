class First
{
public static void main(String[]args)throws Exception
{
Thread t=Thread.currentThread();
System.out.println("currentThread="+t);
t.setName("New threadbylikhith");
t.setPriority(t.getPriority()-1);
System.out.println("currentThread="+t);
System.out.println("NAme="+t.getName());
}
}