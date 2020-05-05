class KStackUsingArray
{
static int arr[];
static int top[];
static int next[];
static int free;
public KStackUsingArray(int n,int k)
{
top=new int[k];
for(int i=0;i<k;i++)
{
top[i]=-1;
}
arr=new int[n];
next=new int[n];
for(int i=0;i<n-1;i++)
{
next[i]=i+1;
}
next[n-1]=-1;
free=0;
}

public static void main(String [] args)
{
KStackUsingArray k1=new KStackUsingArray(10,3);

k1.push(1,20);
k1.push(1,25);
k1.push(1,30);
k1.push(2,12);
k1.push(2,14);
k1.push(2,16);
k1.push(2,18);
k1.pop(1);
//k1.pop(2);

}
public static void push(int k,int item)
{

if(free==-1)
{
System.out.println("Stack Overflow");
return;
}


int i=free;
free=next[i];

next[i]=top[k];
top[k]=i;

arr[i]=item;


System.out.println(item+" pushed in stack "+k);
}
public static void pop(int k)
{
if(top[k]==-1)
{System.out.println(k+" - Stack Underflow");
return;
}
else
{
int i=top[k];

top[k]=next[i];
next[i]=free;
free=i;
System.out.println("Poped Element from stack "+k+" : is "+arr[i]);
}
}

}