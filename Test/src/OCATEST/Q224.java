package OCATEST;

public class Q224 {

}
//Question 224
//
//Which statements, when inserted in the code below, will cause an exception at run time?
//class B {}
//class B1 extends B {}
//class B2 extends B {}
//public class ExtendsTest{
//  public static void main(String args[]){
//     B b = new B();
//     B1 b1 = new B1();
//     B2 b2 = new B2();
//     // insert statement here
//  }
//}
//
//Please select 1 option.
//
//b = b1;
//
//b2 = b;
//
//b1 = (B1) b;      *exception 
//
//b2 = (B2) b1;
//
//b1 = (B) b1;