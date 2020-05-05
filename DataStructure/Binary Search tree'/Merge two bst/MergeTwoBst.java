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
public class MergeTwoBst
{
Node root=null;
static ArrayList<Integer> al=new ArrayList<Integer>();
public static void main(String [] args)
{
MergeTwoBst t=new MergeTwoBst();

        t.root = new Node(100); 
        t.root.left = new Node(50); 
        t.root.right = new Node(300); 
        t.root.left.left = new Node(20); 
        t.root.left.right = new Node(70);

MergeTwoBst t1=new MergeTwoBst();

        t1.root = new Node(80);     
        t1.root.left = new Node(40); 
        t1.root.right = new Node(120);
System.out.println("First BST:");
t.inorder1(t.root);
System.out.println("Second BST:");
t1.inorder1(t1.root);
System.out.println();
t1.inorder(t1.root,t);
System.out.println("AFTER merging both:");
t.inorder1(t.root);
}
public void inorder(Node r,MergeTwoBst t)
{
if(r==null)
return;

inorder(r.left,t);
t.root=t.insert(t.root,new Node(r.data));

inorder(r.right,t);
}
public Node insert(Node root,Node r)
{
if(root==null)
return r;

if(root.data>r.data)
root.left=insert(root.left,r);

else if(root.data<r.data)
root.right=insert(root.right,r);
return root;
}
public void inorder1(Node r)
{
if(r==null)
return;

inorder1(r.left);
System.out.println(r.data);
inorder1(r.right);
}
}




