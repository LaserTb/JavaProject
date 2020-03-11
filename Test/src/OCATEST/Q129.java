package OCATEST;

public class Q129 {

}
//Question 129
//
//Assume the following declarations:
//
//class A{ }
//class B extends A{ }
//class C extends B{ }
//
//class X{
//   B getB(){ return new B(); }
//}
//
//class Y extends X{
//  //method declaration here
//}
//
//Which of the following methods can be inserted in class Y?
//
//Please select 2 options.
//
//public C getB(){ return new B(); }
//
//protected B getB(){ return new C(); }                   ja
//
//C getB(){ return new C(); }                        ja
//
//A getB(){ return new A(); }