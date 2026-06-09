import java.util.*;
class reversestack
{
public static void main(String[] args)
{
String str = "Hello";
Stack<Character> stack = new Stack<>();
for(char ch : str.toCharArray()) {
stack.push(ch);
}
while(!stack.isEmpty()){
System.out.println(stack.pop());
}
}
}