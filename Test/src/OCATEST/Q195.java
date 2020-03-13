package OCATEST;

//What will be the output of compiling and running the following program:
public class Q195 implements I1, I2{
   public void m1() { System.out.println("Hello"); }
   public static void main(String[] args){
      Q195 tc = new Q195();
      ( (I1) tc).m1();
   }
}
interface I1{
   int VALUE = 1;
   void m1();
}
interface I2{
   int VALUE = 2;
   void m1();
}

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
//Having ambiguous fields does not cause any problems but referring 
//to such fields in an ambiguous way will cause a compile time error. 
//So you cannot call : System.out.println(VALUE) as it will be ambiguous. 
//Â Â as there is no ambiguity in referring the field: 
//	TestClass tc = new TestClass(); System.out.println(( ( I1) tc).VALUE); 
//	So, any of the VALUE fields can be accessed by casting.