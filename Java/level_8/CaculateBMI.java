///// Description /////
/*
Calculate BMI

Write function bmi that calculates body mass index (bmi = weight / height^2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
*/

///// Implementation /////
public class CalculateBMI {
  public static String bmi(double weight, double height) {
    double bmi = weight/(height*height);
    String answer = "";
    if(bmi <=18.5){answer = "Underweight";}
    if(18.5< bmi && bmi <=25.0){answer = "Normal";}
    if(25.0< bmi && bmi <=30.0){answer = "Overweight";}
    if(bmi >30.0){answer = "Obese";}
    return answer;
  }
}