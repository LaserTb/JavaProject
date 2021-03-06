package OCATEST;


//Considering the following program, which of the options are true?
public class A152{
	   public static void main(String args[]){
	      try{
	          if (args.length == 0) return;
	          else throw new Exception("Some Exception");
	      }
	      catch(Exception e){
	          System.out.println("Exception in Main");
	      }
	      finally{
	          System.out.println("The end");
	      }
	   }
	}

//	Please select 2 options.
//
//	If run with no arguments, the program will only print 'The end'.
//
//	If run with one argument, the program will print 'Exception in Main' and 'The end'.
//
//	If run with one argument, the program will only print 'Exception in Main'.
//
//	If run with no arguments, the program will not print anything.
//
//	If run with no arguments, the program will generate a stack trace on the console.
//There are two points to understand here:
//1. Even if the program is executed without any arguments, the 'args' is NOT NULL. In such case it will be initialized to an array of Strings containing zero elements.
//2. The finally block is always executed, no matter how control leaves the try block. Only if, in a try or catch block, System.exit() is called then finally will not be executed.

