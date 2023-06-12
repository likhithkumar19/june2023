import java.io.*;
class fileRead
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("D:\\hc\\come.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countVowel=0;
while((i=br.read())!=-1)
{
countVowel++;
}
System.out.println(countVowel);
br.close();
fr.close();
}
}