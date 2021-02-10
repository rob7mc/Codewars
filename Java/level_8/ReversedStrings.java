///// Description /////
/*
Reversed Strings

Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
*/

///// Implementation /////
public class ReversedStrings{
  public static String solution(String str){
    char[] answer = str.toCharArray();
    int start = 0;
    int end = answer.length-1;
    while(end>start){
      char temp = answer[start];
      answer[start] = answer[end];
      answer[end] = temp;
      end--;
      start++;
    }
    return new String(answer);
  }
}