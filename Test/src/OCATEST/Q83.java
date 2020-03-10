package OCATEST;



//What will be the result of compiling and running the following code?
//class Base{
//   public short getValue(){ return 1; } //1
//}
//class Base2 extends Base{
//   public short getValue(){ return 2; } //2
//}
//public class Q83{
//   public static void main(String[] args){
//      Base b = new Base2();
//      System.out.println(b.getValue()); //3
//   }
//}
//
//What will be the result of compiling and running the following code?
//class Base{
//   public short getValue(){ return 1; } //1
//}
//class Base2 extends Base{
//   public byte getValue(){ return 2; } //2
//}
//public class TestClass{
//   public static void main(String[] args){
//      Base b = new Base2();
//      System.out.println(b.getValue()); //3
//   }
//}
//
//Please select 1 option.
//
//It will print 1
//
//It will print 2.
//
//Compile time error at //1
//
//Compile time error at //2
//
//Compile time error at //3
//
//In case of overriding, the return type of the overriding
//method must match exactly to the return type of the
//overridden method if the return type is a primitive.
//(In case of objects, the return type of the overriding method 
//may be a subclass of the return type of the overridden method.)