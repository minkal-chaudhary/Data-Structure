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
public class InorderTreeTraversal
{
Node root;
public static void main(String [] args)
{
InorderTreeTraversal t=new InorderTreeTraversal();
t.root=new Node(1);
//t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.right.left=new Node(4);
t.root.right.right=new Node(5);
t.root.right.right.right=new Node(6);
t.root.right.right.right.left=new Node(7);
System.out.println("Inorder Traversal without recursion of tree :");
inorder(t.root);
}
public static void inorder(Node r)
{
Stack<Node> s=new Stack();

Node current=r;
while(current!=null||s.size()>0)
{
while(current!=null)
{
s.push(current);
current=current.left;
}
if(current==null&&!s.isEmpty())
{
Node a=s.pop();
System.out.println(a.data);
current=a.right;
}

}
}
}