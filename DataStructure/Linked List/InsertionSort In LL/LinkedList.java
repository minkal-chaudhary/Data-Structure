//Insertion sorting on Linked List
class LinkedList
{
Node head;
public static void main(String [] args)
{
LinkedList l=new LinkedList();
l.head=new Node(7);
l.head.next=new Node(5);
l.head.next.next=new Node(5);
l.head.next.next.next=new Node(4);
l.head.next.next.next.next=new Node(3);
l.printAll();
l.insertionSort();
l.printAll();
}
public void printAll()
{
Node cur=head;
while(cur!=null)
{
System.out.print(cur.data+" ");
cur=cur.next;
}
}

public void insertionSort()
{
LinkedList l1=new LinkedList();
l1.head=new Node(0);
System.out.println();
Node cur=this.head;
l1.head.next=new Node(cur.data);

cur=cur.next;   
int count=0;                               
while(cur!=null)
{
count=0;
Node d=l1.head;
while(d.next!=null)
{
if(d.next.data>cur.data)
{
Node n=new Node(cur.data);
n.next=d.next;
d.next=n;
count=1;
break;
}
d=d.next;                                                                             }
if(count==0)
{
Node n=new Node(cur.data);
d.next=n;
}
cur=cur.next;

}
head=l1.head.next;
}
}
class Node
{
int data;
Node next;
public Node(int d)
{
data=d;
}
}
