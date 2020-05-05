import java.util.*;

class GNStack
{
public static void main(String [] args)
{
int arr[]={23,4,5,2,44,25};
for(int x:arr)
System.out.print(x+" ");
System.out.println();
greater(arr);
}
public static void greater(int [] arr)
{
Stack stack=new Stack(); 
stack.push(arr[0]);
for(int i=1;i<arr.length;i++)
{
int a=arr[i];
int b=(Integer)stack.peek();

while(!stack.isEmpty())
{
b=(Integer)stack.peek();
if(b<a)
{
System.out.println(b+"  : "+a);
stack.pop();
}
else
{
break;
}
}
stack.push(a);
}

while(!stack.isEmpty())
{
System.out.println(stack.pop()+" :  "+"-1");
}
}
}