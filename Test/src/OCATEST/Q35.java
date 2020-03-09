package OCATEST;



//What will the following class print ?

class Q35{
   public static void main(String[] args){
      int a = 10;
      int b = 20;
      a += (a = 4);
      b = b + (b = 5);
      System.out.println(a+ ",  "+b);
   }
}
//
//Please select 1 option.
//
//It will print 8, 25
//
//It will print 4, 5
//
//It will print 14, 5
//
//It will print 4, 25
//
//It will print 14, 25
//
//a += (a =4) is same as a = a + (a=4). First, 
//a's value of 10 is kept aside and (a=4) is evaluated. 
//The statement (a=4) assigns 4 to a and the whole statement
//returns the value 4. Thus, 10 and 4 are added and assigned back to a. 
//Same logic applies to b = b + (b = 5); as well.