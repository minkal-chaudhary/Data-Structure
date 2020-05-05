import java.util.*;
class Node
{
Node left,right;
char data;
public Node(char d)
{
data=d;
}
}
public class ConstructingATree
{
Node root;
static int index=0;
public static void main(String [] args)
{
ConstructingATree t=new ConstructingATree();

char []pre={'A','B','D','E','C','F'};
char []in={'D','B','E','A','F','C'};
int l=in.length;
t.root=construct(in,pre,0,l-1);
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
public static Node construct(char []in,char[]pre,int start,int last)
{

if(start>last)  
return null;

Node rNode=new Node(pre[index]);
index++;


if(start==last)
return rNode;

int mid=search(in,start,last,rNode.data);

rNode.left=construct(in,pre,start,mid-1);
rNode.right=construct(in,pre,mid+1,last);
return rNode;
}
public static int search(char []in,int start,int last,char ch)
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
