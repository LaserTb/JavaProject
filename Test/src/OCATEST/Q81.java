package OCATEST;

public class Q81 {

}
//Which statements regarding the following code are correct ?
//
//
//class Base{
//   void method1() throws java.io.IOException, NullPointerException{
//      someMethod("arguments");
//      // some I/O operations
//   }
//   int someMethod(String str){
//      if(str == null) throw new NullPointerException();
//      else return str.length();
//   }
//}
//public class NewBase extends Base{
//      void method1(){
//           someMethod("args");
//      }
//}
//
//Please select 2 options.
//
//method1 in class NewBase does not need to specify any exceptions.
//
//The code will not compile because RuntimeExceptions cannot be specified in the throws clause.
//
//method1 in class NewBase must at least specify IOException in its throws clause.
//
//method1 in class NewBase must at least specify NullPointerException in its throws clause.
//
//There is no problem with the code.
//
//Overriding method only needs to specify a subset of the list of exception classes the overridden method can throw. A set of no classes is a valid subset of that list.  
//Remember thatÂ Â NullPointerException is a subclass of RuntimeException, while IOException is a subclass of Exception.