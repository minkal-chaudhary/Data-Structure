import java.util.*;

class SortAStack
{
static Stack<Integer> s=new Stack();
public static void main(String [] args)
{
SortAStack rev=new SortAStack();
s.push(44);
s.push(30);
s.push(5);
s.push(9);
System.out.println("Original Stack:"+s);
sort(s);
System.out.println("Sorted Stack :"+s);
}
public static void sort(Stack s)
{
if(s.size()<=0)
{
return;
}
 
int a=(Integer)s.pop();
sort(s);
stacksort(a);
}
public static void stacksort(int a)
{



if(!s.isEmpty()&&(Integer)s.peek()>a)
{
int b=(Integer)s.pop();
stacksort(a);
s.push(b);
}
else
{
s.push(a);
}
}
}