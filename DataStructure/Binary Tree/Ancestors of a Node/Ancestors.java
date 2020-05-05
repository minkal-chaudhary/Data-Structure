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
public class Ancestors
{
Node root;
static int max=0;
public static void main(String [] args)
{
Ancestors t=new Ancestors();
t.root=new Node(1);
t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.left.left=new Node(2);
t.root.left.right=new Node(2);
t.root.right.left=new Node(4);
t.root.right.right=new Node(5);
t.root.right.right.right=new Node(6);
t.root.right.right.right.left=new Node(7);
 
ancestors(t.root,3);
}
public static boolean ancestors(Node r,int target)
{
if(r==null)
return false;

if(r.data==target)
return true;

if(ancestors(r.left,target)||ancestors(r.right,target))
{
System.out.println(r.data+" ");
return true;
}
return false;
}
}