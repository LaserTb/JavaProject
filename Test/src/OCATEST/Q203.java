package OCATEST;

//What will be the result of attempting to compile and run the following class?
public class Q203{
   static String s1 = sM1("a");{
      s1 = sM1("b");
   }
   static{
      s1 = sM1("c");
   }
   public static void main(String args[]){
      Q203 it = new Q203();
   }
   private static String sM1(String s){
      System.out.println(s);  return s;
   }
}

//Please select 1 option.
//
//The program will fail to compile.
//
//The program will compile without error and will print a, c and b in that order when run.
//
//The program will compile without error and will print a, b and c in that order when run.
//
//The program will compile without error and will print c, a and b in that order when run.
//
//The program will compile without error and will print b, c and a in that order when run.
//
//First, static statements/blocks are called IN THE ORDER they are defined. 
//(Hence, a and c will be printed.)
//Next, instance initializer statements/blocks are called IN THE ORDER they are defined. 
//Finally, the constructor is called. So, then it prints b.
