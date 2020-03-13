package OCATEST;

public class Q215 {

}
//Question 215
//
//Consider :
//class A {}
//class B extends A {}
//class C extends B {}
//
//Which of these boolean expressions correctly identifies when an object 'o' actually 
//refers to an object of class B and not of C?
//
//Please select 2 options.
//
//(o instanceof B) && (!(o instanceof A))
//
//!((o instanceof A) || (o instanceof B))
//
//(o instanceof B) && (!(o instanceof C))
//
//! ( !(o instanceof B) || (o instanceof C))
//
//(o instanceof B) && !((o instanceof A) || (o instanceof C))
//
//The expression (o instanceof B) will return true if the object referred to by o is of type B  
//		or a subtype of B. The expression (! (o instanceof C))
//		will return true unless the object referred to by o is of type C or a subtype of C.
//				Thus, the expression (o instanceof B) && (!(o instanceof C)) 
//				will only return true if the object is of type B or a subtype of B that is not C or a subtype of C.
//						Given objects of classes A, B and C, this expression will only return true for objects of class B.