package OCATEST;

public class Q115 {

}
//What will the following code print?
//
//		  int i = 0;
//		  int j = 1;
//		  if( (i++ == 0) & (j++ == 2) ){
//		     i = 12;
//		  }
//		  System.out.println(i+" "+j);
//
//		Please select 1 option.
//
//		1 2
//
//		2 3
//
//		12 2
//
//		12 1
//
//		It will not compile.
//
//		This question is based on 2 concepts:  1. i = ++j; is not same as
//		i = j++; In the case of i = ++j, j is first incremented 
//		and then compared with i. While in the case of i = j++;,
//		j is first compared with i and then incremented.  
//		2. The | and & operators, when applied to boolean operands, 
//		ensure that both the sides are evaluated.
//		This is opposed to || and && operators, 
//		which do not evaluate the Right Hand Side operand 
//		if the result can be known by just evaluating the Left Hand Side.
//		Now, let us see the values of i and j at each step: 
//			int i = 0; int j = 1; if( (i++ == 0) & (j++ == 2) )Â Â Â Â 
//			//compare i with 0 and increment i => returns true and i becomes 1.
//			Evaluate next condition: Â Â Â Â Â Â Â Â 
//			//compare j with 2 and increment j => return false and j becomes 2.
//			Â Â Â Â Â Â Â Â //true & false returns false so i= 12 is not executed.
//			{ Â Â Â i = 12; } System.out.println(i+" "+j)); //print 1 and 2