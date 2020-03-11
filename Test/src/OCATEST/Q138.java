package OCATEST;

public class Q138 {

}
//Question 138
//
//Consider the following code:
//class A{
// public XXX m1(int a){
//   return a*10/4-30;
// }
//}
//class A2 extends A{
// public YYY m1(int a){
//   return a*10/4.0;
// }
//}
//What can be substituted for XXX and YYY so that it can compile without any problems?
//
//Please select 1 option.
//
//int, int
//
//int, double
//
//double, double
//
//double, int
//
//Nothing, they are simply not compatible.
//
//Note that when a method returns objects (as opposed to primitives, like in this question), 
//the principle of covariant returns applies. Meaning, 
//the overriding method is allowed to return a subclass of the return type 
//		defined in the overridden method. Thus, if a base class's method is: 
//		public A m(); then a subclass is free to override it with: public A1 m(); 
//if A1 extends A