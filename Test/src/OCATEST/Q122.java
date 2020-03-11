package OCATEST;

public class Q122 {

}
//Question 122
//
//Which of the given statements are correct about the following code?
//
////Filename: TestClass.java
//class TestClass{
//   public static void main(String[] args){
//      A a = new A();
//      B b = new B();
//   };
//}
//class A implements T1, T2{}
//class B extends A implements T1{}
//interface T1 { }
//interface T2 { }
//
//Please select 4 options.
//
//(a instanceof T1) will return true.
//
//(a instanceof T2) will return true.
//
//(b instanceof T1) will return true.
//
//(b instanceof T2) will return true.
//
//(b instanceof A) will return false.
//
//Since A implements both T1 and T2, 1 and 2 are correct.
//b instanceof A will return true as B is a subclass of A. 
//		Note that it is 'A' and not 'a'. ( b instanceof a ) will not compil