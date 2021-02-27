///// Description /////
/*
Reversed sequence

Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 >> [5,4,3,2,1]
*/

///// Implementation /////
public class Sequence{
  public static int[] reverse(int n){
    int[] answer = new int[n];
    int j = n;
    for(int i=0; i<answer.length; i++){
      answer[i] = j;
      j--;
    }
    return answer;
  }
}