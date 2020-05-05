import java.util.*;
class LinkedList
{
Node tail;
Node head=null;
static class Node
{
Node next;
int data;
public Node(int d)
{
data=d;
}
}
public void addFirst(int d)
{
Node n=new Node(d);
if(head==null)
head=n;
else
{
n.next=head;
head=n;
}
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
public Node remove(Node n)
{
Node del;
if(head.data==n.data)
{
del=head;
head=head.next;
return del;
}
else
{
Node cur=head;
Node prev=head;
while(cur!=null)
{
if(cur.next.data==n.data)
{
del=cur.next;
cur.next=cur.next.next;
return del;
}
cur=cur.next;
}
}
return null;
}
public void reverse()
{
Node cur=head;
Node prev=null;
Node nex=null;
while(cur!=null)
{
nex=cur.next;
cur.next=prev;
prev=cur;
cur=nex;
}
head=prev;
}
public void swap(int d1,int d2)
{
Node cur=head;
Node prev=null;
Node prevd1=null;
Node nexd1=null;
Node prevd2=null;
Node nexd2=null;
while(cur!=null)
{
if(cur.data==d1)
{
prevd1=prev;
nexd1=cur;
}
if(cur.data==d2)
{
prevd2=prev;
nexd2=cur;
}
prev=cur;
cur=cur.next;
}
Node a=prevd1.next;
prevd1.next=prevd2.next;
prevd2.next=a;
Node b=nexd1.next;
nexd1.next=nexd2.next;
nexd2.next=b;
}
public void merge(LinkedList l1,LinkedList l2)
{
Node h1=l1.head;
Node h2=l2.head;
Node temp=new Node(0);
Node cur=temp;
Node tail=temp.next;
while(h1!=null&&h2!=null)
{
if(h1.data<h2.data)
{
cur.next=h1;
cur=cur.next;
h1=h1.next;

}
else
{
cur.next=h2;
cur=cur.next;
h2=h2.next;
}
}
while(h1!=null)
{
cur.next=h1;
cur=cur.next;
h1=h1.next;
}
while(h2!=null)
{
cur.next=h1;
cur=cur.next;
h1=h1.next;
}
l1.head=temp.next;
l2.head=temp.next;
}

public static void main(String [] args)
{
LinkedList l1=new LinkedList();
l1.addFirst(9);
l1.addFirst(7);
l1.addFirst(5);
l1.addFirst(3);
l1.addFirst(1);
LinkedList l2=new LinkedList();
l2.addFirst(8);
l2.addFirst(6);
l2.addFirst(2);

//l.printAll();
//System.out.println(l.remove(new Node(2)).data);
//l.reverse();
//l1.printAll();
//l.swap(2,5);
//System.out.println();
l1.merge(l1,l2);
l1.printAll();
System.out.println();
l1.printAll();
}
}
