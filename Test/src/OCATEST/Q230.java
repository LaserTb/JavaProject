package OCATEST;

public class Q230 {

}
//Question 230
//
//Which of these statements are true?
//
//Please select 2 options.
//
//A super( <appropriate list of arguments> ) or this( <appropriate list of arguments> ) call must always be provided explicitly as the first statement in the body of the constructor.
//
//If a subclass does not have any declared constructors, the implicit default constructor of the subclass will have a call to super( ).
//
//If neither super( ) or this( ) is declared as the first statement of the body of a constructor, then this( ) will implicitly be inserted as the first statement.
//
//super(<appropriate list of arguments>) can only be called in the first line of the constructor but this(<appropriate list of arguments>) can be called from anywhere.
//
//You can either call super(<appropriate list of arguments>) or this(<appropriate list of arguments>) but not both from a constructor.
//
//Note that calling super(); will not always work because if the super class has defined a constructor with arguments and has not defined a no args constructor then no args constructor will not be provided by the compiler. It is provided only to the class that does not define ANY constructor explicitly.