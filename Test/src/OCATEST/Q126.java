package OCATEST;

public class Q126 {

}
//Question 126
//
//Which of the given options should be inserted at line 1 
//so that the following code can compile without any errors?
//
//package objective1;
//// 1
//public class StaticImports{
//    
//    public StaticImports(){
//    out.println(MAX_VALUE);
//    }
//    
//}
//
//Please select 2 options.
//
//import static java.lang.Integer.*;
//
//static import java.lang.System.out;
//
//static import Integer.MAX_VALUE;
//
//import static java.lang.System.*;
//
//static import java.lang.System.*;
//
//The order of keywords for a static import must be "import static ... ".
//You can either import all the static members using import static
//java.lang.Integer.* or one specific member using import static 
//java.lang.Integer.MAX_VALUE; You must specify the full package name of 
//		the class that you are importing (just like the regular import statement).
//		So, import static Integer.*; is wrong.