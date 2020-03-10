package OCATEST;

//What is the effect of compiling and running the code shown in exhibit?
public class Q79{
   public static void main (String args []){
      int sum = 0;
      for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
      {
         sum = sum+ i + j;
      }
      System.out.println("Sum = " + sum);
   }
}
//
//Please select 1 option.
//
//Compile time error at line 1.
//
//It will print Sum = 0              ja
//
//It will print Sum = 20
//
//Runtime error.
//
//None of the above.
