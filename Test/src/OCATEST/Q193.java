package OCATEST;

public class Q193 {

}
//Question 193
//
//Which of these statements are true?
//
//Please select 2 options.
//
//All classes must explicitly define a constructor.
//
//A constructor can be declared private.
//
//A constructor can declare a return value.
//
//A constructor must initialize all the member variables of a class.
//
//A constructor can access the non-static members of a class.
//
//Constructors need not initialize *all* the member variables of the class.
//A non-final member(i.e. an instance) 
//variable will be assigned a default value if not explicitly initialized.
//
//Question 195
//
//What will be the output of compiling and running the following program:
//class TestClass implements I1, I2{
//   public void m1() { System.out.println("Hello"); }
//   public static void main(String[] args){
//      TestClass tc = new TestClass();
//      ( (I1) tc).m1();
//   }
//}
//interface I1{
//   int VALUE = 1;
//   void m1();
//}
//interface I2{
//   int VALUE = 2;
//   void m1();
//}
//
//Please select 1 option.
//
//It will print Hello.
//
//There is no way to access any VALUE in TestClass.
//
//The code will work fine only if VALUE is removed from one of the interfaces.
//
//It will not compile.
//
//None of the above.
//
//Having ambiguous fields does not cause any problems but referring to such fields in 
//an ambiguous way will cause a compile time error. So you cannot call : 
//	System.out.println(VALUE) as it will be ambiguous.
//	Â Â as there is no ambiguity in referring the field:
//		TestClass tc = new TestClass(); System.out.println(( ( I1) tc).VALUE);
//		So, any of the VALUE fields can be accessed by casting.