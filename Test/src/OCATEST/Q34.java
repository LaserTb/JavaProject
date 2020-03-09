package OCATEST;

//What will the following method return if called with an argument of 7?

public class  Q34{
	
	public static void main(String[] args) {
			
	}

	public static int transformNumber(int n){
   int radix = 2;
   int output = 0;
   output += radix*n;
   radix = output/radix;
   if(output<14){
       return output;
   }
   else{
       output = output*radix/2;
       return output;
   }
//   else {
//       return output/2;
//   }
}
}
//Please select 1 option.
//
//7
//
//14
//
//49
//
//Compilation fails.
//
//The if-else-else is invalid. It should be if , else if, else.
