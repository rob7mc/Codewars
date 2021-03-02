///// Description /////
/*
Linked Lists - Push & BuildOneTwoThree

Write push() and buildOneTwoThree() functions to easily update and initialize linked lists. 
Try to use the push() function within your buildOneTwoThree() function.

Here's an example of push() usage:

var chained = null
chained = push(chained, 3)
chained = push(chained, 2)
chained = push(chained, 1)
push(chained, 8) === 8 -> 1 -> 2 -> 3 -> null

The push function accepts head and data parameters, where head is either a node object 
or null/None/nil. Your push implementation should be able to create a new linked list/node 
when head is null/None/nil.

The buildOneTwoThree function should create and return a linked list with three 
nodes: 1 -> 2 -> 3 -> null
*/

///// Implementation /////
class Node {

  int data;
  Node next = null;
  
  Node(final int data) {
    this.data = data;
  }
  
  public static Node push(final Node head, final int data) {
    Node answer = new Node(data);
    answer.next = head;
    return answer;
  }
  
  public static Node buildOneTwoThree() {
    Node current = new Node(3);
    current = push(current, 2);
    current = push(current, 1);
    return current;
  }
}