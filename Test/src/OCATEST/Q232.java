package OCATEST;

public class Q232{
	  public static void main(String[] args){
	    for (int i = 0; i < args.length; i++)   System.out.print(i == 0 ? args[i] : " " + args[i]);
	  }
	}
//Question 232
//
//Consider the following code:
//
//class Test{
//  public static void main(String[] args){
//    for (int i = 0; i < args.length; i++)   System.out.print(i == 0 ? args[i] : " " + args[i]);
//  }
//}
//
//What will be the output when it is run using the following command:
//
//java Test good bye friend!
//
//Please select 1 option.
//
//good bye friend!
//
//good good good
//
//goodgoodgood
//
//good bye
//
//None of the above.
//
//The arguments passed on the command line can be accessed using the args array. The first argument (i.e. good) is stored in args[0], second argument (i.e. bye) is stored in args[1] and so on.
//
//Here, we are passing 3 arguments. Therefore, args.length is 3 and the for loop will run 3 times. For the first iteration, i is 0 and so the first operand of the ternary operator (?) will be returned, which is args[i]. For the next two iterations, " "+args[i] will be returned. Hence, the program will print three strings: "good", " bye", and " friend!" on the same line. 
//
//Note that unlike in C++, program name is not the first parameter in the argument list. Java does not need to know the program name because the .class file name and the java class name are always same (for a public class). So the java code always knows the program name it is running in. So there is no need to pass the program name as the first parameter of the argument list. In C/C++, the binary file name may be anything so the code does not know what binary file it is going to end up in. That's why the program name is also sent (automatically) in parameter list.