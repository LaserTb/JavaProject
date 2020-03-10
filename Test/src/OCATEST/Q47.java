package OCATEST;

//What will be written to the standard output when the following program is run?

public class Q47{
   public static void main(String args[]){
      String blank  = " ";  // one space
      String line = blank + "hello" + blank + blank;
      line.concat("world");
      String newLine  =  line.trim();
      System.out.println((int)(line.length() + newLine.length()));
   }
}

//Please select 1 option.
//
//25
//
//24
//
//23
//
//22
//
//None of the above.
//
//Note that line.concat("world") does not change line itself. 
//It creates a new String object containing " helloÂ Â world" 
//but it is lost because there is no reference to it. Similarly, 
//calling trim() does not change the object itself. So the answer is 8 + 5 = 13 !


//Question 48
//
//Which one of these is a proper definition of a class TestClass that cannot be sub-classed?
//
//Please select 1 option.
//
//final class TestClass { }
//
//abstract class TestClass { }
//
//native class TestClass { }
//
//static class TestClass { }
//
//private class TestClass { }
//
//A final class cannot be subclassed.
//Although declaring a method static usually implies that it is also final, this is not true for classes. An inner class can be declared static and still be extended.
//Note that for classes, final means it cannot be extended, while for methods, final means it cannot be overridden in a subclass.
//The native keyword can only be used on methods, not on classes and or variables.