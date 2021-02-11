///// Description /////
/*
Descending Order

Your task is to make a function that can take any non-negative integer as an argument 
and return it with its digits in descending order. Essentially, rearrange the digits 
to create the highest possible number.

Examples:

Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
*/

///// Implementation /////
public class DescendingOrder {
  public static int sortDesc(final int num) {
    int data = num;
    int[] times = new int[10];
    if(data == 0){ // If the number is 0 then return the number
      return num;
    }
    while (data != 0) { // Put Individual numbers into the times array
        int val = data % 10;
        times[val]++;
        data = data / 10;
    }
    String largestNumber = "";
    for (int i = 9; i >= 0; i--) { // Count Down from 9
        for (int j = 0; j < times[i]; j++) {
            largestNumber += i;
        }
    }
    return Integer.parseInt(largestNumber);
  }
}