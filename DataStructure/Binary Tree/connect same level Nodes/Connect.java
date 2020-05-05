import java.util.*;
class Node
{
Node left,right,next;
int data;
public Node(int d)
{
data=d;
}
}
public class Connect
{
Node root;
static int max=0;
public static void main(String [] args)
{
Connect t=new Connect();
t.root=new Node(1);
t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.left.left=new Node(4);
t.root.left.right=new Node(5);
t.root.right.left=new Node(6);
t.root.right.right=new Node(7);
t.root.right.right.right=new Node(8);
t.root.right.right.right.left=new Node(9);
 
max(t.root);
System.out.println("Right of root"+t.root.next);
System.out.println(t.root.left.next.data);
System.out.println(t.root.right.next);
System.out.println(t.root.left.left.next.data);
System.out.println(t.root.left.right.next.data);
System.out.println(t.root.left.left.next.next.next.data);
}
public static void max(Node r)
{
Queue<Node> q=new LinkedList<Node>();
q.add(r);
int count=q.size();
while(!q.isEmpty())
{
while(count!=0)
{
count--;
Node a=q.remove();
if(count==0)
a.next=null;
else
a.next=q.peek();

if(a.left!=null)
q.add(a.left);
if(a.right!=null)
q.add(a.right);
}
count=q.size();
}
}
}
