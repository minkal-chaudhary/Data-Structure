import java.util.*;

public class BinaryUsingQueue
{
static Queue<String> q1;
public static void main(String [] args)
{
BinaryUsingQueue a=new BinaryUsingQueue();
q1=new LinkedList<String>();
int n=10;
bin(16);
}
public static void bin(int n)
{
q1.add(new String("1"));
//System.out.println(1);
for(int i=0;i<n;i++)
{
String s1=q1.remove();
System.out.println(s1);
String s2=s1;
s1=s1+"0";

q1.add(s1);
s2=s2+"1";
q1.add(s2);

}
}
}