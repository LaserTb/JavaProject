package OCATEST;

//What will be printed when the following program is compiled and run?
class Super{
  public int getNumber( int a){
     return 2;
  }
}
public class Q145 extends Super{
  public int getNumber( int a, char ch){
     return 4;
  }
  public static void main(String[] args){
    System.out.println( new Q145().getNumber(4) );
  }
}
//What will be printed?
//
//Please select 1 option.
//
//4
//
//2
//
//It will not compile.
//
//It will throw an exception at runtime.
//
//None of the above.
//
//Note that the parameters of SubClass's getNumber are different than Super's getNumber. 
//So it is not overriding it. So the super class's getNumber() will be called 
//which returns 2.