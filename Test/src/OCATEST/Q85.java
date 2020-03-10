package OCATEST;


//What will be the output of the following program?

class Q85{
   public static void main(String[] args) throws Exception{
      try{
         amethod();
         System.out.println("try ");
      }
      catch(Exception e){
         System.out.print("catch ");
      }
      finally   {
         System.out.print("finally ");
      }
      System.out.print("out ");
   }
   public static void amethod(){ }
}

//Please select 1 option.
//
//try finally
//
//try finally out
//
//try out
//
//catch finally out
//
//It will not compile because amethod() does not throw any exception.
//
//Since the method amethod() does not throw any exception,
//try is printed and the control goes to finally which prints finally. 
//After that out is printed.