import java.util.*;

class ReverseAStack
{
static Stack<Integer> s=new Stack();
public static void main(String [] args)
{
ReverseAStack rev=new ReverseAStack();
s.push(1);
s.push(30);
s.push(5);
s.push(9);
System.out.println("Original Stack:"+s);
reverse(s);
System.out.println("Reverse Stack :"+s);
}
public static void reverse(Stack s)
{
if(s.size()<=0)
{
return;
}
 
int a=(Integer)s.pop();
reverse(s);
rev(a);
}
public static void rev(int a)
{
if(s.isEmpty())
{
s.push(a);
return;
}
int b=(Integer)s.pop();
rev(a);
s.push(b);
}
}