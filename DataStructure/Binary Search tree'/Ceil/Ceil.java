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
public class Ceil
{
static Node root=null;

static int c=-1;

public static void main(String [] args)
{
        Ceil tree=new Ceil();

        tree.root = new Node(8);  
        tree.root.left = new Node(4);  
        tree.root.right = new Node(12);  
        tree.root.left.left = new Node(2);  
        tree.root.left.right = new Node(6);  
        tree.root.right.left = new Node(10);  
        tree.root.right.right = new Node(14);;
     for(int i=0;i<16;i++)
     {
c=-1;
    ceil(root,i);
    System.out.println("Ceil of "+i+":"+c);
    }
 }
public static void ceil(Node r,int key)
{
if(r==null)
{
return;
}
if(r.data==key)
{
c=r.data;
return;
}
if(r.data>key)
{
c=r.data;
ceil(r.left,key);
}
if(r.data<key)
{
ceil(r.right,key);
}
}
}

