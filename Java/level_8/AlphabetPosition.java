///// Description /////
/*
Find the position!

When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"
*/

///// Implementation /////
public class AlphabetPosition{
  public static String position(char alphabet){
    int decimal = (int) alphabet;
    int position = decimal-96; // ASCII a(char)=97(decimal) => 97-96=1
    return "Position of alphabet: " + position;
  }

  public static void main(String[] args){
      String str = AlphabetPosition.position('a');
      System.out.println(str); // Prints "Position of alphabet: 1"
  }
}