package OCATEST;

//What will be the result of attempting to compile and run the following program?
public class Q42{
   public static void main(String args[]){
      try{
         RuntimeException re = null ;
         throw re;
      }
      catch(Exception e){
         System.out.println(e);
      }
   }
}

//Please select 1 option.
//
//The code will fail to compile, since RuntimeException cannot be caught by catching an Exception.
//
//The program will fail to compile, since re is null.
//
//The program will compile without error and will print java.lang.RuntimeException when run.
//
//The program will compile without error and will print java.lang.NullPointerException when run.
//
//The program will compile without error and will run and print null.
//
//The try block generates NullPointerException which will be caught by the catch block.