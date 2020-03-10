package OCATEST;

public class Q61 {
	public static void main(String[] args) {
//		What will be the output of the following code snippet?

				int a = 1;
				int[] ia = new int[10];
				int b = ia[a];
				int c = b + a;
				System.out.println(b = c);


	}

}
//Please select 1 option.
//
//0
//
//1
//
//2
//
//3
//
//true
//
//false
//
//1. All the elements of an array of primitives are automatically
//initialized by default values, which is 0 for numeric types and false for boolean.
//Therefore, ia[1] is 0.
//2. = is not same as ==. The statement b = c assigns c 
//(whose value is 1) to b. which is then printed.