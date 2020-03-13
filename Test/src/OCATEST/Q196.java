package OCATEST;

//Given the following classes and declarations, which of these statements about //1 and //2 are true?
class A{
   private int i = 10;
   public void  f(){}
   public void g(){}
}

class B extends A{
   public int i = 20;
   public void g(){}
}

public class Q196{
   A a = new A();//1
   A b = new B();//2
}

//Please select 1 option.
//
//System.out.println(b.i); will print 10.
//
//The statement b.f( ); will give compile time error..
//
//System.out.println(b.i); will print 20
//
//All the above are correct.
//
//None of the above statements is correct.       ja
//
//Remember that variables and static methods are not overridden 
//and so access to variables 
//and static methods is determined at compile time 
//based on the type of the variable 
//(instead of type of the object referred to by the variable, 
//		as is the case with instance methods.) In the given code,
//		if you declare b to be of type B i.e. B b = new B();,
//		you can access b.i.


//
//Question 198
//
//Consider the following class hierarchy
//class A{
//   public void m1() {   }
//}
//class B extends A{
//   public void m1() {   }
//}
//class C extends B{
//   public void m1(){
//      /*  //1
//      ... lot of code.
//      */
//   }
//}
//
//Please select 2 options.
//
//You cannot access class A's m1() from class C for the same object ( i.e. this).
//
//You can access class B's m1() using super.m1() from class C.
//
//You can access class A's m1() using ( (A) this ).m1() from class C.
//
//You can access class A's m1() using super.super.m1() from class C.
//
//super.super is an invalid construct. So, there is no way you can access m1() of A from C.