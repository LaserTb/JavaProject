package Z0_808;

public class Q10 {

}
//Question 10
//
//Given the code fragment:
//03 public static void main(String[] args) {
//04 StringBuilder sb = new StringBuilder(5);
//05 String s = "";
//06
//07 if (sb.equals(s)) {
//08 System.out.println("Match 1");
//09 } else if (sb.toString().equals(s.toString())) {
//10 System.out.println("Match 2");
//11 } else {
//12 System.out.println("No Match");
//13 }
//14 }
//What is the result?
//
//Please select 1 option.
//
//Match 1
//
//Match 2
//
//No Match
//
//A NullPointerException is thrown at runtime.
//
//On line 7 of the program, determine if the StringBuilder object and the string object are logically equal.
//They are different types of objects and will never be equal.
//In line 8 of the program, it is determined whether the StringBuilder object is logically equal to the string
//object after being converted into a string.
//They are all empty strings, so they are equal and output "Match 2".