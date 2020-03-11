package OCATEST;

public class Q127 {

}
//Question 127
//
//Which of the given statements are correct for a method that overrides the following method:
//
//public Set getSet(int a) {...}
//
//Assume that Set is an interface and HashSet is a class that implements Set.
//
//Please select 3 options.
//
//Its return type must be declared as Set.
//
//It may return HashSet.(Assume that HashSet implements Set)
//
//It can declare any Exception in throws clause
//
//It can declare any RuntimeException in throws clause.
//
//It can be abstract.
//
//To override a method in the subclass, the overriding method 
//(i.e. the one in the subclass) MUST HAVE: 
//	.same name .same return type in case of primitives 
//(a subclass is allowed for classes, this is also known as covariant return types).
//.same type and order of parameters .it may throw only those exceptions
//that are declared in the throws clause of the superclass's method or 
//exceptions that are subclasses of the declared exceptions. 
//It may also choose NOT to throw any exception. 
//The names of the parameter types do not matter. For example,
//void methodX(int i) is same as void methodX(int k)