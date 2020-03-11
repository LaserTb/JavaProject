package OCATEST;

public class Q100 {

}
//What is the result of executing the following fragment of code:
//
//boolean b1 = false;
//boolean b2  = false;
//if (b2 = b1 == false){
//   System.out.println("true");
//} else{
//   System.out.println("false");
//}
//
//Please select 1 option.
//
//Compile time error.
//
//It will print true
//
//It will print false
//
//Runtime error.
//
//It will print nothing.
//
//All that if() needs is a boolean, now b1 == false returns true, which is a boolean and 
//since b2 = true is an expression and every expression has a return value 
//(which is the Left Hand Side of the expression), it returns true, 
//which is again a boolean.  FYI: the return value of expressionÂ 
//Â i = 10;Â Â is 10 (an int).