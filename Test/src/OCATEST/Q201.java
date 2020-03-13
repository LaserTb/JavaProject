package OCATEST;

public class Q201 {

}
//Question 201
//
//Which of these statements concerning the charAt() method of the String class are true?
//
//Please select 2 options.
//
//The charAt( ) method can take a char value as an argument.
//
//The charAt( ) method returns a Character object.
//
//The expression char ch = "12345".charAt(3) will assign 3 to ch.
//
//The expression char ch = str.charAt(str.length()) 
//where str is "12345", will assign 3 to ch.
//
//The index of the first character is 0.
//
//It throws StringIndexOutOfBoundsException 
//if passed a value higher than or equal to the length of the string (or less than 0).
//
//It throws ArrayIndexOutOfBoundsException 
//if passed an value higher than or equal to the length of the string (or less than 0).
//
//Since indexing starts with 0, the maximum value that you can pass to charAt is length-1. 
//As per the API documentation for charAt, it throws IndexOutOfBoundsException 
//if you pass an invalid value. 
//Both - ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException, 
//extend IndexOutOfBoundsException and although in practice, 
//the charAt method throws StringIndexOutOfBoundsException, 
//it is not a valid option because the implementation 
//is free to throw some other exception as long as it is an IndexOutOfBoundsException. 
//There are questions in the exam on this aspect