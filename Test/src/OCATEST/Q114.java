package OCATEST;

//Consider the following class and interface definitions (in separate files):

 class Q114 implements IInt{
   public static void main(String[] args){
      Q114 s = new Q114();  //1
      int j = s.thevalue;       //2
      int k = IInt.thevalue;    //3
      int l = thevalue;         //4
      System.out.println(j +" "+ k+"!"+ l);
   }
}
 interface IInt{
      int thevalue = 0;
}

// Question 114
//
// Consider the following class and interface definitions (in separate files):
//
// public class Sample implements IInt{
//    public static void main(String[] args){
//       Sample s = new Sample();  //1
//       int j = s.thevalue;       //2
//       int k = IInt.thevalue;    //3
//       int l = thevalue;         //4
//    }
// }
// public interface IInt{
//       int thevalue = 0;
// }
//
//
// What will happen when the above code is compiled and run?
//
// Please select 1 option.
//
// It will give an error at compile time at line //1.
//
// It will give an error at compile time at line //2.
//
// It will give an error at compile time at line //3
//
// It will give an error at compile time at line //4.
//
// It will compile and run without any problem.
//
// As a rule, fields defined in an interface are public, static, and final.
// The methods are public. Here, the interface IInt defines thevalue 
// and thus any class that implements this interface gets this field. 
// Therefore, it can be accessed using s.thevalue or just thevalue inside the class.
// Also, since it is static, it can also be accessed using IInt.thevalue 
// or Sample.thevalue.