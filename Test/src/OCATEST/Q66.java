package OCATEST;

//What would be the result of compiling and running the following program?

class Q66{
   public static void main(String args[]){
      int size = 10;
      int[] arr = new int[size];
      for (int i = 0 ; i < size ; ++i) System.out.println(arr[i]);
   }
}

//Please select 1 option.
//
//The code will fail to compile, because the int[] array declaration is incorrect.
//
//The program will compile, but will throw an IndexArrayOutOfBoundsException when run.
//
//The program will compile and run without error, and will print nothing.
//
//The program will compile and run without error and will print null ten times.
//
//The program will compile and run without error and will print 0 ten times.
//
//Elements of Arrays of primitive types are initialized to their default value ( i.e. 0 for integral types, 0.0 for float/double and false for boolean)
//Elements of Arrays of non-primitive types are initialized to null.