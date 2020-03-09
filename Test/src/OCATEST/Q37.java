package OCATEST;

public class Q37 {

	
//	Consider the following method which is called with an argument of 7:
		public void method1(int i){
		   int j = (i*30 - 2)/100;
		   
		   POINT1 : for(;j<10; j++){
		       boolean flag  = false;
		       while(!flag){
			if(Math.random()>0.5) break POINT1;
		       }
		   }
		  while(j>0){
		     System.out.println(j--);
//		     if(j == 4) break POINT1;
		   }
		}
}
//		What will it print?
//		(Assume that Math.random() return a double between 0.0 and 1.0, not including 1.0)
//
//		Please select 1 option.
//
//		It will print 1 and 2
//
//		It will print 1 to N where N is a random number.
//
//		It will not compile.
//
//		It will throw an exception at runtime.
//
//		Remember that a labeled break or continue statement must always exist
//		inside the loop where the label is declared. Here, if(j == 4) break POINT1; 
//		is a labelled break that is occurring in the second loop while 
//			the label POINT1 is declared for the first loop
//}
