package OCATEST;




//Question 223
//
//Consider the following class:
//
public class Q223{
   public static void main(String... args){
      for(int i=0; i<3; i++){
         System.out.print(args+" ");
      }
   }
}
//
//What will be printed when the above class is run using the following command line:
//java ArgsPrinter 1 2 3 4
//
//Please select 1 option.
//
//1 2 3
//
//ArgsPrinter 1 2
//
//java ArgsPrinter 1 2
//
//1 1 1
//
//None of these.                         ja
//
//To run a class from the command line, you need a main(String[] )
//method that takes an array of Strings array not just a String. 
//Therefore, an exception will be thrown at runtime saying no main(String[] ) 
//method found. Note that String[] and String... are equivalent 
//and soÂ Â parameter type of String... is also valid for main method.
//When you use String... the compiler allows you to pass any number 
//of String arguments to that method but internally,
//compiler converts String... to String[]. 
//It also wraps the arguments into a String[] and invokes the String[] method.
//The JVM has no idea about String.... It sees only String[].