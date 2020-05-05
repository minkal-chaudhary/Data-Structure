import java.util.*;
class InfixToPostfix
{
public static String postfix(String s)
{
String result="";
Stack<Character> stack=new Stack();
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
char c=ch[i];
if(c>='a'&&c<='z')
result+=c;
else if(c=='(')
stack.push(c);
else if(c==')')
{
while(!stack.isEmpty()&&stack.peek()!='(')
{
result+=stack.pop();
}
if(stack.peek()!='(')
return "Invalid Expression";
else
stack.pop();
}
else
{
while(!stack.isEmpty()&&prec(c)<=prec(stack.peek()))
{
result+=stack.pop();
}
stack.push(c);
}
System.out.println(stack+"                    "+result);
}
 while (!stack.isEmpty())
  result += stack.pop();

return result;
}
public static int prec(char ch)
{
switch(ch)
{
case '+':return 1;
case '-':return 1;
case '*':return 2;
case '/':return 2;
case '^':return 3;
}
return -1;
}
public static void main(String [] args)
{
String s="a+b*(c^d-e)^(f+g*h)-i";
System.out.println("Infix: "+s);
System.out.println("Steps:  ");
String s1=postfix(s);
System.out.println();
System.out.println("Postfix :"+s1);
System.out.println();
}
}