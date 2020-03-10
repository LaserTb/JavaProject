package OCATEST;

public class Q75 {

}
//Question 75
//
//Consider the following two classes defined in two java source files.
////in file /root/com/foo/X.java
//package com.foo;
//public class X{
//  public static int LOGICID = 10;
//  public void apply(int i){
//    System.out.println("applied");
//  }
//}
//
////in file /root/com/bar/Y.java
//package com.bar;
////1 <== INSERT STATEMENT(s) HERE
//public class Y{
//    public static void main(String[] args){
//       X x = new X();
//       x.apply(LOGICID);
//    }
//}
//What should be inserted at //1 so that Y.java can compile without any error?
//
//Please select 2 options.
//
//import static X;
//
//import static com.foo.*;
//
//import static com.foo.X.*;      ja
//
//import com.foo.*;              ja
//
//import com.foo.X.LOGICID;