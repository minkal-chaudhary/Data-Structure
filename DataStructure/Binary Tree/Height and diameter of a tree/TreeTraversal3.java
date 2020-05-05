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
public class TreeTraversal3
{
Node root;
public static void main(String [] args)
{
TreeTraversal3 t=new TreeTraversal3();
t.root=new Node(1);
//t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.right.left=new Node(4);
t.root.right.right=new Node(5);
t.root.right.right.right=new Node(5);
t.root.right.right.right.left=new Node(5);
int a=heightLeft(t.root.left)+heightRight(t.root.right)+1;
System.out.println("Diameter of tree :"+a);

}
public static int heightLeft(Node r)
{
if(r==null)
return 0;
else
{
int left=heightLeft(r.left);
int right=heightLeft(r.right);
 
if(left>right)
return left+1;
else
return right+1;
}
}
public static int heightRight(Node r)
{
if(r==null)
return 0;
else
{
int left=heightRight(r.left);
int right=heightRight(r.right);
 
if(left>right)
return left+1;
else
return right+1;
}
}
}
