package OCATEST;

//Given the following classes, what will be the output of compiling
//and running the class Truck?
class Automobile{
   public void drive() {  System.out.println("Automobile: drive");   }
}

public class Q106 extends Automobile{
   public void drive() {  System.out.println("Truck: drive");   }
   public static void main (String args [ ]){
      Automobile  a = new Automobile();
      Q106 t  = new Q106();
      a.drive(); //1
      t.drive(); //2
//                                 t=(Q106) a;    java.lang.ClassCastException:
      a = t;     //3
      a.drive(); //4
   }
}

//
////End of Code
//
//Please select 1 option.
//
//Compiler error at line 3.
//
//Runtime error at line 3.
//
//It will print:  Automobile: drive Truck: drive Automobile: drive in that order.
//
//It will print: Automobile: drive Truck: drive Truck: drive in that order.
//
//It will print: Automobile: drive Automobile: drive Automobile: drive in that order.
//
//Since Truck is a subclass of Automobile, a = t will be valid
//at compile time as well at runtime.
//But a cast is needed to make t = (Truck) a; work.
//This will be ok at compile time but if at run time 'a' does not refer to
//an object of class Truck, a ClassCastException will be thrown. 
//Now, method to be executed is decided at run time and 
//it depends on the actual class of object referred to by the variable.
//Here, at line 4, variable a refers to an object of class Truck.
//So Truck's drive() will be called which prints Truck: drive. 
//This is polymorphism in action!