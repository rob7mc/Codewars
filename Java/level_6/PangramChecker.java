///// Description /////
/*
Detect Pangram

A pangram is a sentence that contains every single letter of the alphabet at least once. 
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because 
it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. 
Ignore numbers and punctuation.
*/

///// Implementation /////
public class PangramChecker {
  public boolean check(String sentence){
    boolean answer = true;
    boolean[] mark = new boolean[26];
    int index = 0;
    for(int i=0; i<sentence.length(); i++){
      if('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z'){
        index = sentence.charAt(i) - 'A';
      }
      else if('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z'){
        index = sentence.charAt(i) - 'a';
      }
      else{
        continue;
      }
      mark[index] = true;
    }
    
    for(int i=0; i<25; i++){
      if(mark[i] == false){
        answer = false;
      }
    }
    return answer;
  }
}