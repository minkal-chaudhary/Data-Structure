class DLinkedList
{
Node head;
public void addFirst(int d)
{
Node n=new Node(d);
if(head==null)
{
head=n;
n.previous=null;
n.next=null;
}
else
{
n.next=head;
head.previous=n;
head=n;
}
}
public void printAll()
{
Node cur=head;
while(cur.next!=null)
{
System.out.print(cur.data+" ");
cur=cur.next;
}
System.out.print(cur.data);
System.out.println();
while(cur!=null)
{
System.out.print(cur.data+" ");
cur=cur.previous;
}
}

public static void main(String [] args)
{
DLinkedList l=new DLinkedList();
l.addFirst(1);
l.addFirst(2);
l.addFirst(3);
l.addFirst(4);
l.addFirst(5);
l.printAll();
}
}
class Node
{
Node next;
Node previous;
int data;
public Node(int d)
{
data=d;
}
}