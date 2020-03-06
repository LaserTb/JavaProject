package OCATEST;

//What will be the result of attempting to compile and run the following class?
//public class Test{
//   public static void main(String args[]){
//      if (true)
//      if (false)
//      System.out.println("True False");
//      else
//      System.out.println("True True");
//   }
//}
//This code can be rewritten as follows:
//public class Test{
//    public static void main(String args[]) {
//        if (true) {
//            if (false) {
//                System.out.println("True False");
//            } else {
//                System.out.println("True True");
//            }
//        }
//    }
//}
//Notice how the last "else" is associated with the last "if" and not the first "if". Now, the first 
//if condition returns true so the next 'if' will be executed. In the second 'if' the condition returns
//false so the else part will be evaluated which prints 'True True'.

//Consider the following class...
class Test{
    void probe(Object x) { System.out.println("In Object"); } //3 

    void probe(Number x) { System.out.println("In Number"); } //2

    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(Long x) { System.out.println("In Long"); } //4
    
    public static void main(String[] args){
        double a = 10; 
        new Test().probe(a); 
    }
}
//What will be printed?
//Here, we have four overloaded probe methods 
//but there is no probe method that takes a double parameter.
//However, a double will be boxed into a Double 
//and class Double extends Number. Therefore, 
//a Double can be passed to the method that takes Number.
//A Double can also be passed to a method that takes Object, 
//but Number is more specific than Object therefore probe(Number ) 
//will be called.  We advise you to run this program and 
//try out various combinations. The exam has questions on this pattern.


