///// Description /////
/*
Linked Lists - Append

Write an Append() function which appends one linked list to another. The head of the resulting list should be returned.

var listA = 1 -> 2 -> 3 -> null
var listB = 4 -> 5 -> 6 -> null
append(listA, listB) === 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

If both listA and listB are null/NULL/None/nil, return null/NULL/None/nil. 
If one list is null/NULL/None/nil and the other is not, simply return the non-null/NULL/None/nil list.
*/

///// Implementation /////
class Node {

  int data;
  Node next = null;

  Node(final int data) {
    this.data = data;
  }

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public static Node append(Node listA, Node listB) {
    if(listA == null && listB == null){return null;}
    else if(listA == null){return listB;}
    else if(listB == null){return listA;}
    else{
      Node headNode = new Node(0);
      Node node = headNode;
      while(listA != null){
        node.next = listA;
        listA = listA.next;
        node = node.next;
      }
      while(listB != null){
        node.next = listB;
        listB = listB.next;
        node = node.next;
      }
      return headNode.next;
    }
  }
}