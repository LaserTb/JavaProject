package OCATEST;

public class Q157 {

}
//Question 157
//
//Which of the following statements are true?
//
//Please select 1 option.
//
//For any non-null reference o1, the expression (o1 instanceof o1) will always yield true.
//
//For any non-null reference o1, the expression (o1 instanceof Object) will always yield true.
//
//For any non-null reference o1, the expression (o1 instanceof o1) will always yield false.
//
//For any non-null reference o1, the expression (o1 instanceof Object) may yield false.
//
//None of the above.
//
//You should understand here that instanceof operator returns true even if the Right Hand Side is a super class. 
//For example, Â Â 
//class Animal {} Â Â 
//class Dog extends Animal { } Â Â 
//Dog d = new Dog(); 
//Now, d instanceof Animal will be true because even though d is actually an instance of Dog, since Dog is a
//subclass of Animal, Dog IS-A Animal