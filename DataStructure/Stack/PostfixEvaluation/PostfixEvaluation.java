import java.util.Stack;

public class PostfixEvaluation
{
public static int evaluate(String s)
{
Stack<Integer> stack=new Stack();

char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
char c=ch[i];
if(c<=57&&c>=48)
{
stack.push(c-48);
//System.out.println(stack);
}
else
{
int a=stack.pop();
int b=stack.pop();
int d;
switch(c)
{
case '+':
d=b+a;
stack.push(d);
break;
case '-':
d=b-a;
stack.push(d);
break;
case '^':
d=b^a;
stack.push(d);
break;
case '*':
d=b*a;
stack.push(d);
break;
case '/':
d=b/a;
stack.push(d);
break;
}
}
}
return stack.pop();
}
public static void main(String [] args)
{
String s="231*+9-";
int s1=evaluate(s);
System.out.println(s1);
}
}