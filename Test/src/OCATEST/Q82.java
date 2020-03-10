package OCATEST;

public class Q82 {

}
//What will the following program print when run?
//
//public class TestClass{
//  public static void main(String[] args){
//     try{
//        System.exit(0);
//     }
//     finally{
//         System.out.println("finally is always executed!");
//     }
//  }
//}
//
//Please select 1 option.
//
//It will print  "finally is always executed!"
//
//It will not compile as there is no catch block.
//
//It will not print anything.
//
//An exception will be thrown
//
//None of the above.
//
//finally is always executed (even if you throw an exception 
//in try or catch) but this is the exception to the rule.
//When you call System.exit(...); The JVM exits so there is 
//no way to execute the finally block.