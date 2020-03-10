package OCATEST;

//What will be the result of attempting to compile and run the following class?

public class Q52{
   public static void main(String args[ ] ){
      int i, j, k;
      i = j = k = 9;
      System.out.println(i);
   }
}

//Please select 2 options.
//
//The code will not compile because unlike in c++, operator '=' 
//cannot be chained i.e. a = b = c = d is invalid.
//
//The code will not compile as 'j' is being used before getting initialized.
//
//The code will compile correctly and will display '9' when run.
//
//The code will not compile as 'j' and 'i' are being used before getting initialized.
//
//All the variables will get a value of 9.
//
//Every expression has a value, in this case the value of the expression is 
//the value that is assigned to the right hand side of the equation.
//k has a value of 9 which is assigned to j and then to i.





//Question 54
//
//Consider the directory structure shown in Image 1 that displays available folders and classes and the code given below:
//
//class StockQuote{
//  Stock stock;
//  public StockQuote(Stock s)  {
//  }
//  public void store() throws IOException{
//     Util.store(stock);
//  }
//  public double computePrice(){
//    return Helper.getPricer(stock).price();
//  }
//}
//
//Image1:
//	com
//	 │
//	 ├─	Helper.class
//	 │
//	 └─  enthu
//		  │
//		  ├─ Util.class
//		  │
//		  └─	rad
//				│
//				└─ Stock.class
//		  
//Assuming that the code uses valid method calls, what statements 
//MUST be added to the above class?
//
//Please select 4 options.
//
//package com.enthu.rad.*;nein
//
//import com.enthu.*;ja 
//
//package com.enthu.rad;ja
//
//import com.*;ja
//
//import java.io.*;ja
//
//It is not required to import java.io.* or import java.io.IOException because java.io
//package is imported automatically.


//Question 57
//
//Consider the following directory structure shown in Image 1 that displays available folders and classes and the code given below.
//
//class StockQuote{
//  Stock stock;
//  public StockQuote(Stock s)  {
//  }
//  public double computePrice(){
//    return Helper.getPricer(stock).price();
//  }
//}
//Image1:
//	com
//	 │
//	 ├─	Helper.class
//	 │
//	 └─  enthu
//		  │
//		  ├─ Util.class
//		  │
//		  └─	rad
//				│
//				└─ Stock.class
//		  
//Assuming that the code uses valid method calls, what statements must be added to the above class?
//
//Please select 2 options.
//
//import com.enthu.*;
//
//import com.*.*;
//
//import *.*.*;
//
//import com.*;ja 
//
//import com.enthu.rad.*;ja
//
//import all;
//Since the given class does not have any package declaration, 
//it belongs to the default package and therefore it must 
//import com.Helper and com.enthu.rad.Stock classes.

//
//Question 58
//
//Which of the following statements are valid ?
//
//Please select 2 options.
//
//String[ ] sa = new String[3]{ "a", "b", "c"};nein
//
//String sa[ ] = { "a ", " b", "c"}; ja 
//
//String sa = new String[ ]{"a", "b", "c"};nein
//
//String sa[ ] = new String[ ]{"a", "b", "c"};ja
//
//String sa[ ] = new String[ ] {"a" "b" "c"};nein