//implementation of queue using array
//import java.util.*;

class QueueEx
{
static int capacity;
static int rear=0;
static int front=-1;
static int []arr;
static int size=0;
public QueueEx(int c)
{
capacity=c;
arr=new int[c];
}

public static void main(String []args)
{
QueueEx q=new QueueEx(5);
dequeue();
q.enqueue(1);
q.enqueue(3);
q.enqueue(11);
q.printAll();
q.enqueue(31);
q.enqueue(12);

q.dequeue();
q.dequeue();
q.dequeue();
q.enqueue(3);
q.enqueue(14);
q.enqueue(15);
q.printAll();

}
public static void enqueue(int a)
{
if(size==capacity)
{
System.out.println("Queue Overflow");
return; 
}
arr[rear%capacity]=a;
rear++;
size++;
if(front==-1)
front++;
}
public static void dequeue()
{
if(size==0)
{
System.out.println("queue UnderFlow");
return;
}
System.out.println("Dequeued Element :"+arr[front]);
front=front+1;
front=front%capacity;
size--;
}
public static void printAll()
{
if(size==0)
System.out.println(" Empty ");
else
{
int f=front;
for(int i=0;i<size;i++)
{
System.out.print(arr[f%capacity]+",");
f++;
}
System.out.println();
}
}
}

 