package OCATEST;

//Which line(s) of code in the following program will cause a compilation error?
public class Q63{
   static int value = 0; //1
   public static void main(String args[]) //2
   {
//      int 2ndArgument = Integer.parseInt(args[2]); //3
      if( true == 2 > 10 ) //4  
      {
         value = -10;
      }
      else{
//         value =  2ndArgument;
      }
      for( ; value>0; value--) System.out.println("A"); //5
   }
}

//Please select 1 option.
//
//1
//
//2
//
//3  ja
//
//4
//
//5
