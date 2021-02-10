///// Description /////
/*
Letterbox Paint-Squad

You and a group of friends are earning some extra money in the school holidays by 
re-painting the numbers on people's letterboxes for a small fee.

Since there are 10 of you in the group each person just concentrates on painting one 
digit! For example, somebody will paint only the 1's, somebody else will paint only the 2's and so on...

But at the end of the day you realise not everybody did the same amount of work.

To avoid any fights you need to distribute the money fairly. That's where this Kata comes in.

Kata Task

Given the start and end letterbox numbers, write a method to return the frequency of all 10 digits painted.

Example

For start = 125, and end = 132

The letterboxes are

125 = 1, 2, 5
126 = 1, 2, 6
127 = 1, 2, 7
128 = 1, 2, 8
129 = 1, 2, 9
130 = 1, 3, 0
131 = 1, 3, 1
132 = 1, 3, 2
The digit frequencies are:

0 is painted 1 time
1 is painted 9 times
2 is painted 6 times
etc...
and so the method would return [1,9,6,3,0,1,1,1,1,1]

Notes

0 < start <= end
In C, the returned value will be free'd.
*/

///// Implementation /////
public class paintLetterBoxes{
  public static int[] paintLetterboxes(final int start, final int end){
    int[] result = new int[10];
    for(int i=start; i<=end; i++){
      int number = i;
      int k = 0;
      while(number > 0){
        if(number%10 == 0){result[0] = result[0] + 1;}
        else if(number%10 == 1){result[1] = result[1] + 1;}
        else if(number%10 == 2){result[2] = result[2] + 1;}
        else if(number%10 == 3){result[3] = result[3] + 1;}
        else if(number%10 == 4){result[4] = result[4] + 1;}
        else if(number%10 == 5){result[5] = result[5] + 1;}
        else if(number%10 == 6){result[6] = result[6] + 1;}
        else if(number%10 == 7){result[7] = result[7] + 1;}
        else if(number%10 == 8){result[8] = result[8] + 1;}
        else if(number%10 == 9){result[9] = result[9] + 1;}
        number = number / 10;
        k = k+1;
      }
    }
    return result;
  }
}