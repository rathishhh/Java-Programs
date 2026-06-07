class Node
{
int data;
Node next;
Node head = null;
void insert(int data)
{
Node newNode = new Node();
newNode.data = data;

if(head == null)
{
head = newNode;
}
else
{
Node temp = head;
while(temp.next != null)
{
temp = temp.next;
}
temp.next = newNode;
}
}

void display()
{
Node temp = head;
while(temp != null)
{
System.out.print(temp.data + " ");
temp = temp.next;
}
System.out.println();
}

void reverse()
{
Node prev = null;
Node current = head;
Node next = null;

while(current != null)
{
next = current.next;
current.next = prev;
prev = current;
current = next;
}

head = prev;
}
}

public class listarray
{
public static void main(String[] args)
{
Node list = new Node();

list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);

System.out.println("Before Reverse:");
list.display();

list.reverse();

System.out.println("After Reverse:");
list.display();
}
}