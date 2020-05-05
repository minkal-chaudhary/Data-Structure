import java.util.*;
//making push operation costly
class StackWithQueue
{
static Queue<Integer> q1=new LinkedList<Integer>();
static Queue<Integer> q2=new LinkedList<Integer>();

public static void push(int a)
{
q2.add(a);
while(!q1.isEmpty())
{
q2.add(q1.remove());
}
Queue<Integer> temp=q1;
q1=q2;
q2=temp;
}
public static int pop()
{
if(q1.isEmpty())
{
System.out.println("Stack UnderFlow");
return -1;
}
else
return q1.remove();
}
public static void print()
{
//System.out.println(q1);
}
public static void main(String [] args)
{
StackWithQueue s=new StackWithQueue();
s.push(10);
s.push(2);
s.push(5);
s.push(11);
s.push(22);
s.push(52);
System.out.println(s.pop());
System.out.println(s.pop());
}
}

