class Node
{
Node left,right;
int data;
public Node(int d)
{
data=d;
}
}
public class TreeTraversal
{
Node root;
public static void main(String [] args)
{
TreeTraversal t=new TreeTraversal();
t.root=new Node(1);
t.root.left=new Node(2);
t.root.right=new Node(3);
t.root.left.left=new Node(4);
t.root.left.right=new Node(5);

System.out.println("PreOrder Traversal of tree :");
preorder(t.root);
System.out.println();

System.out.println("PostOrder Traversal :");
postorder(t.root);
System.out.println();

System.out.println("Inorder Traversal :");
inorder(t.root);
System.out.println();
}
public static void preorder(Node root)
{
if(root==null)
return;

System.out.print(root.data+" ");

preorder(root.left);
preorder(root.right);
}
public static void postorder(Node r)
{
if(r==null)
return;

postorder(r.left);
postorder(r.right);
System.out.print(r.data+" ");
}
public static void inorder(Node r)
{
if(r==null)
return;

inorder(r.left);
System.out.print(r.data+" ");
inorder(r.right);
}
}