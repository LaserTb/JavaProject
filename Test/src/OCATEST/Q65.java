package OCATEST;

public class Q65 {

}

//Given the following source code, which of the lines 
//that are commented out may be reinserted without introducing errors?
//abstract class Bang{
// //abstract void f();  //(0)
//   final    void g(){}
// //final    void h(){} //(1)
//   protected static int i;
//   private int j;
//}
//
//final class BigBang extends Bang{
// //BigBang(int n) { m = n; } //(2)
//   public static void main(String args[]){
//      Bang mc = new BigBang();
//   }
//   void h(){}
// //void k(){ i++; } //(3)
// //void l(){ j++; } //(4)
//   int m;
//}
//
//Please select 1 option.
//
//final void h( ) { } //(1)
//
//BigBang(int n) { m = n; }Â Â //(2)
//
//void k( ) { i++; }Â Â Â //(3)
//
//void l( ) { j++; }Â Â //(4)
//
//abstract void f( ) ;Â Â //(0)
//
//Default constructor (having no arguments) is automatically
//created only if the class does not define any constructors. 
//So as soon as //2 is inserted the default constructor will not be created.
