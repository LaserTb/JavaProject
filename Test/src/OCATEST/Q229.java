package OCATEST;

public class Q229{
	   public static void main(String args[]){
	      int i = 0;
	      loop :         // 1
	      {
	         System.out.println("Loop Lable line");
	         try{
	            for (  ;  true ;  i++ ){
	               if( i >5) break loop;       // 2
	            }
	         }
	         catch(Exception e){
	            System.out.println("Exception in loop.");
	         }
	         finally{
	            System.out.println("In Finally");      // 3
	         }
	      }
	   }
	}



//Please select 1 option.
//
//Compilation error at line 1 as this is an invalid syntax for defining a label.
//
//Compilation error at line 2 as 'loop' is not visible here.
//
//No compilation error and line 3 will be executed.
//
//No compilation error and line 3 will NOT be executed.
//
//Only the line with the label loop will be printed.
//
//A break without a label breaks the current loop (i.e. no iterations any more)
//and a break with a label tries to pass the control to the given label.
//'Tries to' means that if the break is in a try block and
//the try block has a finally clause associated with it then it will be executed.