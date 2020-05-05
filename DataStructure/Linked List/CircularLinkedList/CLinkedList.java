public class CLinkedList
{
Node last;
public void addFirst(int d)
{
Node n=new Node(d);
if(last==null)
{
last=n;
n.next=last;
}
else
{
n.next=last.next;
last.next=n;
System.out.println("first");
}
}
public void addLast(int d)
{
Node n=new Node(d);
if(last==null)
{last=n;
n.next=last;
}
else
{
n.next=last.next;
last.next=n;
last=last.next;
}
}




public void printAll()
{
Node cur=last.next;
while(cur!=last)
{
System.out.print(cur.data+" ");
cur=cur.next;
}
System.out.print(cur.data);
}
public static void main(String []args)
{
CLinkedList l=new CLinkedList();
l.addFirst(1);
l.addFirst(2);
l.addFirst(3);
l.addFirst(4);
l.addLast(5);
l.printAll();
}
}
class Node
{
Node next;
int data;
public Node(int d)
{
data=d;
}
}
