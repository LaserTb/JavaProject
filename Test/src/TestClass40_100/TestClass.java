package TestClass40_100;

//Question 44
//
//What will be the result of attempting to compile and run the following program?
//class TestClass{
//   public static void main(String args[]){
//      int i = 0;
//      for (i=1 ;  i<5  ; i++)   //(1)
//      
//      for (i=0 ;       ; i++)       //(2)
//      for (    ; i>5?false:true ;    ){ System.out.println("AA");}     //(3)
//   }
//}
//
//Please select 1 option.
//
//The code will compile without error and will terminate without problems when run.
//
//The code will fail to compile, since the continue can't be used this way.
//
//The code will fail to compile, since the break can't be used this way.
//
//The code will fail to compile, since the for statement in line 2 is invalid.
//
//The code will compile without error but will never terminate.
//
//A continue statement can occur in and only in a for, while or do-while loop. 
//A continue statement means: Forget about the rest of the statements 
//in the loop and start the next iteration. So, for (i=1 ;Â Â i<5Â Â ; i++) continue;
//just increments the value of i up to 5 because of i++.  
//for (i=0 ;Â Â Â Â Â Â Â ; i++) break; iterates only once 
//because of the break so the value of i becomes 0. 
//for (Â Â Â Â ; i<5?false:true ;Â Â Â Â ); never iterates 
//because i is less than 5 (it is 0 because of //2) 
//		and the condition expression is false!  At the end of the code,
//		the value of i is 0.





//Question 45
//
//Assuming that a valid integer will be passed in the command line as first argument, which statements regarding the following code are correct?

//public class TestClass{
//   public static void main(String args[]){
//      int x = Integer.parseInt(args[0]);
//      switch(x){
//          case  x < 5 :   System.out.println("BIG"); break;
//          case  x > 5 :   System.out.println("SMALL");
//         default :    System.out.println("TALL"); break;
//      }
//   }
//}

//Please select 1 option.
//
//BIG will never be followed by SMALL.
//
//SMALL will never follow anything else.
//
//SMALL will always be followed by TALL.
//
//It will not compile.
//
//It will throw an exception at runtime.
//It will say the following when compiled:
//	  
//TestClass.java: incompatible types 
//foundÂ Â Â : boolean 
//required: int case 
//x < 5 :Â Â Â Â Â Â Â Â System.out.println("BIG"); break; 
//  
//TestClass.java: incompatible types 
//foundÂ Â Â : boolean 
//required: int 
//case x > 5 :Â Â Â Â Â Â Â Â System.out.println("SMALL"); 
//
//This is because the type of the case labels must be consistent 
//with the type of the switch condition. Here, switch condition is an int,
//so the case label values must be assignable to the switch condition variable.
//The expression x<5 is of type boolean, which cannot be assigned it x 
//(since it is an int).  
//Further, the expression in a switch statement must be of the type char,
//byte, short, int, Character, Byte, Short, Integer, String, or an enum. 
//It cannot be a boolean. This is another reason the given code will 
//not compile.  Further more, the expression in case must 
//generate a constant value. Here, the value of the expression 
//x<5 is not constant. It is variable. So it is invalid.
//
//
//Question 46
//
//Compared to public, protected, and private accessibilities, default accessibility is....
//
//Please select 1 option.
//
//Less restrictive than public
//
//More restrictive than public, but less restrictive than protected.
//
//More restrictive than protected, but less restrictive than private.
//
//More restrictive than private.
//
//Less restrictive than protected from within a package, and more restrictive than protected from outside a package.
//
//The correct order :
//public < protected < package (or default) < private
//(here, public is least restrictive and private is most restrictive.)
