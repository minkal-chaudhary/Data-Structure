import java.util.*;
class Node
{
Node left,right;
int data;
public Node(int d)
{
data=d;
}
}
public class MaxWidth
{
Node root;
static int max=0;
public static void main(String [] args)
{
MaxWidth t=new MaxWidth();
t.root=new Node(1);
t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.left.left=new Node(2);
t.root.left.right=new Node(2);
t.root.right.left=new Node(4);
t.root.right.right=new Node(5);
t.root.right.right.right=new Node(6);
t.root.right.right.right.left=new Node(7);
 
int x=max(t.root);
System.out.println("Maximum Width:"+x);
}
public static int max(Node r)
{
Queue<Node> q=new LinkedList<Node>();
q.add(r);
int count=q.size();
while(!q.isEmpty())
{
if(max<count)
max=count;
while(count!=0)
{
count--;
Node a=q.remove();
if(a.left!=null)
q.add(a.left);
if(a.right!=null)
q.add(a.right);
}
count=q.size();
}
return max;
}
}
