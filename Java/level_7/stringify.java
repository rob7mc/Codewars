///// Description /////
/*
Convert a linked list to a string

If you are attempting this Kata in NASM, the code examples shown below may not be 
relevant at all - please refer to the Sample Tests (written in C) for the exact requirements.

Create a function stringify which accepts an argument list/$list and returns a string 
representation of the list. The string representation of the list starts with the value 
of the current Node, specified by its data/$data/Data property, followed by a whitespace 
character, an arrow and another whitespace character (" -> "), followed by the rest of the list. 
The end of the string representation of a list must always end with null/NULL/None/nil/nullptr/null() 
(all caps or all lowercase depending on the language you are undertaking this Kata in). For example, 
given the following list:

new Node(1, new Node(2, new Node(3)))
... its string representation would be:

"1 -> 2 -> 3 -> null"
And given the following linked list:

new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
... its string representation would be:

"0 -> 1 -> 4 -> 9 -> 16 -> null"
Note that null/NULL/None/nil/nullptr/null() itself is also considered a valid linked list. 
In that case, its string representation would simply be "null"/"NULL"/"None"/"nil"/"nullptr"/@"NULL"/"null()" 
(again, depending on the language).

For the simplicity of this Kata, you may assume that any Node in this Kata may only 
contain non-negative integer values. For example, you will not encounter a Node whose 
data/$data/Data property is "Hello World".
*/

///// Implementation /////
public class Kata {
  public static String stringify(Node list) {
      Node current = list;
      String s = new String();
      while(current != null){
          s = s + current.getData() + " -> ";
          current = current.getNext();
      }
      s = s + "null";
      return s;
  }
}