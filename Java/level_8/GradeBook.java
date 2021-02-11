///// Description /////
/*
Grasshopper - Grade book

Complete the function so that it finds the mean of the three scores passed to it and 
returns the letter value associated with that grade.

Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	    'F'

Tested values are all between 0 and 100. Theres is no need to check for negative values 
or values greater than 100.
*/

///// Implementation /////
public class GradeBook {
    public static char getGrade(int s1, int s2, int s3) {
      double average = (s1+s2+s3)/3;
      char score = 'n';
      if(90<=average && average<=100){score = 'A';}
      if(80<=average && average<90){score = 'B';}
      if(70<=average && average<80){score = 'C';}
      if(60<=average && average<70){score = 'D';}
      if(0<=average && average<60){score = 'F';}
      return score;
    }
}