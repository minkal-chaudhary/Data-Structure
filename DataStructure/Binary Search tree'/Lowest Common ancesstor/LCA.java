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
public class LCA
{
Node root;
public static void main(String [] args)
{
LCA tree=new LCA();

        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(14);

Node d=lca(tree.root,10,14);

System.out.println("LCA:"+d.data);
System.out.println("LCA:"+lca(tree.root,8,14).data);
System.out.println("LCA:"+lca(tree.root,10,22).data);
}
public static Node lca(Node r,int n1,int n2)
{
if(r==null)
return null;
 
if(r.data<n1&&r.data<n2)
r=lca(r.right,n1,n2);
if(r.data>n1&&r.data>n2)
r=lca(r.left,n1,n2);
return r;
}
}