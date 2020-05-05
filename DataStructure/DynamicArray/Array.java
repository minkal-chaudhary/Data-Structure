//Dynamic array
import java.io.*;
import java.util.*;


public class Array<T>
{
int index=-1;
int capacity;
int len;
Object[] arr;
public Array()
{
arr=new Object[10];
capacity=10;
}
public Array(int capacity)
{
if(capacity<=0)
{
//throw new ArithimeticException();

}
else
{
this.capacity=capacity;
arr=new Object[capacity];
}
}
public boolean isEmpty()
{
return index>=0;
}
public int size()
{
return index+1;
}
public int capacity()
{return capacity;
}

public void add(T obj)
{
if(index+1>=capacity)
{
capacity*=2;
Object[] newarr=new Object[capacity];
for(int i=0;i<arr.length;i++)
{
newarr[i]=arr[i];
}
arr=newarr;
}
index++;
arr[index]=obj;
}

public T remove(int index1)
{
if(index1<0||index>=capacity)
{
throw new ArrayIndexOutOfBoundsException();
//return null;
}
else
{
Object[]newarr=new Object[capacity];
for(int i=0;i<index1;i++)
{
newarr[i]=arr[i];
}
for(int i=index1+1;i<capacity;i++)
{
newarr[i-1]=arr[i];
}
T obj=(T)arr[index1];
arr=newarr;
index--;
return obj;
}
}
public String toString()
{
String s="";
for(int i=0;i<=index;i++)
s+=arr[i].toString()+" ";
return s;
}
public static void main(String []args)
{
Array<String> arr=new Array<String>(1);
System.out.println(arr.size());
arr.add("1");
System.out.println(arr.size());
arr.add("2");
System.out.println(arr.size());
arr.add("3");
//System.out.println(arr.capacity());
System.out.println(arr);
//System.out.println(arr.remove(-1));
}
}





