package OCATEST;

//Consider the following code snippet:
//void m1() throws Exception{
//   try{
//      // line1
//   }
//   catch (IOException e){
//       throw new SQLException();
//   }
//   catch(SQLException e){
//       throw new InstantiationException();
//   }
//   finally{
//      throw new CloneNotSupportedException();   // this is not a RuntimeException.
//   }
//}
//Which of the following statements are true?
//
//Please select 2 options.
//
//If IOException gets thrown at line1, then the whole method will end up throwing SQLException.
//
//If IOException gets thrown at line1, then the whole method will end up throwing CloneNotSupportedException.
//
//If IOException gets thrown at line1, then the whole method will end up throwing InstantiationException.
//
//If no exception is thrown at line1, then the whole method will end up throwing CloneNotSupportedException.
//
//If SQLException gets thrown at line1, then the whole method will end up throwing InstantiationException.
//
//The fundamental concepts at play here are:
//
//1. The Exception that is thrown the last, is the Exception that is thrown by the method to the caller.
//So, when no exception or any exception is thrown at line 1, the control goes to finally or some catch block. Now, even if the catch blocks throws some exception, the control goes to finally. The finally block throws CloneNotSupportedException, so the method ends up throwing CloneNotSupportedException. Other exceptions thrown by the code prior to this point are lost.
//
//2. Exception thrown by a catch cannot be caught by the following catch blocks at the same level. So, if IOException is thrown at line 1, the control goes to first catch which throws SQLException. Now, although there is a catch for SQLException, it won't catch the exception because it is at the same level. So, the control goes to the finally and same process as explained above continues. Any exceptions thrown before this exception are lost.
//



//
//Question 188
//
//What will be the result of attempting to compile and run the following program?
//
//public class TestClass{
//   public static void main(String args[]){
//      Exception e = null;
//      throw e;
//   }
//}
//
//Please select 1 option.
//
//The code will fail to compile.
//
//The program will fail to compile, since it cannot throw a null.
//
//The program will compile without error and will throw an Exception when run.
//
//The program will compile without error and will throw java.lang.NullPointerException when run
//
//The program will compile without error and will run and terminate without any output.
//
//You are throwing an exception and there is no try or catch block, or a throws clause. 
//So it will not compile. If you either put a try catch block or
//declare a throws clause for the method then 
//it will throw a NullPointerException at run time because e is null.
//A method that throws a 'checked' exception i.e.
//an exception that is not a subclass of Error or RuntimeException, 
//either must declare it in throws clause or
//put the code that throws the exception in a try/catch block.