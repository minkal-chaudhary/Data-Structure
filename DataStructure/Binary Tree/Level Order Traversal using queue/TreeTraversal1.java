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
public class TreeTraversal1
{
Node root;
public static void main(String [] args)
{
TreeTraversal1 t=new TreeTraversal1();
t.root=new Node(1);
//t.root.left=new Node(2);
t.root.right=new Node(3);
//t.root.left.left=new Node(4);
//t.root.left.right=new Node(5);

System.out.println("Level Order Traversal of tree :");
levelorder(t.root);
}
public static void levelorder(Node root)
{
Node temp=root;
Queue<Node> q=new LinkedList<Node>();

//System.out.println(q);
while(temp!=null)
{
System.out.println(temp.data);
if(temp.left!=null)
q.add(temp.left);
else if(temp.right!=null)
q.add(temp.right);
else
q.add(null);
temp=q.remove();
}
}
}