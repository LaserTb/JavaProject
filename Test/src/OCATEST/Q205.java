package OCATEST;

public class Q205 {

}
//Question 205
//
//What will the following code print when run?
//
//public class TestClass{
//  public static long main(String[] args){
//     System.out.println("Hello");
//     return 10L;
//  }
//}
//
//Please select 1 option.
//
//Hello
//
//It will not print anything.
//
//It will not compile
//
//It will throw an Error at runtime.
//
//None of the above.
//
//When the program is run, the JVM looks for a method named main() 
//which takes an array of Strings as input and returns nothing 
//(i.e. the return type is void). But in this case, it doesn't find such a method 
//( the given main() method is returning long!) so it gives out the following message: 
//	Error: Main method must return a value of type void in class TestClass, 
//please define the main method as: Â Â Â public static void main(String[] args)