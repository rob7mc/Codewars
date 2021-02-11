///// Description /////
/*
Alphabet war

There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters 
and right side letters was too high and the war began.

Task

Write a function that accepts fight string consists of only small letters and 
return who wins the fight. When the left side wins return Left side wins!, when 
the right side wins return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:
 w - 4
 p - 3
 b - 2
 s - 1

The right side letters and their power:
 m - 4
 q - 3
 d - 2
 z - 1

The other letters don't have power and are only victims.

Example

AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!
*/

///// Implementation /////
public class alphabetWar{
    public static String alphabetWar(String fight){
      int right = 0;
      int left = 0;
      for(int i=0; i<fight.length(); i++){
        char letter = fight.charAt(i);
        if(letter == 'z'){right = right+1;}
        if(letter == 'd'){right = right+2;}
        if(letter == 'q'){right = right+3;}
        if(letter == 'm'){right = right+4;}
        
        if(letter == 's'){left = left+1;}
        if(letter == 'b'){left = left+2;}
        if(letter == 'p'){left = left+3;}
        if(letter == 'w'){left = left+4;}
      }
      if(right>left){
        return "Right side wins!";
      }
      else if(right<left){
        return "Left side wins!";
      }
      else{
        return "Let's fight again!";
      }
    }
}