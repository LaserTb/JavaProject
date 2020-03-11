package OCATEST;


//What will be the result of compiling and running the following program ?
class NewException extends Exception {}

class AnotherException extends Exception {}

public class Q101{
    public static void main(String[] args) throws Exception{
//        try{
//            m2();
//        }
//        finally{
//            m3();
//        }
//        catch (NewException e){}
    }

    public static void m2() throws NewException { throw new NewException(); }

    public static void m3() throws AnotherException{ throw new AnotherException(); }

}

//Please select 1 option.
//
//It will compile but will throw AnotherException when run.
//
//It will compile but will throw NewException when run.
//
//It will compile and run without throwing any exceptions.
//
//It will not compile.
//
//None of the above.
//
//Syntax of try/catch/finally is:  try{ } catch(Exception1 e) 
//{... } catch(Exception2 e) {... } ... catch(ExceptionN e) 
//{... } finally { ...Â Â }  With a try, either a catch and
//or finally or both can occur. A try MUST be followed by at least one
//catch or finally. (Unless it is a try with resources statement,
//which is not in scope for this exam.)  In Java 7,
//you can collapse the catch blocks into a single one:
//try {Â Â Â Â Â  Â Â ... } catch (SQLException | IOException | RuntimeException e)
//{Â Â Â Â Â  Â Â //In this block, the class of the actual exception object
//				will be whatever exception is thrown at runtime. 
//				Â Â //But the class of the reference e will be the closest 
//				common super class of all the exceptions in the catch block. 
//				Â Â //In this case, it will be java.lang.Exception because 
//				that is the most specific class that is a super class for 
//				all the three exceptions. Â Â e.printStackTrace(); }
