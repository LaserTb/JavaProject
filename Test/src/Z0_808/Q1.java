package Z0_808;

public class Q1 {

}


//Given:
//01 class Product {
//02
//03 double price;
//04 }
//05
//06 public class Test {
//07
//08 public void updatePrice(Product product, double price) {
//09 price = price * 2;
//10 product.price = product.price + price;
//11 }
//12
//13 public static void main(String[] args) {
//14
//15 Product prt = new Product();
//16 prt.price = 200;
//17 double newPrice = 100;
//18
//19 Test t = new Test();
//20 t.updatePrice(prt, newPrice);
//21 System.out.println(prt.price + " : " + newPrice);
//22 }
//23 }
//What is the result?
//
//Please select 1 option.
//
//200.0 : 100.0
//
//400.0 : 200.0
//
//400.0 : 100.0
//
//Compilation fails.
//
//This question is in the concept of testing Java forever "pass by value".
//Line 20 also passes the local variable "newPrice" and the object reference variable "prt" as parameters to
//the "updatePrice" method.
//At this point, the values of "newPrice" and "prt" will be copied. The value of "prt" is the reference of the
//Product object (similar to the memory address).
//The "updatePrice" method multiplies the value of "newPrice" by 2 and adds it to the "price" variable of the
//"prt" object.
//Line 21 outputs the value of the "price" variable of the "prt" object and the value of the "newPrice" variable.
//The value of the "price" variable of the "prt" object will be the result of the change when the "updatePrice"
//method is executed, and the "newPrice" variable of the "main" method will not be changed.