package Z0_808;

public class Q11 {

}
//Question 11
//
//Given:
//interface Readable {
//public void readBook();
//public void setBookMark();
//}
//abstract class Book implements Readable { // line n1
//public void readBook() {
//}
//// line n2
//}
//class EBook extends Book{ // line n3
//public void readBook(){
//}
//// line n4
//}
//And given the code fragment:
//Book book1 = new EBook();
//book1.readBook();
//Which option enables the code to compile?
//
//Please select 1 option.
//
//Replace the code fragment at line n1 with:
//class Book implements Readable {
//
//At line n2 insert:
//public abstract void setBookMark();
//
//Replace the code fragment at line n3 with:
//abstract class EBook extends Book{
//
//At line n4 insert:
//public void setBookMark() { }
//
//The EBook class will compile with errors because there is no implementation of the setBookMark()
//method.
//Option A, change the abstract class Book to a non-abstract class. As a result, the Book class must
//implement all the methods of the Readable interface, which will cause compilation errors.
//Option B, the setBookMark abstract method is added to the Book abstract class. This abstract method is
//still not implemented in the EBook class, so compile errors will still occur.
//Option C, EBook class abstract, so it doesn't need to implement all the methods of the Readable interface.
//BUT you can not instantiate it !!! ==> Compiler Error
//Option D, implement the setBookMark() method in the EBook class, so that all methods of the
//Readable interface are implemented.