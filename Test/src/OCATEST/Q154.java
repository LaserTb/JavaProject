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
//( i.e. primitives as well as Objects).  Â Â . 
//Primitives are always passed by value. Â Â . 
//Object "references" are passed by value. 
//So it looks like the object is passed by reference but 
//actually it is the value of the reference that is passed.  
//Â Â Â Â Â Â Â Â AnÂ Â example: Â Â Â Â Â Â Â Â Object o1 = new Object();
////Let us say, the object is stored at memory location 15000. Â Â Â Â Â Â Â Â
////Since o1 actually stores the address of the memory location 
//where the object is stored, it contains 15000.  Â Â Â Â Â Â Â Â Now,
//when you call someMethod(o1); the value 15000 is passed to the method.  
//Â Â Â Â Â Â Â Â Inside the method someMethod():  Â Â Â Â Â Â Â Â someMethod
//( Object localVar) { Â Â Â Â Â Â Â Â Â Â Â Â 
//	/*localVar now contains 15000, which means it also points 
//	 * to the same memory location where the object is stored.
//	 *  Â Â Â Â Â Â Â Â Â Â Â Â Therefore, when you call a method 
//	 *  on localVar, it will be executed on the same object. 
//	 *  Â Â Â Â Â Â Â Â Â Â Â Â However, when you change the value 
//	 *  of localVar itself, for example if you do localVar=null,
//	 *   Â Â Â Â Â Â Â Â Â Â Â Â it then starts pointing 
//	 *   to a different memory location. But the original variable 
//	 *   o1 still Â Â Â Â Â Â Â Â Â Â Â Â contains 15000 
//	 *   so it still points to the same object. */
//	Â Â Â Â Â Â Â Â } Â Â  This is what happens in the this question. 
//	In the method changeIt(...) you are giving a new value to the local
//	variable but the original reference remains the same.
//	If you need even more detailed explanation, please check http:
//		//www.javaranch.com/campfire/StoryPassBy.jsp
