package OCATEST;
public class Q200{
//Consider the following code for the main() method:
public static void main(String[] args) throws Exception{
   int i = 1, j = 10;
   do {
      if (i++ > --j) continue;
   } while (i < 5);
   System.out.println("i=" + i + " j=" + j);
}
}
//What will be the output when the above code is executed?
//
//Please select 1 option.
//
//i=6 j=6
//
//i=5 j=6
//
//i=5 j=5
//
//i=6 j=5
//
//None of these.