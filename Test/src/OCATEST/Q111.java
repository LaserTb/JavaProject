package OCATEST;

public class Q111 {

}
//Question 111
//
//Consider the contents of following two files:
//
////In file A.java
//package a;
//public class A{
//   A(){ }
//   public void  print(){ System.out.println("A"); }
//}
//
////In file B.java
//package b;
//import a.*;
//public class B extends A{
//   B(){ }
//   public void  print(){ System.out.println("B"); }
//   public static void main(String[] args){
//      new B();
//   }
//}
//

//What will be printed when you try to compile and run class B?
//
//Please select 1 option.
//
//It will print A.
//
//It will print B.
//
//It will not compile.
//
//It will compile but will not run.
//
//None of the above.
//
//Note that there is no modifier for A's constructor. 
//So it has default access. This means only classes in package a can use it.
//Also note that class B is in a different package and is extending from A. 
//In B's constructor the compiler will automatically add super() as the first line. 
//But since A() is not accessible in B, this code will not compile.