///// Description /////
/*
Convert to Binary

Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.

to_binary(1)  // should return 1
to_binary(5)  // should return 101
to_binary(11) // should return 1011
*/

///// Implementation /////
public class toBinary{
  public static int toBinary(int n){
    String s = Integer.toBinaryString(n);
    int answer = Integer.parseInt(s);
    return answer;
  }
}