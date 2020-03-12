package OCATEST;

//What happens when you try to compile and run the following class...
public class Q143{
      public static void main(String[] args) throws Exception{
            int a = Integer.MIN_VALUE;
            int b = -a;
            System.out.println( a+ "   "+b);
      }
}

//Please select 1 option.
//
//It throws an OverFlowException.
//
//It will print two same negative numbers.
//
//It will print two different negative numbers.
//
//It will print one negative and one positive number of same magnitude.
//
//It will print one negative and one positive number of different magnitude.
//
//Note: The following discussion about bit patterns and two's
//complement is not required for the exam but is useful for building 
//the basic understanding.  
//It prints: -2147483648Â Â Â -2147483648  
//This happens because negative integers are stored in 2's complement form 
//(complement the bits and add 1). For example:  
//Integer 1 in binary isÂ Â 00000000 00000000 00000000 00000001Â Â (32 bits)  
//So -1 in binary would be (complement the bits for 1 and add 1) :  
//Step 1 (complement the bits of 1): 11111111 11111111 11111111 11111110Â Â  
//Step 2 (add 1 to step 1): 11111111 11111111 11111111 11111111. 
//Now, let's see what happens in this question:  
//a = Integer.MIN_VALUE = 10000000 00000000 00000000 00000000  
//To get -a, apply the above two steps:  
//Step 1Â Â (complement the bits): 01111111 11111111 11111111 11111111 
//Step 2 (add 1) : 10000000 00000000 00000000 00000000  
//So you got the exact same value that you started with!  
//(Note that you can see the binary form of an integer using Integer.toBinaryString(i)
//		method.)
//
