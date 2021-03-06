package OCATEST;

//What will the following program print?

public class Q154{
  static String str = "Hello World";
  public static void changeIt(String s){
    s = "Good bye world";
  }
  public static void main(String[] args){
    changeIt(str);
    System.out.println(str);
  }
}

//Please select 1 option.
//
//"Hello World"
//
//"Good bye world"
//
//It will not compile.
//
//It will throw an exception at runtime.
//
//None of the above.
//
//Theoretically, java supports Pass by Value for everything 
//( i.e. primitives as well as Objects).  � � . 
//Primitives are always passed by value. � � . 
//Object "references" are passed by value. 
//So it looks like the object is passed by reference but 
//actually it is the value of the reference that is passed.  
//� � � � � � � � An� � example: � � � � � � � � Object o1 = new Object();
////Let us say, the object is stored at memory location 15000. � � � � � � � �
////Since o1 actually stores the address of the memory location 
//where the object is stored, it contains 15000.  � � � � � � � � Now,
//when you call someMethod(o1); the value 15000 is passed to the method.  
//� � � � � � � � Inside the method someMethod():  � � � � � � � � someMethod
//( Object localVar) { � � � � � � � � � � � � 
//	/*localVar now contains 15000, which means it also points 
//	 * to the same memory location where the object is stored.
//	 *  � � � � � � � � � � � � Therefore, when you call a method 
//	 *  on localVar, it will be executed on the same object. 
//	 *  � � � � � � � � � � � � However, when you change the value 
//	 *  of localVar itself, for example if you do localVar=null,
//	 *   � � � � � � � � � � � � it then starts pointing 
//	 *   to a different memory location. But the original variable 
//	 *   o1 still � � � � � � � � � � � � contains 15000 
//	 *   so it still points to the same object. */
//	� � � � � � � � } � �  This is what happens in the this question. 
//	In the method changeIt(...) you are giving a new value to the local
//	variable but the original reference remains the same.
//	If you need even more detailed explanation, please check http:
//		//www.javaranch.com/campfire/StoryPassBy.jsp
