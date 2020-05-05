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
public class SumOfPair
{
static Node root=null;
static ArrayList<Integer> al=new ArrayList<Integer>();
public static void main(String [] args)
{
SumOfPair t=new SumOfPair();

t.root=new Node(15);
t.root.left=new Node(10);
t.root.left.left=new Node(8);
t.root.left.right=new Node(12);
t.root.right=new Node(20);
t.root.right.left=new Node(16);
t.root.right.right=new Node(25);

inorder(t.root);
int target=26;
System.out.println();
System.out.println(al);
int start=0;
int end=al.size()-1;
while(start<end)
{
if(al.get(start)+al.get(end)==target)
{
System.out.println(target+"="+al.get(start)+"+"+al.get(end));
break;
}
if(al.get(start)+al.get(end)>target)
end--;

else if(al.get(start)+al.get(end)<target)
start++;
}
}
public static void inorder(Node r)
{
if(r==null)
return;

inorder(r.left);
al.add(r.data);
System.out.print(r.data+" ");
inorder(r.right);
}
}


