package OCATEST;

public class Q183 {

}
//Question 183
//
//If a.equals(b) returns true, b instanceof ClassOfA must always be true.
//
//(Assume that ClassOfA is the name of the class of the variable a.)
//
//Please select 1 option.
//
//True
//
//False
//
//This may not always be correct because equals() method can be overridden. 
//By default, it tests reference assignment, 
//but any subclass of Object is free to redefine equals() as it deems fit. 
//So, it is possible that an equals method may return true even if the class 
//		of the passed object has no relation to this object.





//Question 184
//
//Which of the following are valid code fragments:
//
//Please select 2 options.
//
//new Object[]{ "aaa", new Object(), new ArrayList(), 10};
//
//new Object[]{ "aaa", new Object(), new ArrayList(), {} };
//
//new Object[]{ "aaa", new Object(), new ArrayList(), new String[]{""} };
//
//new Object[1]{ new Object() };
//
//1. An array of objects can store Objects of any class.
//2. Primitives (i.e. int, byte, char, short, boolean, long, double, and float) are NOT objects.
//3. An array (of primitives as well as of objects) is an Object.




//
//Question 185
//
//Given the following class definition:
//class A{
//  protected int i;
//  A(int i) {    this.i = i;    }
// 
//}
//// 1 : Insert code here
//Which of the following would be a valid class that can be inserted at //1 ?
//
//Please select 2 options.
//
//class B {}
//
//class B extends A {}
//
//class B extends A {Â Â B()Â Â {Â Â System.out.println("i = " + i); }Â Â }
//
//class B { B() {} }
//
//Notice that class A does not define a no-argument constructor. Also note that the class B does not define a constructor. Thus, class B relies on the default constructor B(). Class B's default constructor looks like this:
// B() {} //It is not public because class B is not public
//However, Constructors implicitly (if an explicit call to the superclass's constructor is not present) call their superclass's constructor super(). So, class B's default constructor actually looks like this:
// B(){
//  super();
//}
//Now, since class A does not define a no-argument constructor the above code will not compile. However, class B would be correct if changed to:
//class B extends A{
//  B(){
//    super(1); // pass it any integer
//  }
//  // or
//  B(int number){
//    super(number);
//  }
//}
//You could also add a no-argument constructor to class A and leave class B as is.
//
