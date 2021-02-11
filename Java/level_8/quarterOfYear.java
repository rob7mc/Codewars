///// Description /////
/*
Quarter of the year

Given a month as an integer from 1 to 12, return to which quarter of the year it 
belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is 
part of the second quarter; and month 11 (November), is part of the fourth quarter.
*/

///// Implementation /////
public class quarterOfYear {
    public static int quarterOf(int month) {
        int result = 0;
        if(month == 1|| month == 2|| month == 3){
          result = 1;
        }
        if(month == 4|| month == 5|| month == 6){
          result = 2;
        }
        if(month == 7|| month == 8|| month == 9){
          result = 3;
        }
        if(month == 10|| month == 11|| month == 12){
          result = 4;
        }
        return result;
    }
}