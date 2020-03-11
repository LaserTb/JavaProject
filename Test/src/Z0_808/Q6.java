package Z0_808;

public class Q6 {

}
//Question 6
//
//Given the code fragment:
//abstract class Planet {
//protected void revolve() { // line n1
//}
//abstract void rotate(); // line n2
//}
//class Earth extends Planet {
//void revolve() { // line n3
//}
//protected void rotate() { // line n4
//}
//}
//Which two modifications, made independently, enable the code to compile?
//
//Please select 2 options.
//
//Make the method at line n1 public.
//
//Make the method at line n2 public.
//
//Make the method at line n3 public.              ja
//
//Make the method at line n3 protected.           ja
//
//Make the method at line n4 public.
//
//The program originally provided by the title will compile errors in line n3,
//#because the Earth class inherits
//from the Planet class, and the visibility of its revolve method 
//is modified with protected. To override the
//revolve method in the Earth class, its visibility
//must not be less than protected, so the visibility of the reduce
//method of the Earth class can only be modified with protected or public.