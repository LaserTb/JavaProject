package OCATEST;

public class Q110 {
	public static void main(String[] args) {
		crazyLoop();
	}
	static void crazyLoop(){
		  int c = 0;
		  JACK: while (c < 8){
		    JILL: System.out.println(c);
		    if (c > 3) break JACK; else c++;
		  }

	}}
//What will the following code print?
//void crazyLoop(){
//  int c = 0;
//  JACK: while (c < 8){
//    JILL: System.out.println(c);
//    if (c > 3) break JACK; else c++;
//  }
//}

//Please select 1 option.
//
//It will not compile.
//
//It will throw an exception at runtime.
//
//It will print numbers from 0 to 8
//
//It will print numbers from 0 to 3
//
//It will print numbers from 0 to 4
//
//This is a straight forward loop that contains a labelled break statement. 
//A labelled break breaks out of the loop that is marked with the given label.
//Therefore, a labelled break is used to break out from deeply nested 
//loops to the outer loops.