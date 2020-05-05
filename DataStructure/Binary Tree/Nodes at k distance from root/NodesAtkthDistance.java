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
public class NodesAtkthDistance
{
Node root;
static int max=0;
public static void main(String [] args)
{
NodesAtkthDistance t=new NodesAtkthDistance();
t.root=new Node(1);
t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.left.left=new Node(2);
t.root.left.right=new Node(22);
t.root.right.left=new Node(4);
t.root.right.right=new Node(5);
t.root.right.right.right=new Node(6);
t.root.right.right.right.left=new Node(7);

distance(t.root,2);
}
public static void distance(Node r,int k)
{
if(r==null)
return;
if(k==0)
{
System.out.println(r.data+" ");
return;
}

distance(r.left,k-1);
distance(r.right,k-1);
}
}