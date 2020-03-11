package OCATEST;

public class Q136 {

}
//Question 136
//
//Which of these expressions will return true?
//
//Please select 4 options.
//
//"hello world".equals("hello world")               ja
//
//"HELLO world".equalsIgnoreCase("hello world")       ja 
//
//"hello".concat(" world").trim().equals("hello world")    ja 
//
//"hello world".compareTo("Hello world") < 0                   no
//
//"Hello world".toLowerCase( ).equals("hello world")         ja
//
//compareTo() does a lexicographical (like a dictionary) comparison.
//It stops at the first place where the strings have different letters.
//If left hand side is bigger, it returns a positive number
//otherwise it returns a negative number. The value is equal to 
//the difference of their unicode values.
//If there is no difference then it returns zero. In this case, 
//it will return ( 'h' - 'H') which is 32.