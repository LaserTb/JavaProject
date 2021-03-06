package OCATEST;

public class Q117 {

}
//Question 117
//
//You want to invoke the overridden method (the method in the base class) 
//from the overriding method (the method in the derived class) named m().
//Which of the following constructs which will let you do that?
//
//Please select 1 option.
//
//super.m();
//
//super.this();
//
//base.m();
//
//parent.m();
//
//super();
//
//Note that calling super(); means you are trying to call the 
//super class's constructor. But you can't call the 
//super class's constructor (or its own constructor) 
//from a method (because by the time a method gets to run, 
//		the object has already been constructed),
//		therefore calling super(); from a method is not valid.
//		super(); can only be the first statement of a constructor.