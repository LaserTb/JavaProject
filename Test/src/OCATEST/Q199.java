package OCATEST;

public class Q199 {

}
//Question 199
//
//Consider the following hierarchy of Exception classes :
//
//java.lang.RuntimeException
//  +-------- IndexOutOfBoundsException
//                  +---------ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
//
//Which of the following statements are correct for a method that 
//can throw ArrayIndexOutOfBounds as well as StringIndexOutOfBounds Exceptions 
//but does not have try catch blocks to catch the same?
//
//Please select 3 options.
//
//The method calling this method will either have to catch these 2 exceptions or declare them in its throws clause.
//
//It is ok if it declares just throws ArrayIndexOutOfBoundsException
//
//It must declare throws ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
//
//It is ok if it declares just throws IndexOutOfBoundsException
//
//It does not need to declare any throws clause.
//
//Note that both the exceptions are RuntimeExceptions so there is no need to catch these. 
//But it is ok even if the method declares them explicitly.