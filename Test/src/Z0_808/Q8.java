package Z0_808;

public class Q8 {

}
//Question 8
//
//fragment:
//01 class X {
//02 public void printFileContent() {
//03 /* code goes here */
//04 throw new IOException();
//05 }
//06 }
//07 public class Test {
//08 public static void main(String[] args) {
//09 X xobj = new X();
//10 xobj.printFileContent();
//11 }
//12 }
//Which two modifications should you make so that the code compiles successfully?
//
//Please select 2 options.
//
//Replace line 8 with:
//public static void main(String[] args) throws Exception {
//
//Replace line 10 with:
//try {
//xobj.printFileContent();
//} catch (Exception e) {
//} catch (IOException e) {
//}
//
//Replace line 2 with:
//public void printFileContent() throws IOException {
//
//Replace line 4 with:
//throw IOException("Exception raised");
//
//At line 11, insert
//throw new IOException();
//
//Line 4 throws a new "IOException" exception in the "printFileContent" method of the X class. IOException
//is a checked exception, so you must write code to handle it.
//Since there is currently no way to handle "IOException" in the "printFileContent" method, you can use
//option C to propagate the "IOException".
//Option D lacks the "new" operator to instantiate an IOException object, but even the "new" operator does
//not help.
//After throwing "IOException" from the "printFileContent" method, other places that use the
//"printFileContent" method must process the "IOException", so you can use option A to propagate the
//"IOException" from the "main" method. Throw out.
//The try-catch usage of option B is wrong. It would be correct to swap "Exception" and "IOException" or
//remove one of the catches.
//Option E can be added to the program, but it does not help.
//
