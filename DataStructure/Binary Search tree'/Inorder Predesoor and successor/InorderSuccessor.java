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
public class InorderSuccessor
{
static Node root=null;
static Node pre;
static Node suc;
public static void main(String [] args)
{
InorderSuccessor t=new InorderSuccessor();
t.root=new Node(50);
t.root.left=new Node(30);
t.root.left.left=new Node(20);
t.root.left.right=new Node(40);
t.root.right=new Node(70);
t.root.right.left=new Node(60);
t.root.right.right=new Node(80);


find(t.root,pre,suc,80);
if(pre!=null)
System.out.println("predecessor "+pre.data);
else
System.out.println("No predecessor");

if(suc!=null)
System.out.println("Successor "+suc.data);
else
System.out.println("No successor");
}
public static void find(Node root,Node p,Node s,int key)
{

if(root==null)
return;
Node r=root;
if(r.data==key)
{
if(r.left!=null)
{
Node temp=r.left;
while(temp.right!=null)
temp=temp.right;

pre=temp;
}
if(r.right!=null)
{
Node temp=r.right;
while(temp.left!=null)
temp=temp.left;

suc=temp;
}
return;
}
if(key<r.data)
{
suc=r;
find(r.left,pre,suc,key);
}
else
{
pre=r;
find(r.right,pre,suc,key);
}
}
}
