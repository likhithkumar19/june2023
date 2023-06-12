import java.io.CharArrayWriter;
import java.io.FileWriter;
class CharArrayWriterExample
{
public static void main(String args[])throws Exception
{
CharArrayWriter out=new CharArrayWriter();
out.write("Welcome to this training");
FileWriter f1=new FileWriter("D:\\hc\\hello.txt");
FileWriter f2=new FileWriter("D:\\hc\\come.txt");
FileWriter f3=new FileWriter("D:\\hc\\hi.txt");
FileWriter f4=new FileWriter("D:\\hc\\home.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();
System.out.println("Success...");
}
}