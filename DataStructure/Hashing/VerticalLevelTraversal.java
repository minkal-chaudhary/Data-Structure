import java.util.*;
import java.util.Map.*;
class Node
{
Node left,right;
int data;
public Node(int d)
{
data=d;
}
}
public class VerticalLevelTraversal
{
static Node root=null;
static HashMap<Integer,ArrayList<Integer>> hm;
public static void main(String [] args)
{
VerticalLevelTraversal t=new VerticalLevelTraversal();
t.root=new Node(50);
t.root.left=new Node(30);
t.root.left.left=new Node(20);
t.root.left.right=new Node(40);
t.root.right=new Node(70);
t.root.right.left=new Node(60);
t.root.right.right=new Node(80);
hm=new HashMap<Integer,ArrayList<Integer>>();
inorder(t.root,0);
System.out.println(hm);
Iterator i=hm.entrySet().iterator();
}
public static void inorder(Node r,int hd)
{
if(r==null)
return;

inorder(r.left,hd-1);
if(hm.containsKey(hd));
ArrayList<Integer> al=hm.get(hd);
if(al==null)
{
al=new ArrayList<Integer>();
}
al.add(r.data);

hm.put(hd,al);
inorder(r.right,hd+1);
}
}


