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
public class TreeTraversal2
{
Node root;
public static void main(String [] args)
{
TreeTraversal2 t=new TreeTraversal2();
t.root=new Node(1);
//t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.right.left=new Node(4);
t.root.right.right=new Node(5);
t.root.right.right.right=new Node(5);
t.root.right.right.right.left=new Node(5);
System.out.println("Height of tree :"+height(t.root));

}
public static int height(Node r)
{
if(r==null)
return 0;
else
{
int left=height(r.left);
int right=height(r.right);
 
if(left>right)
return left+1;
else
return right+1;
}
}
}