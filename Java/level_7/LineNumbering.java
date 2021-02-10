///// Description /////
/*
Testing 1-2-3

Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
Write a function which takes a list of strings and returns each line prepended by the correct number.
The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples:

number(Arrays.asList()) # => []
number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
*/

///// Implementation /////
import java.util.*;

public class LineNumbering{
  public static List<String> number(List<String> lines){
    ArrayList<String> answer = new ArrayList<String>();
    int i = 1;
    for (final String path : lines) {
      answer.add(i + ": " + path);
      i++;
    }
    return answer;
  }
}