package OCATEST;

public class Q146 {

}
//Question 146
//
//Which of the following statements will compile without any error?
//
//Please select 4 options.
//
//System.out.println("a"+'b'+63);
//
//System.out.println("a"+63);
//
//System.out.println('b'+new Integer(63));
//
//String s = 'b'+63+"a";
//
//String s = 63 + new Integer(10);
//
//+ is overloaded such that if any one of its two operands is a String then it will convert the other operand to a String and create a new string by concatenating the two.
//Therefore, in 63+"a" and "a"+63, 63 is converted to "63" and 'b' +"a" and "a"+'b', 'b' is converted to "b".
//Note that in 'b'+ 63 , 'b' is promoted to an int i.e. 98 giving 161.