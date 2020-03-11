package Z0_808;

public class Q2 {

}
//Question 2
//
//Given the following segment of code :
//ArrayList<Vehicle> myList = new ArrayList<>();
//myList.add(new Motorcycle());
//Which two statements, if either were true, would make the code compile?
//
//Please select 2 options.
//
//Vehicle is an interface that is implemented by the Motorcycle class.
//
//Vehicle and Motorcycle both implement the Transportation interface
//
//Vehicle is a superclass of Motorcycle.
//
//Motorcycle is a superclass of Vehicle.
//
//Vehicle and Motorcycle both extend the Transportation superclass.
//
//Motorcycle is an interface that implements the Vehicle class.
//
//Motorcycle must be a Vehicle (whether extends or implements)
//A would be correct, if B or C in combination were correct.
//Only the combination of B and C is correct.
//D, E, F are independently not correct.

//Question 3
//
//Given the code fragment:
//public static void main(String[] args) {
//String date = LocalDate.parse("2014-05-04").format
//(DateTimeFormatter.ISO_DATE_TIME);
//System.out.println(date);
//}
//What is the result?
//
//Please select 1 option.
//
//May 04, 2014T00:00:00.000
//
//2014-05-04T00:00: 00. 000
//
//5/4/14T00:00:00.000
//
//An exception is thrown at runtime.
//
//Line 7 of the program will use the parse method to generate the LocalDate object, and
//then use the format method of the LocalDate object to convert the LocalDate object into a string, but
//an UnsupportedTemporalTypeException will be thrown at this time.
//The reason is that the DateTimeFormatter of ISO_DATE_TIME cannot be used for the LocalDate object,
//and the LocalDate object does not have time information.
//If you change to use the DateTimeFormatter of ISO_DATE, the output is: 2014-05-04