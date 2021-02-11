///// Description /////
/*
Smallest unused ID

You've got much data to manage and of course you use zero-based and non-negative ID's 
to make each data item unique!

Therefore you need a method, which returns the smallest unused ID for your next new data item...

Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, 
but you don't have to find or remove them!
*/

///// Implementation /////
import java.util.Arrays;

public class unusedID{
    public static int nextId(int[] ids){
        Arrays.sort(ids);     
        int min = 0;   
        for(int i=0; i<ids.length; i++){
            if(ids[i] == min){min++;}
        }
        return min;
    }
}