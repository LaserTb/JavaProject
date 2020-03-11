package OCATEST;

public class Q133 {

}
//Question 133
//
//Given the following class definitions :
//interface MyIface{};
//class A {};
//class B extends A implements MyIface{};
//class C implements MyIface{};
//
//
//and the following object instantiations:
//  A a = new A();
//  B b = new B();
//  C c = new C();
//
//
//Which of the following assignments are legal at compile time?
//
//Please select 1 option.
//
//b = c;
//
//c = b;
//
//MyIface i = c;
//
//c = (C) b;
//
//b = a;
//
//The statements c = b and b = c are illegal, 
//since neither of the classes C and B is a subclass of the other.
//Even though a cast is provided, the statement c = (C) b 
//is illegal because the object referred to by b cannot ever be of type C.