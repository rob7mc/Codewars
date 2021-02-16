///// Description /////
/*
Reduce but Grow

Given a non-empty array of integers, return the result of multiplying the values 
together in order. Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/

///// Implementation /////
public class grow{
  public static int grow(int[] x){
    int answer = 1;
    for(int i=0; i<x.length; i++){
      answer *= x[i];
    }
    return answer;
  }
}