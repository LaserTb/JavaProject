package OCATEST;

//What would be the result of trying to compile and run the following program?
public class Q180{
   int[] ia = new int[1];
   Object oA[]  = new Object[1];
   boolean bool;
   public static void main(String args[]){
      Q180 test = new Q180();
      System.out.println(test.ia[0] + "  " + test.oA[0]+"  "+test.bool);
   }
}
//
//Please select 1 option.
//
//The program will fail to compile, because of uninitialized variable 'bool'.
//
//The program will throw a java.lang.NullPointerException when run.
//
//The program will print "0 null false".
//
//The program will print "0 null true".
//
//The program will print null and false but will print junk value for ia[0].
//
//Following are the default values that instance variables are initialized with if not initialized explicitly:
//  types (byte, short, char, int, long, float, double) to 0 ( or 0.0 ).
//All Object types to null.
//boolean to false.