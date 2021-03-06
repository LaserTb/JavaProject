package OCATEST;

public class Q62 {

}
//What, if anything, is wrong with the following code?
//
//		//Filename: TestClass.java
//		class TestClass implements T1, T2{
//		   public void m1(){}
//		}
//		interface T1{
//		   int VALUE = 1;
//		   void m1();
//		}
//		interface T2{
//		   int VALUE = 2;
//		   void m1();
//		}
//
//		Please select 1 option.
//
//		TestClass cannot implement them both because it leads to ambiguity.
//
//		There is nothing wrong with the code.
//
//		The code will work fine only if VALUE is removed from one of the interfaces.
//
//		The code will work fine only if m1() is removed from one of the interfaces.
//
//		None of the above.
//
//		Having ambiguous fields or methods does not cause any problems by itself but referring to such fields/methods in an ambiguous way will cause a compile time error. So you cannot call : System.out.println(VALUE); because it will be ambiguous (there are two VALUE definitions). But the following lines are valid :  TestClass tc = new TestClass(); System.out.println(( ( T1) tc).VALUE);  However, explicit cast is not required for calling the method m1() : ( ( T2) tc).m1(); tc.m1() is also fine because even though m1() is declared in both the interfaces, the definition to both resolves unambiguously to only one m1(), which is defined in TestClass.
//
