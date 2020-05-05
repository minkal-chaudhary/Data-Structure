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
public class BSTInsertion
{
Node root=null;
public static void main(String [] args)
{
BSTInsertion t=new BSTInsertion();
t.root=t.insert(t.root,50);
t.root=t.insert(t.root,30);
t.root=t.insert(t.root,20);
t.root=t.insert(t.root,40);
t.root=t.insert(t.root,70);
t.root=t.insert(t.root,60);
t.root=t.insert(t.root,80);



inorder(t.root);
}
public Node insert(Node r,int key)
{
if(root==null)
{
r=new Node(key);	
System.out.println(key+" inserted succesfully");
return r;
}

if(key>r.data)
{
r.right=insert(r.right,key);
}
else if(key<r.data)
{
r.left=insert(r.left,key);
}
//System.out.println("duplicate data"+key);
return r;
}
public static void inorder(Node r)
{
if(r==null)
return; 
inorder(r.left);
System.out.println(r.data+" ");
inorder(r.right);
}
}
