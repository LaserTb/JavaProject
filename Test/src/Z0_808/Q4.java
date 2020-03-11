package Z0_808;

public class Q4 {

}
//Question 4
//
//Given the code fragment:
//public static void main(String[] args) {
//Short s1 = 200;
//Integer s2 = 400;
//Long s3 = (long) s1 + s2; // line n1
//String s4 = (String) (s3 * s2); // line n2
//System.out.println("Sum is " + s4);
//}
//What is the result?
//
//Please select 1 option.
//
//Sum is 600
//
//Compilation fails at line n1.
//
//Compilation fails at line n2.
//
//A ClassCastException is thrown at line n1.
//
//A ClassCastException is thrown at line n2.
//
//"(s3 * s2)" of line n2 cannot be cast to a String object because the value and the string do not have any
//inheritance relationship, so a compile error occurs.
//As for the Wrapper class and the basic numerical data type, they can be transformed into each other in the
//correct size of the space, and can also be automatically wrapped.
//If the type of transformation has an inheritance relationship with the object to be transformed, the type of
//the object entity will be checked during the execution phase. If it cannot be transformed, a
//ClassCastException will be thrown.