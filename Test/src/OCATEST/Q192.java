package OCATEST;

public class Q192 {

}
//Question 192
//
//Consider the following classes :
//class A{ 
//   public void mA(){ };
//}
//
//class B extends A { 
//   public void mA(){ }
//   public void mB() { }
//}
//
//class C extends B { 
//   public void mC(){ }
//}
//and the following declarations:
//A x = new B(); B y = new B(); B z = new C();
//Which of the following calls are virtual calls?
//
//Please select 3 options.
//
//x.mA();
//
//x.mB();
//
//y.mA();
//
//z.mC();
//
//z.mB();
//
//A virtual call means that the call is bound to a method at run time and not at compile time.  In Java, all non-private and non-final instance method calls are virtual. This is important because, at run time, a reference variable may point to an instance of a subclass of the class of the reference.� � The compiler doesn't have the knowledge of the class of the actual object being referred to by the reference variable. If the subclass overrides the method, the call becomes polymorphic because now there are two versions of the method that can be invoked (the base class version and the subclass version). Therefore, the compiler is unable to bind the call to the method of a specific class. Only the JVM has the necessary information to bind the call.� � The JVM knows the class of the actual object and it binds the call to the method of that class. This behavior is called polymorphism.  Thus, in Java, all non-private and non-final instance method calls are potentially polymorphic because there could be multiple versions of the method eligible to be invoked.  In this case, x.mB() is invalid call. It will not even compile because the class of x is A, which does not contain method mB(). Even though the object referred to by x is of class B which does contain mB(). z.mC() is invalid for the same reason.
//
