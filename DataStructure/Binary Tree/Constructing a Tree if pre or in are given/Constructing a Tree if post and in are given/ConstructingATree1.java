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
public class ConstructingATree1
{
Node root;
static int index=0;
public static void main(String [] args)
{
ConstructingATree1 t=new ConstructingATree1();

int []post={8,4,5,2,6,7,3,1};
int []in={4,8,2,5,1,6,3,7};
int l=in.length;
index=l-1;
t.root=construct(in,post,0,l-1);
preorder(t.root);
}
public static void preorder(Node r)
{
if(r==null)
return;

System.out.print(r.data+" ");
preorder(r.left);

preorder(r.right);
}
public static Node construct(int []in,int []post,int start,int last)
{
if(start>last)
return null;

Node rNode=new Node(post[index]);
index--;

if(start==last)
return rNode;

int mid=search(in,start,last,rNode.data);

rNode.right=construct(in,post,mid+1,last);
rNode.left=construct(in,post,start,mid-1);

return rNode;
}
public static int search(int []in,int start,int last,int ch)
{
for(int i=start;i<=last;i++)
{
if(in[i]==ch)
return i;
}

System.out.println("Not Found");
return 0;
}

}
