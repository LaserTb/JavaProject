package OCATEST;

public class Q6872 {

}
//The following code snippet will print true.
//
//String str1 = "one";
//String str2 = "two";
//System.out.println( str1.equals(str1=str2) );
//
//Please select 1 option.
//
//True
//
//False
//
//First the value of 'str1' is evaluated (i.e. one).
//Now, before the method is called, the operands are evaluated, 
//so str1 becomes "two". so "one".equals("two") is false.


//
//Question 69
//
//Consider the following two classes defined in two .java files.
////in file /root/com/foo/X.java
//package com.foo;
//public class X{
//  public static int LOGICID = 10;
//  public void apply(int i){
//    System.out.println("applied");
//  }
//}
//
////in file /root/com/bar/Y.java
//package com.bar;
////1  <== INSERT STATEMENT(s) HERE
//public class Y{
//    public static void main(String[] args){
//       System.out.println(X.LOGICID);
//    }
//}
//What should be inserted at //1 so that Y.java can compile without any error?
//
//Please select 1 option.
//
//import static X;
//
//import static com.foo.*;
//
//import static com.foo.X.*;
//
//import com.foo.*;   ja
//
//import com.foo.X.LOGICID;

//
//Question 70
//
//Which of the following are valid declarations of the standard main method?
//
//Please select 2 options.
//
//static void main(String args[ ]) { }
//
//public static int main(String args[ ]) {}
//
//public static void main (String args) { }
//
//final static public void main (String[ ] arguments ) { }
//
//public static void main (String[ ] args) { }
//
//A valid declaration of "the" main() method must be public and static,
//should return void, and should take a single array of Strings as a parameter.
//The order of the static and public keywords is irrelevant. 
//But the return type should always come just before the method name.
//Applying final to the method does not change the method signature. 
//In some versions of JDK, even a private or 
//protected main() method works from command line. 
//However, for the purpose of Java Certification exam, 
//it should be assumed that for the JVM to execute a 
//class using the standard main method, the accessibility 
//of the main method must be public.

//
//Question 71
//
//Which of the following code snippets will print exactly 10?
//
//1.  Object t = new Integer(106);
//    int k = ((Integer) t).intValue()/10;
//    System.out.println(k);
//
//2.  System.out.println(100/9.9);
//
//3.  System.out.println(100/10.0);
//
//4.  System.out.println(100/10);
//
//5.  System.out.println(3 + 100/10*2-13);
//
//Please select 3 options.
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
//1. int k = ((Integer) t).intValue()/10;
//Since both the operands of / are ints, 
//it is a integer division. 
//This means the resulting value is truncated (and not rounded).
//Therefore, the above statement will print 10 and not 11. 
//5. 3 + 100/10*2-13 will be parsed as: 3 + (100/10)*2-13.
//This is because the precedence of / and * is same 
//(and is higher than + and -) and since the expression 
//is evaluated from left to right, the operands are 
//grouped on first come first served basis. 
//[This is not the right terminology but you will be able to 
// answer the questions if you remember this rule.]


//
//Question 72
//
//What will be the output when the following class is compiled and run?
//
//class ScopeTest{
//   static int x = 5;
//   public static void main(String[] args){
//      int x  = ( x=3 ) * 4;  // 1
//      System.out.println(x);
//   }
//}
//
//Please select 1 option.
//
//It will not compile because line //1 cannot be parsed correctly.
//
//It will not compile because x is used before initialization.
//
//It will not compile because there is an ambiguous reference to x.
//
//It will print 12.
//
//It will print 3 .
//
//x is first initialized by x = 3, 
//then the value of this expression (i.e. "x = 3"), which is 3,
//is multiplied by 4 and is again assigned to x. So it prints 12.