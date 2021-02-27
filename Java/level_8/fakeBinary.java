///// Description /////
/*
Fake Binary

Given a string of digits, you should replace any digit below 5 with '0' and any 
digit 5 and above with '1'. Return the resulting string.
*/

///// Implementation /////
public class fakeBinary {
    public static String fakeBin(String numberString) {
      char[] c = new char[numberString.length()];
      for (int i=0; i<numberString.length(); i++) { 
            c[i] = numberString.charAt(i); 
      }
      for(int i=0; i<c.length; i++){
        if(c[i] < '5'){
          c[i] = '0';
        }
        else{
          c[i] = '1';
        }
      }
      return new String(c);
    }
}