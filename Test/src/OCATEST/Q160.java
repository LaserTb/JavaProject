package OCATEST;

public class Q160 {

}
//Question 160
//
//The following code snippet will not compile:
//
//int i = 10;
//System.out.println( i<20 ? out1() : out2() );
//
//Assume that out1 and out2 methods have the following signatures:
//	
//	public void out1(); and public void out2();
//
//Please select 1 option.
//
//True
//
//False
//
//Note that it is not permitted for the second and the third operand of the ?: 
//	operator to be an invocation of a void method.
//
//The type of the expression built using ?: 
//	is determined by the types of the second and the third operands.
//
//   If one of the operands is of type byte and the other 
//   is of type short, then the type of the conditional expression is short.
//   If one of the operands is of type T 
//   where T is byte, short, or char, and the other operand 
//   is a constant expression
//   of type int whose value is representable in type T,
//   then the type of the conditional expression is T.
//   
//Otherwise, binary numeric promotion (5.6.2)
//is applied to the operand types, and the type of the conditional expression is the promoted type of the second and third operands.
//   If one of the second and third operands is of the null type and the type of the other is a reference type, then the type of the conditional expression is that reference type.
//   If the second and third operands are of different reference types, then it must be possible to convert one of the types to the other type (call this latter type T) by assignment conversion (5.2);
//the type of the conditional expression is T. It is a compile-time error if neither type is assignment compatible with the other type.
//
//Note that binary numeric promotion performs unboxing conversion
//(5.1.8) and value set conversion (5.1.13).
//
//
//Question 159
//
//The following code snippet will print 'true'.
//
//short s = Short.MAX_VALUE;
//char c = s;
//System.out.println( c == Short.MAX_VALUE);
//
//Please select 1 option.
//
//true
//
//false
//
//This will not compile because a short VARIABLE can NEVER be assigned to a char without explicit casting. A short CONSTANT can be assigned to a char only if the value fits into a char.
//
//short s = 1; byte b = s; => this will also not compile because although value is small enough to be held by a byte but the Right Hand Side i.e. s is a variable and not a constant.
//final short s = 1; byte b = s; => This is fine because s is a constant and the value fits into a byte.
//final short s = 200; byte b = s; => This is invalid because although s is a constant but the value does not fit into a byte.
//
//Implicit narrowing occurs only for byte, char, short, and int.
//Remember that it does not occur for long, float, or double. So,
//this will not compile: int i = 129L;
//
//
//
//
//Question 158
//
//Which of the following class definitions is/are legal definition(s) of a class that cannot be instantiated?
//class Automobile{
//   abstract void honk();  //(1)
//}
//
//abstract class Automobile{
//   void honk();   //(2)
//}
//
//abstract class Automobile{
//   void honk(){};   //(3)
//}
//
//abstract class Automobile{
//   abstract void honk(){}   //(4)
//}
//
//abstract class Automobile{
//   abstract void honk();   //(5)
//}
//
//Please select 2 options.
//
//1
//
//2
//
//3
//
//4
//
//5
//
//Here are some points to remember:  A class is uninstantiable 
//if the class is declared abstract. If a method has been declared 
//as abstract, it cannot provide an implementation 
//(i.e. it cannot have a method body ) and the class containing 
//that method must be declared abstract). 
//If a method is not declared abstract,
//it must provide a method body 
//(the class can be abstract but not necessarily so).
//If any method in a class is declared abstract, 
//then the whole class must be declared abstract. 
//An class can still be made abstract even if it has no abstract method.