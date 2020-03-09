package OCATEST;

public class Fortress {
public void openDrawbridge() throws Exception { // p1
try {
throw new Exception("Circle");
} catch (Exception e) {
System.out.print("Opening!");
} finally {
System.out.print("Walls"); // p2
}
}
public static void main(String[] moat) {
//new Fortress().openDrawbridge(); // p3
}
}

//A. The code does not compile because of line p1.
//B. The code does not compile because of line p2.
//C. The code does not compile because of line p3.
//D. The code compiles, but a stack trace is printed at runtime