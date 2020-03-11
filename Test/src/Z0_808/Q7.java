package Z0_808;

public class Q7 {

}
//Question 7
//
//Given:
//class Vehicle {
//String type = "4W";
//int maxSpeed = 100;
//Vehicle(String type, int maxSpeed) {
//this.type = type;
//this.maxSpeed = maxSpeed;
//}
//}
//class Car extends Vehicle {
//String trans;
//Car(String trans) { // line n1
//this.trans = trans;
//}
//Car(String type, int maxSpeed, String trans) {
//super(type, maxSpeed);
//this(trans); //line n2
//}
//}
//And given the code fragment:
//public static void main(String[] args) {
//Car c1 = new Car("Auto");
//Car c2 = new Car("4W", 150, "Manual");
//System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
//System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
//}
//What is the result?
//
//Please select 1 option.
//
//4W 100 Auto
//4W 150 Manual
//
//Null 0 Auto
//4W 150 Manual
//
//Compilation fails only at line n1
//
//Compilation fails only at line n2
//
//Compilation fails at both line n1 and line n2
//
//The constructor of line n1 is incorrect. Since it does not use the "super" or "this" statement to determine the
//constructor to be executed first, the default will automatically add "super();" to the first line of the
//constructor. However, the Vehicle class inherited by Car does not have the constructor "Vehicle()", so there
//will be compilation errors.
//Line n2 uses the "this" statement, but it is not in the first line of the constructor, so it will compile errors.